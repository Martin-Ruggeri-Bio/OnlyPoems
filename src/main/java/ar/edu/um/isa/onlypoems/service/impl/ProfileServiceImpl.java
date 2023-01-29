package ar.edu.um.isa.onlypoems.service.impl;

import ar.edu.um.isa.onlypoems.domain.Profile;
import ar.edu.um.isa.onlypoems.repository.ProfileRepository;
import ar.edu.um.isa.onlypoems.service.ProfileService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link Profile}.
 */
@Service
@Transactional
public class ProfileServiceImpl implements ProfileService {

    private final Logger log = LoggerFactory.getLogger(ProfileServiceImpl.class);

    private final ProfileRepository profileRepository;

    public ProfileServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public Profile save(Profile profile) {
        log.debug("Request to save Profile : {}", profile);
        return profileRepository.save(profile);
    }

    @Override
    public Profile update(Profile profile) {
        log.debug("Request to save Profile : {}", profile);
        return profileRepository.save(profile);
    }

    @Override
    public Optional<Profile> partialUpdate(Profile profile) {
        log.debug("Request to partially update Profile : {}", profile);

        return profileRepository
            .findById(profile.getId())
            .map(existingProfile -> {
                if (profile.getName() != null) {
                    existingProfile.setName(profile.getName());
                }
                if (profile.getEmail() != null) {
                    existingProfile.setEmail(profile.getEmail());
                }
                if (profile.getHandle() != null) {
                    existingProfile.setHandle(profile.getHandle());
                }

                return existingProfile;
            })
            .map(profileRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Profile> findAll() {
        log.debug("Request to get all Profiles");
        return profileRepository.findAll();
    }

    public Page<Profile> findAllWithEagerRelationships(Pageable pageable) {
        return profileRepository.findAllWithEagerRelationships(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Profile> findOne(Long id) {
        log.debug("Request to get Profile : {}", id);
        return profileRepository.findOneWithEagerRelationships(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Profile : {}", id);
        profileRepository.deleteById(id);
    }
}

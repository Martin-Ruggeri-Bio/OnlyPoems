import { IProfile, NewProfile } from './profile.model';

export const sampleWithRequiredData: IProfile = {
  id: 11865,
  name: 'generating solid Subida',
  email: 'Francisco36@gmail.com',
  handle: 'Configuración compressing SMS',
};

export const sampleWithPartialData: IProfile = {
  id: 74142,
  name: 'soporte',
  email: 'Benito.Reyna@yahoo.com',
  handle: 'discreta',
};

export const sampleWithFullData: IProfile = {
  id: 76041,
  name: 'virtual optical',
  email: 'Maril.Baca98@hotmail.com',
  handle: 'Algodón generating Refinado',
};

export const sampleWithNewData: NewProfile = {
  name: 'León',
  email: 'Emilia6@hotmail.com',
  handle: 'Toallas Blanco',
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);

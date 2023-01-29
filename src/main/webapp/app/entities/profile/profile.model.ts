import { IUser } from 'app/entities/user/user.model';

export interface IProfile {
  id: number;
  name?: string | null;
  email?: string | null;
  handle?: string | null;
  user?: Pick<IUser, 'id' | 'login'> | null;
}

export type NewProfile = Omit<IProfile, 'id'> & { id: null };

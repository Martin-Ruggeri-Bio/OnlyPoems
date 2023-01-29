import dayjs from 'dayjs/esm';
import { IProfile } from 'app/entities/profile/profile.model';

export interface IPost {
  id: number;
  title?: string | null;
  content?: string | null;
  genre?: string | null;
  date?: dayjs.Dayjs | null;
  profile?: Pick<IProfile, 'id' | 'name'> | null;
}

export type NewPost = Omit<IPost, 'id'> & { id: null };

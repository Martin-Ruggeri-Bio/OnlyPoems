import dayjs from 'dayjs/esm';

import { IPost, NewPost } from './post.model';

export const sampleWithRequiredData: IPost = {
  id: 35989,
  title: 'Fantástico',
  content: '../fake-data/blob/hipster.txt',
  genre: 'Soluciones multi-byte',
  date: dayjs('2023-01-24T08:15'),
};

export const sampleWithPartialData: IPost = {
  id: 75723,
  title: 'Agente archivo',
  content: '../fake-data/blob/hipster.txt',
  genre: 'Cambridgeshire',
  date: dayjs('2023-01-23T22:07'),
};

export const sampleWithFullData: IPost = {
  id: 44851,
  title: 'multi-byte payment programming',
  content: '../fake-data/blob/hipster.txt',
  genre: 'Macedonia synthesize Métricas',
  date: dayjs('2023-01-23T20:25'),
};

export const sampleWithNewData: NewPost = {
  title: 'Director',
  content: '../fake-data/blob/hipster.txt',
  genre: 'SDD deposit interface',
  date: dayjs('2023-01-23T17:03'),
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);

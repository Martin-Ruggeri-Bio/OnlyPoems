import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'profile',
        data: { pageTitle: 'onlypoemsApp.profile.home.title' },
        loadChildren: () => import('./profile/profile.module').then(m => m.ProfileModule),
      },
      {
        path: 'post',
        data: { pageTitle: 'onlypoemsApp.post.home.title' },
        loadChildren: () => import('./post/post.module').then(m => m.PostModule),
      },
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ]),
  ],
})
export class EntityRoutingModule {}

import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';

import { CandidateListComponent } from './components/candidate-list/candidate-list.component';
import { BallotComponent } from './components/ballot/ballot.component';
import { TallyComponent } from './components/tally/tally.component';

const routes: Routes = [
  { path: '', redirectTo: '/nomination', pathMatch: 'full' },
  { path: 'nomination', component: CandidateListComponent },
  { path: 'ballot', component: BallotComponent },
  { path: 'tally', component: TallyComponent },
];

@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

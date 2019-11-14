import { Component, OnInit } from '@angular/core';
import { CandidateService } from 'src/app/services/candidate.service';

@Component({
  selector: 'app-ballot',
  templateUrl: './ballot.component.html',
  styleUrls: ['./ballot.component.css']
})
export class BallotComponent implements OnInit {

  constructor(private candidateService: CandidateService) { }

  ngOnInit() {
  }

}

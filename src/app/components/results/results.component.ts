import { Component, OnInit } from '@angular/core';
import { CandidateService } from 'src/app/services/candidate.service';

@Component({
  selector: 'app-results',
  templateUrl: './results.component.html',
  styleUrls: ['./results.component.css']
})
export class ResultsComponent implements OnInit {

  constructor(private candidateService: CandidateService) { }

  ngOnInit() {
  }

}

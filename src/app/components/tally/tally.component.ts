import { Component, OnInit } from '@angular/core';
import { CandidateService } from 'src/app/services/candidate.service';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-tally',
  templateUrl: './tally.component.html',
  styleUrls: ['./tally.component.css']
})
export class TallyComponent implements OnInit {
  voters = new FormControl(0);
  numMembers: number;

  constructor(private candidateService: CandidateService) { }

  ngOnInit() {
    this.candidateService.getMemberCount().subscribe(count => this.numMembers = count);
  }

}

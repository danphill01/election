import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import * as moment from 'moment';
import { environment } from '../../environments/environment';

export interface Member {
  id: number;
  name: string;
  joinDate: Date;
  membershipType: string;
}

@Injectable({
  providedIn: 'root'
})
export class CandidateService {
  static readonly url: string = `${environment.apiUrl}/candidates`;
  candidates: Member[] = [];

  constructor(private httpClient: HttpClient) {
    this.getCandidates().subscribe(members => this.candidates = members);
  }

  getCandidates(): Observable<[Member]> {
    return this.httpClient.get(CandidateService.url) as Observable<[Member]>;
  }

  getYearsSinceJoining(memberId: number) {
    const candidate = this.candidates.find(m => m.id === memberId);
    return moment().diff(candidate.joinDate, 'years', true).toFixed(1);
  }
}

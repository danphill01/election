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
  isNominated?: boolean;
  votes?: number;
  isElected?: boolean;
}

@Injectable({
  providedIn: 'root'
})
export class CandidateService {
  static readonly url: string = `${environment.apiUrl}/candidates`;
  candidates: Member[] = [];
  count = 0;
  isNewExceptionalMembers = false;

  constructor(private httpClient: HttpClient) {
    this.getCandidatesFromServer().subscribe(members => this.candidates = members);
  }

  getCandidatesFromServer(): Observable<[Member]> {
    return this.httpClient.get(CandidateService.url) as Observable<[Member]>;
  }

  getCandidates(): Member[] {
    return this.candidates;
  }

  getMemberCount(): Observable<number> {
    return this.httpClient.get(`${environment.apiUrl}/members/count`) as Observable<number>;
  }

  setMemberCount(count: number) {
    this.count = count;
    this.isNewExceptionalMembers = false;
    this.candidates.forEach(m => {
      m.isElected = m.votes >= 0.5 * count;
      this.isNewExceptionalMembers = this.isNewExceptionalMembers || m.isElected;
    });
  }

  getYearsSinceJoining(memberId: number) {
    const candidate = this.candidates.find(m => m.id === memberId);
    return moment().diff(candidate.joinDate, 'years', true).toFixed(1);
  }

  areCandidatesNominated() {
    return this.candidates.findIndex(m => m.isNominated === true) !== -1;
  }

  areCandidatesElected() {
    return this.isNewExceptionalMembers === true;
  }

  selectAllCandidates() {
    this.candidates.forEach(m => m.isNominated = true);
  }

  initializeVotes() {
    this.candidates.forEach(m => m.votes = 0);
  }

  increaseTally(id: number) {
    const candidate = this.candidates.find(m => m.id === id);
    if (candidate.votes) {
      candidate.votes += 1;
    } else {
      candidate.votes = 1;
    }
  }
}

package io.catalyte.training.elections.services;

import io.catalyte.training.elections.models.Member;
import io.catalyte.training.elections.models.MemberUI;
import java.util.List;
import org.springframework.stereotype.Service;

public interface MemberService {
  List<Member> getCandidates();

  void addMember(MemberUI newMember);
}

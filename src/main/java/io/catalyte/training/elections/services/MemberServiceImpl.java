package io.catalyte.training.elections.services;

import io.catalyte.training.elections.models.Member;
import io.catalyte.training.elections.models.Member.Type;
import io.catalyte.training.elections.models.MemberUI;
import io.catalyte.training.elections.repositories.MemberRepository;
import java.util.Calendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
  @Autowired
  MemberRepository memberRepository;

  @Override
  public List<Member> getCandidates() {
    Calendar now = Calendar.getInstance();
    now.add(Calendar.YEAR, -2);
    return memberRepository.findAllByMembershipTypeAndJoinDateBeforeAndServiceHoursGreaterThanEqual(
      Type.REGULAR, now.getTime(), 100);
  }

  @Override
  public Long getMemberCount() {
    return memberRepository.count();
  }

  @Override
  public void addMember(MemberUI newMember) {
    Member member = new Member(newMember.getName(), newMember.getJoinDate());
    memberRepository.save(member);
  }
}

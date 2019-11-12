package io.catalyte.training.elections.repositories;

import io.catalyte.training.elections.models.Member;
import io.catalyte.training.elections.models.Member.Type;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
  List<Member> findAllByMembershipTypeAndJoinDateBeforeAndServiceHoursGreaterThanEqual(
    Type membershipType, Date joinDateCutoff, Integer minServiceHours);
}

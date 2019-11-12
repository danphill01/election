package io.catalyte.training.elections.controllers;

import io.catalyte.training.elections.models.Member;
import io.catalyte.training.elections.models.MemberUI;
import io.catalyte.training.elections.services.MemberService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class MemberController {
  @Autowired
  MemberService memberService;

  @GetMapping("/candidates")
  public List<Member> getMemberList() {
    return memberService.getCandidates();
  }

  @PostMapping("/members")
  @ResponseStatus(HttpStatus.CREATED)
  public String createMember(@RequestBody MemberUI newMember){
    memberService.addMember(newMember);
    return "Member Created";
  }
}

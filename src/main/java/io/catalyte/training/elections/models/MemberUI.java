package io.catalyte.training.elections.models;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class MemberUI {
  public enum Type {
    REGULAR, EXCEPTIONAL, GROUP_LEADER
  }

  private long id;
  private String name;
  private Type membershipType;
  private Integer serviceHours;
  @DateTimeFormat(iso = ISO.DATE)
  private Date joinDate;

  protected MemberUI() {
  }

  public MemberUI(String name, Date joinDate) {
    this.name = name;
    this.joinDate = joinDate;
    this.membershipType = Type.REGULAR;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Type getMembershipType() {
    return membershipType;
  }

  public void setMembershipType(Type membershipType) {
    this.membershipType = membershipType;
  }

  public Integer getServiceHours() {
    return serviceHours;
  }

  public void setServiceHours(Integer serviceHours) {
    this.serviceHours = serviceHours;
  }

  public Date getJoinDate() {
    return joinDate;
  }

  public void setJoinDate(Date joinDate) {
    this.joinDate = joinDate;
  }
}

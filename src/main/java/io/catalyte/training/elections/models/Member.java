package io.catalyte.training.elections.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Member implements Serializable {
  private static final long serialVersionUID = -5729383417892377329L;
  public enum Type {
    REGULAR, EXCEPTIONAL, GROUP_LEADER
  }

  @Id
  @GeneratedValue
  private long id;
  private String name;
  @Column(name = "membership_type")
  @Enumerated(EnumType.ORDINAL)
  private Type membershipType;
  @Column(name = "service_hours")
  private Integer serviceHours;
  @Column(name = "join_date")
  private Date joinDate;

  protected Member() {
  }

  public Member(String name, Date joinDate) {
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

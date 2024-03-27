package com.practice.jpamappingpractice;

import lombok.*;

import java.time.LocalDateTime;

public class MemberDTO {

    private String memberId;

    private String memberPw;

    private String memberName;

    private String phone;

    private String city;

    private String state;

    private LocalDateTime enrollDate;

    private MemberRole memberRole;

    public MemberDTO() {
    }

    public MemberDTO(String memberId, String memberPw, String memberName, String phone, String city, String state, LocalDateTime enrollDate, MemberRole memberRole) {
        this.memberId = memberId;
        this.memberPw = memberPw;
        this.memberName = memberName;
        this.phone = phone;
        this.city = city;
        this.state = state;
        this.enrollDate = enrollDate;
        this.memberRole = memberRole;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getMemberPw() {
        return memberPw;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public LocalDateTime getEnrollDate() {
        return enrollDate;
    }

    public MemberRole getMemberRole() {
        return memberRole;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void setMemberPw(String memberPw) {
        this.memberPw = memberPw;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setEnrollDate(LocalDateTime enrollDate) {
        this.enrollDate = enrollDate;
    }

    public void setMemberRole(MemberRole memberRole) {
        this.memberRole = memberRole;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "memberId='" + memberId + '\'' +
                ", memberPw='" + memberPw + '\'' +
                ", memberName='" + memberName + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", enrollDate=" + enrollDate +
                ", memberRole=" + memberRole +
                '}';
    }
}

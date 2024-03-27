package com.practice.jpamappingpractice;

import jakarta.persistence.*;

import java.lang.reflect.Member;
import java.time.LocalDateTime;

@Entity
@Table(name = "member")
public class MemberEntity {

    @Id
    @Column(name = "member_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
    private int memberNo;

    @Column(name = "member_id")
    private String memberId;

    @Column(name = "member_pw")
    private String memberPw;

    @Column(name = "member_name")
    private String memberName;

    @Column(name = "phone")
    private String phone;

    @Embedded
    private Address address;

    @Column(name = "enroll_date")
    private LocalDateTime enrollDate;

    @Column(name = "member_role")
    @Enumerated(EnumType.STRING)
    private MemberRole memberRole;

    protected MemberEntity(){}

    public MemberEntity(String memberId, String memberPw, String memberName, String phone, Address address, LocalDateTime enrollDate, MemberRole memberRole) {

        this.memberId = memberId;
        this.memberPw = memberPw;
        this.memberName = memberName;
        this.phone = phone;
        this.address = address;
        this.enrollDate = enrollDate;
        this.memberRole = memberRole;
    }


    public int getMemberNo() {
        return memberNo;
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

    public Address getAddress() {
        return address;
    }

    public LocalDateTime getEnrollDate() {
        return enrollDate;
    }

    public MemberRole getMemberRole() {
        return memberRole;
    }

    @Override
    public String toString() {
        return "MemberEntity{" +
                "memberNo=" + memberNo +
                ", memberId='" + memberId + '\'' +
                ", memberPw='" + memberPw + '\'' +
                ", memberName='" + memberName + '\'' +
                ", phone='" + phone + '\'' +
                ", address=" + address +
                ", enrollDate=" + enrollDate +
                ", memberRole=" + memberRole +
                '}';
    }
}

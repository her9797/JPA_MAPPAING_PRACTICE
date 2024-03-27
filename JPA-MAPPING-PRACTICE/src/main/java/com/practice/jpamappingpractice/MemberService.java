package com.practice.jpamappingpractice;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.io.Serial;

@Service
public class MemberService {

    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Transactional
    public void save(MemberDTO newMember) {

        MemberEntity member = new MemberEntity(
                newMember.getMemberId(),
                newMember.getMemberPw(),
                newMember.getMemberName(),
                newMember.getPhone(),
                new Address(
                        newMember.getCity(),
                        newMember.getState()
                ),
                newMember.getEnrollDate(),
                newMember.getMemberRole()
        );
        memberRepository.save(member);
    }
}

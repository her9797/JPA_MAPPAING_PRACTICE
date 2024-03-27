package com.practice.jpamappingpractice;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.stream.Stream;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private MemberService memberService;

	private static Stream<Arguments> getMember(){

		return Stream.of(
				Arguments.of(
						1,
						"user01",
						"pass01",
						"김알바",
						"010-1234-1234",
						"서울시",
						"부산역",
						LocalDateTime.now(),
						"PART_TIME"
				),
				Arguments.of(
						2,
						"user02",
						"pass02",
						"이대리",
						"010-5432-1234",
						"서울시",
						"서울역",
						LocalDateTime.now(),
						"FULL_TIME"
				)
		);
	}
	@DisplayName("Practice")
	@ParameterizedTest
	@MethodSource("getMember")
	void testCreateMember(String memberId, String memberPw, String memberName, String phone,
						  String city, String state, LocalDateTime enrollDate, MemberRole memberRole){
		//given
		MemberDTO newMember = new MemberDTO (
				memberId,
				memberPw,
				memberName,
				phone,
				city,
				state,
				enrollDate,
				memberRole
		);
		//when

		//then
		Assertions.assertDoesNotThrow(
				() -> memberService.save(newMember)
		);
	}


}

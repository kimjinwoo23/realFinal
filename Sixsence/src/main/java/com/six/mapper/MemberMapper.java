package com.six.mapper;

import com.six.dto.Member;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface MemberMapper {
    int memberSignUp(Member member);

    int memberIdCheck(String memberId);

    int memberEmailCheck(String memberEmail);

    Member memberLogin(Member member);

    Member registerCheck(Member member);

    Member memberIdFind(Member member);

    Member memberInfoFind(Member member);

    int updatePassword(Member member);

    void updatePoint(@Param("memberNo") int memberNo, @Param("memberPoint") int memberPoint);

}



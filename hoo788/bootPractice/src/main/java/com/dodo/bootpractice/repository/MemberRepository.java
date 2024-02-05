package com.dodo.bootpractice.repository;

import com.dodo.bootpractice.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findAllByUserId(String userId);
}

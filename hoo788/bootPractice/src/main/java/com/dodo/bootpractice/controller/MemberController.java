package com.dodo.bootpractice.controller;

import com.dodo.bootpractice.domain.Member;
import com.dodo.bootpractice.repository.MemberRepository;
import com.dodo.bootpractice.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
@Slf4j
public class MemberController {

    private final MemberService memberService;

    @GetMapping("")
    public String member(Model model) {
        return "/views/member/memberOne";
    }

    // 회원 등록
    @PostMapping("")
    public String memberJoin(@ModelAttribute Member member, Model model) {
        // 나중에 DTO로 controller -> service단 옮기기.
        memberService.joinMember(member);
        return "redirect:/";
    }
}

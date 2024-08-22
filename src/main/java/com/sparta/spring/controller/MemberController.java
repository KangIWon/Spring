package com.sparta.spring.controller;

import com.sparta.spring.dto.*;
import com.sparta.spring.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/members")
    public ResponseEntity<MemberSaveResponseDto> saveMember(@RequestBody MemberSaveRequestDto requestDto) {
        return ResponseEntity.ok(memberService.saveMember(requestDto));
    }

    @GetMapping("/members")
    public ResponseEntity<List<MemberSimpleResponseDto>> getMembers() {
        return ResponseEntity.ok(memberService.getMembers());
    }

    @GetMapping("/members/{memberID}")
    public ResponseEntity<MemberDetailResponseDto> getMember(@PathVariable Long memberId) {
        return ResponseEntity.ok(memberService.getMember(memberId));
    }

    @PutMapping("/members/{memberID}")
    public ResponseEntity<MemberUpdateResponseDto> updateMember(@PathVariable Long memberID, @RequestBody MemberUpdateRequestDto requestDto) {
        return ResponseEntity.ok(memberService.updateMember(memberID, requestDto));
    }

    @DeleteMapping("/members/{memberID}")
    public void deleteMember(@PathVariable Long memberID) {
        memberService.deleteMember(memberID);
    }
}
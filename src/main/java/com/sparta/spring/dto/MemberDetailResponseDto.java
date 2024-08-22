package com.sparta.spring.dto;

import lombok.Getter;

@Getter
public class MemberDetailResponseDto {
    private final Long id;
    public final String name;

    public MemberDetailResponseDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}

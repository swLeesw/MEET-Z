package com.c108.meetz.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.UNAUTHORIZED;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    //400 BAD_REQUEST
    FAIL(BAD_REQUEST, "실패 기본 코드"),
    DUPLICATE_EMAIL(BAD_REQUEST, "이미 가입된 이메일입니다."),
    INVALID_VERIFICATION_CODE(BAD_REQUEST, "인증번호가 일치하지 않습니다."),
    FAIL_TO_SEND_EMAIL(BAD_REQUEST, "메일 전송에 실패했습니다."),
    VERIFICATION_CODE_SEND_FAIL(BAD_REQUEST, "인증 요청을 실패했습니다."),

    /* 401 UNAUTHORIZED: 인증 실패 */
    UNAUTHORIZED_USER(UNAUTHORIZED, "만료되었거나 잘못된 토큰입니다. 토큰을 확인해주세요.");

    private final HttpStatus status;
    private final String message;
}

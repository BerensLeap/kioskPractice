package com.example.kiosk.exception;

public class InvalidInputException extends Exception {
    public InvalidInputException() {
        super("잘못된 입력입니다. 다시 시도해주세요.");
    }
    public InvalidInputException(String message) {
        super(message);
    }
}


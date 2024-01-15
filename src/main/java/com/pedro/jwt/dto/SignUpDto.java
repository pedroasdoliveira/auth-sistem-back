package com.pedro.jwt.dto;

public record SignUpDto(String firstName, String lastName, String login, char[] password) {
}

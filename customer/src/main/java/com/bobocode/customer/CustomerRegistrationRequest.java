package com.bobocode.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}

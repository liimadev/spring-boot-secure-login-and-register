package com.liimadev.security.dto.request;

import jakarta.validation.constraints.NotEmpty;

public record LoginRequest(@NotEmpty(message = "E-mail obrigatório!") String email,
                           @NotEmpty(message = "Senha obrigatório!") String pass) {
}

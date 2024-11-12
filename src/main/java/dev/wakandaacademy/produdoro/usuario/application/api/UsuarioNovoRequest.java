package dev.wakandaacademy.produdoro.usuario.application.api;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Value;

@Value
public class UsuarioNovoRequest {
    @NotBlank(message = "O usuário não pode estar em branco!")
    @Email
    private final String email;
    @Size(min = 6)
    private final String senha;

}

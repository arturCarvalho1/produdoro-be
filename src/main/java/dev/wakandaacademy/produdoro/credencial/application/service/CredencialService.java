package dev.wakandaacademy.produdoro.credencial.application.service;

import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class CredencialService implements CredencialApplicationService{

    @Override
    public void criaNovaCredencial(@Valid UsuarioNovoRequest usuarioNovo) {
    //TODO implementar metodo para criar nova credencial
    }
}

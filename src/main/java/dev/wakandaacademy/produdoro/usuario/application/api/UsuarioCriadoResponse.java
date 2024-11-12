package dev.wakandaacademy.produdoro.usuario.application.api;

import dev.wakandaacademy.produdoro.usuario.domain.ConfiguracaoUsuario;
import dev.wakandaacademy.produdoro.usuario.domain.StatusUsuario;
import dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import lombok.Builder;
import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.UUID;

@Value
public class UsuarioCriadoResponse {
    private UUID IdUsuario;
    private String email;
    private ConfiguracaoUsuarioResponse configuracao;
    private StatusUsuario status;
    private Integer quantidadePomodorosPausaCurta = 0;

    public UsuarioCriadoResponse(Usuario usuario) {
        this.IdUsuario = usuario.getIdUsuario();
        this.email = usuario.getEmail();
        this.configuracao = new ConfiguracaoUsuarioResponse(usuario.getConfiguracao());
        this.status = usuario.getStatus();
    }
}

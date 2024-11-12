package dev.wakandaacademy.produdoro.usuario.application.api;

import dev.wakandaacademy.produdoro.usuario.domain.ConfiguracaoUsuario;
import lombok.Value;

@Value
public class  ConfiguracaoUsuarioResponse {
    private Integer tempoMinutosFoco;
    private Integer tempoMinutosPausaCurta;
    private Integer tempoMinutosPausaLonga;
    private Integer repeticoesParaPausaLonga;

    public ConfiguracaoUsuarioResponse(ConfiguracaoUsuario configuracao) {
        this.tempoMinutosFoco = configuracao.getTempoMinutosFoco();
        this.tempoMinutosPausaCurta = configuracao.getTempoMinutosPausaCurta();
        this.tempoMinutosPausaLonga = configuracao.getTempoMinutosPausaLonga();
        this.repeticoesParaPausaLonga = configuracao.getRepeticoesParaPausaLonga();
    }
}

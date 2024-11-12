package dev.wakandaacademy.produdoro.usuario.domain;

import dev.wakandaacademy.produdoro.pomodoro.domain.ConfiguracaoPadrao;
import lombok.Getter;

@Getter
public class ConfiguracaoUsuario {
	private final Integer tempoMinutosFoco;
	private final Integer tempoMinutosPausaCurta;
	private final Integer tempoMinutosPausaLonga;
	private final Integer repeticoesParaPausaLonga;

	public ConfiguracaoUsuario(ConfiguracaoPadrao configuracaoPadrao) {
		this.tempoMinutosFoco =  configuracaoPadrao.getTempoMinutosFoco();
		this.tempoMinutosPausaCurta =  configuracaoPadrao.getTempoMinutosPausaCurta();
		this.tempoMinutosPausaLonga =  configuracaoPadrao.getTempoMinutosPausaLonga();
		this.repeticoesParaPausaLonga =  configuracaoPadrao.getRepeticoesParaPausaLonga();
	}
}

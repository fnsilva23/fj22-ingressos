package br.com.caelum.ingresso.model;

import java.math.BigDecimal;

import br.com.caelum.ingresso.model.descontos.Desconto;

public class Ingresso {
	private Sessao sessoao;
	private BigDecimal preco;

	
	public Sessao getSessoao() {
		return sessoao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	
	/**
	 * @deprecated hibernate only
	 */
	public Ingresso(){
		
	}
	
	public Ingresso(Sessao sessao, Desconto tipoDesconto){
		this.sessoao = sessao;
		this.preco = tipoDesconto.aplicarDescontoSobre(sessao.getPreco());
	}

}

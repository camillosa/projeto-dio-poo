package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public  class Mentoria extends Conteudo {
	
	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20d;
	}
	
	
	private LocalDate data;
	
	
	public Mentoria() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo=\" + getTitulo() + \", descricao=\" + getDescricao() + \"data=" + data + "]";
	}

	

	
}
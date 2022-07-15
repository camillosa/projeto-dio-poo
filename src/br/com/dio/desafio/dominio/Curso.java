package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

	private int cargaHoraria;
	
	public double calcularXP() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargaHoraria;
	}
	
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	
	
}

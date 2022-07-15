package br.com.dio.desafio.dominio;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev<conteudo> {

	private String nome;
	private Set<conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	public void inscreverBootcamp (Bootcamp bootcamp) {
		this.conteudosInscritos.addAll((Collection<? extends conteudo>) bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}
	
	public void progredir(){
		Optional<conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if (conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		}
		else {
			System.err.println("Você não está matriculado em nenhum conteúdo");
		}
	}
			
	public double calcularTotalXP() {
		 Iterator<Conteudo> iterator = (Iterator<Conteudo>) this.conteudosConcluidos.iterator();
	        double soma = 0;
	        while(iterator.hasNext()){
	            double next = iterator.next().calcularXP();
	            soma += next;
	        }
	        return soma;
		
		
		/*return this.conteudosConcluidos
				.stream()
				.mapToDouble(Conteudo::calcularXP)
				.sum();*/	
		}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(nome, other.nome);
	}
	
	
	
	
}

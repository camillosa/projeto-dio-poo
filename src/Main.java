import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso1 = new Curso();
		curso1.setTitulo("curso Java");
		curso1.setDescricao("descrição curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso JS");
		curso2.setDescricao("descrição curso Js");
		curso2.setCargaHoraria(4);
				
		/*System.out.println(curso1);
		System.out.println(curso2);*/
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("mentoria Java");
		mentoria1.setDescricao("descrição mentoria Java");
		mentoria1.setData(LocalDate.now());
		
		//System.out.println(mentoria1);
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev  devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		
		System.out.println("---");
		System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudosInscritos());
		System.out.println("Conteudos concluidos Camila: " + devCamila.getConteudosConcluidos());
		System.out.println("XP Camila: " + devCamila.calcularTotalXP());

		System.out.println("--------------");
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos João: " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		
		System.out.println("---");
		System.out.println("Conteudos inscritos João: " + devJoao.getConteudosInscritos());
		System.out.println("Conteudos concluidos João: " + devJoao.getConteudosConcluidos());		
		System.out.println("XP Joâo: " + devJoao.calcularTotalXP());
		
	}

}

package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		//cria um novo curso e define seu nome e instrutor
		Curso javaColecoes=new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		//maneira mais longa
		//pega as aulas do curso criando antes e pede para imprimi-las
//		List<Aula> aulas = javaColecoes.getAulas();
//		System.out.println(aulas); //imprime colchetes vazios pq não tem aulas no curso ainda
		
//		//adiciona uma aula ao curso criado antes(javaColecoes)
//		aulas.add(new Aula("Trabalhando com ArrayList", 21));
		
		//maneira simplificada feita em uma única linha
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		
		//maneira mais simplificada ainda usando o metodo adiciona criado na classe curso
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		System.out.println(javaColecoes.getAulas());
		//aulas é uma referencia ao objeto getAulas
		
		//prova que aulas é getAulas tem o mesmo efeito/valor
		//System.out.println(aulas==javaColecoes.getAulas());
		
	}

}

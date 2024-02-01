package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		//cria as aulas
		String aula1="Conhecendo mais de listas";
		String aula2="Modelando a classe Aula";
		String aula3="Trabalhando com Cursos e Sets";
		
		//cria a ArrayList aulas
		ArrayList<String> aulas = new ArrayList<>();
		//adiciona as variáveis string das aulas dentro da ArrayList aulas
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		//imprime o conteúdo da ArrayList aulas
		System.out.println(aulas);	
		
		//remove da ArrayList aulas o objeto com index 0(primeiro objeto)
		aulas.remove(0);
		
		//imprime como ficou a ArrayList aulas sem o objeto com index 0
		System.out.println(aulas);
		
		//for para imprimir no console em cada linha quais são as aulas inclusas na ArrayList aulas
		for (String aula : aulas) {
			System.out.println("Aula: " +aula);
		}
		
		//cria a variavel primeiraaula e define que ela é o atual objeto index 0 da ArrayList aulas
		String primeiraAula=aulas.get(0);
		//imprime no console qual é a primeira aula
		System.out.println("A primeira aula é: "+primeiraAula);
		
		//for para imprimir no console para cada aula em aulas, a mensagem "aula: " separada por linhas
		for (int i=0;i<aulas.size();i++) {
			System.out.println("aula: "+aulas.get(i));
		}
		
		//para imprimir no console o tamanho da ArrayList aulas(tamanho=quantos objetos estão inseridos nela)
		System.out.println(aulas.size());
		
		//método forEach, é parecido com o for porém é mais simplificado
		aulas.forEach(aula -> {
			System.out.println("percorrendo: ");
			System.out.println("Aula "+ aula);
			});
		
		aulas.add("Aumentando nosso conhecimento");
		System.out.println(aulas);
		
		//collections para organizar a ArrayList aulas
		Collections.sort(aulas);
		
		System.out.println("Depois de ordenado: "+aulas);
		
		//aulas.sort(arg0);
	} 
}

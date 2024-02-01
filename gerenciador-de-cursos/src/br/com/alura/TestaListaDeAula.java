package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		Aula a1=new Aula("Revistando ArrayLists",21);
		Aula a2=new Aula("Listas de objetos",20);
		Aula a3=new Aula("Relacionamento de listas e objetos",15);
		
		ArrayList<Aula> aulas=new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println("ArrayList aulas em sua ordem padrão/inicial: ");
		System.out.println(aulas);
		
		//organizar por ordem alfabetica
		Collections.sort(aulas);
		
		//comparar quem é maior
//		String s1="Ana";
//		String s2="Leticia";
//		s1.compareTo(s2);
		System.out.println("aulas ordenadas por ordem alfabetica: ");
		System.out.println(aulas);
		
		//organizar pelo tempo de duração das aulas
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println("aulas ordenadas pelo tempo de duração: ");
		System.out.println(aulas);
		
		//mesmo efeito do collections.sort
		//aulas.sort(Comparator.comparing(Aula::getTempo));
		
	} 
}

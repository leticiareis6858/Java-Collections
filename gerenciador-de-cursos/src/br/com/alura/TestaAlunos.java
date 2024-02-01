package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		//set é como uma lista, mas "desorganizado" por padrão.
		Set<String> alunos=new HashSet<>();
		//Collection<String> alunos=new HashSet<>(); collection é a classe mãe e usá-la no lugar de set tbm funciona
		alunos.add("Ana Vieira");
		alunos.add("Leticia Reis");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Nico Steppat");
		//set não aceita objetos/elementos repetidos
		alunos.add("Ana Vieira");
		System.out.println(alunos.size());
		System.out.println(alunos);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		//lambda
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		//contains
		boolean anaEstaMatriculada=alunos.contains("Ana Vieira");
		System.out.println(anaEstaMatriculada);
		boolean pauloEstaMatriculado=alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);
		
		//remove
		alunos.remove("Sergio Lopes");
		System.out.println(alunos);
		
		//transformar o set em lista
		List<String> alunosEmLista=new ArrayList<>(alunos);
	}
}

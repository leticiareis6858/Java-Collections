package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos=new LinkedHashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno=new LinkedHashMap<>();

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
		// outra maneira de fazer o getTempoTotal em apenas uma linha:
		// return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		//return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + ", " + "aulas: " + this.aulas + "]";
		return "[Curso:"+ this.getNome()+",tempo total:"+ this.getTempoTotal()+ ", aulas: ["+ this.aulas+"] ]";
	}

	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
		
	}
	
	public Set<Aluno> getAlunos() {
		//adiciona os alunos a uma set que não pode ser modificada
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatricula(int numero) {
		if(!matriculaParaAluno.containsKey(numero))
			throw new NoSuchElementException();
		return matriculaParaAluno.get(numero);
	}
}

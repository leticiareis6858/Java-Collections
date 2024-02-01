package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {

	public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as colecoes do Java","Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

        Aluno a1=new Aluno("Ana Vieira",2525);
        Aluno a2=new Aluno("Leticia Reis", 2020);
        Aluno a3=new Aluno("Rodrigo Turini",2929);
        
        javaColecoes.matricular(a1);
        javaColecoes.matricular(a2);
        javaColecoes.matricular(a3);
        
        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {
        	System.out.println(a);
        });
        //outra maneira de fazer o foreach usado acima:
//        for(Aluno a : javaColecoes.getAlunos()) {
//        	System.out.println(a);
//        }
        //mais outra maneira, mas essa sem o for, usando o iterator:
//        Set<Aluno> alunos=javaColecoes.getAlunos();
//        Iterator<Aluno> iterador=alunos.iterator();
//        while(iterador.hasNext()) {
//        	Aluno proximo=iterador.next();
//        	System.out.println(proximo);
//        }
        
       // Vector<Aluno> vetor=new Vector<>();
        
        System.out.println("O aluno"+a1+"está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));
        
        Aluno reis=new Aluno("Leticia Reis",2020);
        System.out.println("A aluna "+reis+"está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(reis));
        
        System.out.println("O a2 é equals ao Reis?");
        System.out.println(a2.equals(reis));
        
        //obrigatoriamente o seguinte é true:
        
        System.out.println(a2.hashCode()==reis.hashCode());
        
        System.out.println(a2.hashCode());
        System.out.println(reis.hashCode());
	}

}

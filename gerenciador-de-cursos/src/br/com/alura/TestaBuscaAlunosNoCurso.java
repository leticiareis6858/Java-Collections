package br.com.alura;

public class TestaBuscaAlunosNoCurso {

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
        
        System.out.println(javaColecoes.getAlunos());
        //matricula existente:
        System.out.println("Quem é o aluno com a matricula 2929?");
        Aluno aluno=javaColecoes.buscaMatricula(2929);
        System.out.println("aluno: "+aluno);
        
        //matricula não existente:
        System.out.println("Quem é o aluno com a matricula 2829?");
        Aluno aluno2=javaColecoes.buscaMatricula(2829);
        System.out.println("aluno: "+aluno2);
        
	}

}

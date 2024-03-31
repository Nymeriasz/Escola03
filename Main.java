package Escola03;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Disciplina disciplina = new Disciplina("POO", professor);
        professor.setNome("Pamella");
        professor.setMatricula(12345);

        Aluno a1 = new Aluno("Maria", 1212);
        Aluno a2 = new Aluno("Maia", 2424);

        disciplina.adicionarAluno(a1);
        disciplina.adicionarAluno(a2);

        System.out.println("Disciplina: "+disciplina.getNome());
        System.out.println("Professor: "+disciplina.getProfessor().getNome());
        System.out.println("Alunos: ");
        for (Aluno aluno: disciplina.getAlunos()) {
            if (aluno!=null){
                System.out.println(aluno.getNome()+" - "+aluno.getMatricula());
            }
        }
    }
}

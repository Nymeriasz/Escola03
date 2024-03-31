package Escola03;

public class Disciplina {
    private String nome;
    private Professor professor;
    private Aluno[] alunos;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new Aluno[10];
    }

    public void adicionarAluno(Aluno aluno){
        for (int i=0; i<alunos.length; i++){
            if (alunos[i] == null){
                alunos[i]=aluno;
                return;
            }
        }
        System.out.println("Limite atingido");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}

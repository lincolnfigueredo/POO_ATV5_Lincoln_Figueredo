import java.util.ArrayList;

public class Professor extends Pessoa {
    private int numCursos;
    private ArrayList<String> cursos = new ArrayList<>();
    
    public Professor(String nome, String endereco) {
        super(nome, endereco);
    }

    public boolean addCurso(String curso) {
        cursos.add(curso);
        numCursos++;
        return true;
    }

    public boolean removeCurso(String curso) {
        cursos.remove(curso);
        return true;
    }

    @Override
    public String toString() {
        return "\n[PROFESSOR]\n" + super.toString() + "\nProfessor em " + numCursos + " Curso(s): " + cursos;
    }
}

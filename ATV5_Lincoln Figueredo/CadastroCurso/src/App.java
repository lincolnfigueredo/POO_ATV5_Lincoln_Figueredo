import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        
            Estudante estudante01 = new Estudante("Maria", "Rua Rio Cuba, nº 108 - Alto São Miguel, Abreu e Lima-PE");
            estudante01.addCursoNota("Programação", 10);
            estudante01.addCursoNota("Banco de Dados", 9);
            pessoas.add(estudante01);

            Estudante estudante02 = new Estudante("João", "Rua São José, nº 95 - Guararapes, Jaboatão dos Guararapes-PE");
            estudante02.addCursoNota("Programação", 8);
            estudante02.addCursoNota("Sistemas Operacionais", 8);
            pessoas.add(estudante02);

            Estudante estudante03 = new Estudante("José", "Rua Cento e Vinte e Dois, S/N - Maranguape I, Paulista-PE");
            estudante03.addCursoNota("Programação", 9);
            estudante03.addCursoNota("Estrutura de Dados", 10);
            estudante03.addCursoNota("Lógica de Programação", 8);
            pessoas.add(estudante03);

            Professor professor01 = new Professor("Leandro", "2ª Travessa Nova Descoberta, nº 41 - Centro, Abreu e Lima-PE");
            professor01.addCurso("Programação");
            professor01.addCurso("Sistemas Operacionais");
            pessoas.add(professor01);

            Professor professor02 = new Professor("Mauricio", "Rua Costa Lima, nº 542 - Casa Amarela, Recife-PE");
            professor02.addCurso("Banco de Dados");
            professor02.addCurso("Estrutura de Dados");
            professor02.addCurso("Lógica de Programação");
            pessoas.add(professor02);


        for(int i = 0; i < pessoas.size(); i++) {
            Pessoa p = pessoas.get(i);
            if (p.getClass() == Estudante.class) {
                System.out.println(p.toString());
            } else {
                System.out.println(p.toString());
            }
        }
    }
}

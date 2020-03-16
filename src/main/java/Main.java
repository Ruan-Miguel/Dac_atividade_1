import Pessoa.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
//        Pessoa pessoa = new Pessoa(2, "Ruan", 20000, LocalDate.of(2000, 8, 14));
//
//        PessoaDAO.create(pessoa);
//        Pessoa pessoa = new Pessoa(2, "Ruan Miguel", 30000, LocalDate.of(2000, 8, 14));
//
//        PessoaDAO.update(pessoa);

        ArrayList<Pessoa> pessoas = PessoaDAO.read();

        System.out.println(pessoas);
    }

}

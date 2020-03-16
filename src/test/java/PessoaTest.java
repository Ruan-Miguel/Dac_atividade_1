import Pessoa.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class PessoaTest {

    @Before
    public void clear () {
        String DATABASE_URL = "jdbc:derby:C:\\Users\\Ruan\\IdeaProjects\\Dac_atividade_1\\derby\\Dac_atividade_1";
        String query = "DELETE FROM pessoa";

        try {
            Connection connection = DriverManager.getConnection((DATABASE_URL));

            PreparedStatement statement = connection.prepareStatement(query);
            statement.executeUpdate();

            connection.close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    @Test
    public void create () {
        Pessoa pessoa = new Pessoa(1, "Ruan", 20000, LocalDate.of(2000, 8, 14));

        PessoaDAO.create(pessoa);

        ArrayList pessoas = PessoaDAO.read();

        Assert.assertEquals(pessoa, pessoas.get(0));
    }

    @Test
    public void read () {
        Pessoa pessoa = new Pessoa(1, "Ruan", 20000, LocalDate.of(2000, 8, 14));

        PessoaDAO.create(pessoa);

        ArrayList pessoas = PessoaDAO.read();

        Assert.assertEquals(pessoa, pessoas.get(0));
    }

    @Test
    public void update () {
        Pessoa pessoa = new Pessoa(1, "Ruan", 20000, LocalDate.of(2000, 8, 14));

        PessoaDAO.create(pessoa);

        pessoa.setNome("Ruan Miguel");
        pessoa.setSalario(30000);
        pessoa.setDataNascimento(LocalDate.of(2001, 1, 1));

        PessoaDAO.update(pessoa);

        ArrayList pessoas = PessoaDAO.read();

        Assert.assertEquals(pessoa, pessoas.get(0));
    }

    @Test
    public void delete () {
        Pessoa pessoa = new Pessoa(1, "Ruan", 20000, LocalDate.of(2000, 8, 14));

        PessoaDAO.create(pessoa);

        PessoaDAO.delete(pessoa.getId());

        ArrayList pessoas = PessoaDAO.read();

        Assert.assertTrue(pessoas.isEmpty());
    }

}

package Pessoa;

import java.sql.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;

public class PessoaDAO {

    private static String DATABASE_URL;

    static  {
        DATABASE_URL = "jdbc:derby:C:\\Users\\Ruan\\IdeaProjects\\Dac_atividade_1\\derby\\Dac_atividade_1";
    }

    public static void create (Pessoa pessoa) {
        final String query = "INSERT INTO Pessoa (id, nome, salario, dataNascimento) VALUES (?, ?, ?, ?)";

        try {
            Connection connection = DriverManager.getConnection((DATABASE_URL));

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, pessoa.getId());
            statement.setString(2, pessoa.getNome());
            statement.setFloat(3, pessoa.getSalario());
            statement.setDate(4, Date.valueOf(pessoa.getDataNascimento()));
            statement.executeUpdate();

            connection.close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public static ArrayList<Pessoa> read () {
        final String query = "SELECT * FROM Pessoa";
        ArrayList pessoas = new ArrayList<Pessoa>();

        try {
            Connection connection = DriverManager.getConnection((DATABASE_URL));
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery((query));

            while (resultSet.next()) {
                Pessoa pessoa = new Pessoa(
                        resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getFloat("salario"),
                        resultSet.getDate("dataNascimento").toLocalDate()
                );

                pessoas.add(pessoa);
            }

            connection.close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return pessoas;
    }

    public static void update (Pessoa pessoa) {
        String query = "UPDATE pessoa SET nome = ?, salario = ?, dataNascimento = ? WHERE id = ?";

        try {
            Connection connection = DriverManager.getConnection((DATABASE_URL));

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, pessoa.getNome());
            statement.setFloat(2, pessoa.getSalario());
            statement.setDate(3, Date.valueOf(pessoa.getDataNascimento()));
            statement.setInt(4, pessoa.getId());
            statement.executeUpdate();

            connection.close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public static void delete (int id) {
        String query = "DELETE FROM pessoa WHERE id = ?";

        try {
            Connection connection = DriverManager.getConnection((DATABASE_URL));

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();

            connection.close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

}

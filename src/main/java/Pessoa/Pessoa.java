package Pessoa;

import java.time.LocalDate;

public class Pessoa {

    private int id;
    private String nome;
    private float salario;
    private LocalDate dataNascimento;

    public Pessoa(int id, String nome, float salario, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "id:" + id + ", nome:" + nome + ", salario:" + salario + ", dataNascimento:" + dataNascimento;
    }
}

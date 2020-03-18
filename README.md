# Dac_atividade_1

Esse projeto faz o CRUD de uma classe "Pessoa"

## Script de criação das tabelas

```
DROP TABLE Pessoa;

CREATE TABLE Pessoa(
	id INT,
	nome VARCHAR(100) NOT NULL,
	salario FLOAT(2),
	dataNascimento DATE,
	PRIMARY KEY (id)
);
```
 
## Executar o projeto

![run](https://user-images.githubusercontent.com/47037657/76942980-5d43b180-68dd-11ea-8d89-7a5e60e9e3a5.png)

## Executar os testes

![test](https://user-images.githubusercontent.com/47037657/76942983-5f0d7500-68dd-11ea-9e43-7843902a0f56.png)

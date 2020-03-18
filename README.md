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

![run](https://user-images.githubusercontent.com/47037657/76942218-215c1c80-68dc-11ea-83c8-bf76cd1fbe7a.png)

## Executar os testes

![test](https://user-images.githubusercontent.com/47037657/76942400-7009b680-68dc-11ea-9b0a-f81a83f12db9.png)

##criando o banco de dados
CREATE DATABASE bdApiClientes;

#acessando o banco de dados
USE bdSpiCliente;

#criando a tabela de cliente no banco de dados
CREATE TABLE cliente(
	id			CHAR(36) 	    PRIMARY KEY,
	nome		VARCHAR(150)	NOT NULL,
	EMAIL		VARCHAR(100)	NOT NULL,
	TELEFONE    VARCHAR(15)		NOT NULL,
	datacadastro TIMESTAMP		DEFAULT CURRENT_TIMESTAMP



);

#visualizar a estrutura da tabela
DESC cliente;
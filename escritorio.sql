-- (Re)Cria banco de dados de desenvolvimento.

-- Apagar o banco de dados caso ele exista.
DROP DATABASE IF EXISTS escritorio; 

-- Criar o banco de dados. 
CREATE DATABASE ESCRITORIO CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
-- SELECIONAR O BANCO DE DADOS. 
USE escritorio;

-- Criar tabela advogado. 
CREATE TABLE advogados ( 
idadv INT primary key auto_increment,
dataadv TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
oab VARCHAR(15) UNIQUE NOT NULL,
nome VARCHAR(127) NOT NULL, 
telefone VARCHAR(31) NOT NULL,
statusadv ENUM("on","off") DEFAULT "on"
); 

  -- Criar tabela cliente 
  CREATE TABLE cliente ( 
  idcliente INT primary key auto_increment,
  datacliente TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  nome VARCHAR(127) NOT NULL, 
telefone VARCHAR(31) NOT NULL,
statusadv ENUM("on","off") DEFAULT "on"
); 
 
-- insere alguns dados fake para testes. 
INSERT INTO advogado (oab, nome, telefone) VALUES 
('852t1479j1', 'Joca', '(21)97058-6761'),
('852h14752', 'Jacinto manto', '(21)97058-6762'),
('852y796f53', 'Mario lucas', '(21)97058-6763');

INSERT INTO cliente (nome, telefone) VALUES 
('Joao julio', '(21)97058-6761'),
('maria manto', '(21)97058-6762'),
('Luan lucas', '(21)97058-6763');

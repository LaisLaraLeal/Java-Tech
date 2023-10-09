create database escritorio;

use escritorio;

create table cliente(
 idcliente integer primary key auto_increment,
 nome varchar(60)not null,
 telefone varchar(14)not null); 
 
 insert into cliente(nome,telefone)values
 ('ana carolina','(21)99985-1414'),
 ('Larinha','(21)97058-2628'); 
 
 select * from cliente; 
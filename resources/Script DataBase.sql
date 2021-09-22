create database Loja;

create table Produtos(
Codigo_produto int primary key auto_increment,
Nome_produto varchar(100) not null,
Descricao_produto text not null,
Tipo_produto varchar(100) not null,
Valor_produto varchar(30) not null
);

INSERT INTO Produtos ( `Nome_produto`, `Descricao_produto` , `Tipo_produto` , `Valor_produto`) VALUES ('Geladeira/Refrigerador Electrolux Duplex TW42S Top Freezer com Dispenser De Água 382L Inox - 110V' , 'Capacidade do Freezer e Flexível com 95 litros: São 95 litros' , 'eletrodomésticos' , '3.406,54');
INSERT INTO Produtos ( `Nome_produto`, `Descricao_produto` , `Tipo_produto` , `Valor_produto`) VALUES ('Máquina de Lavar Brastemp 12Kg BWK12 Branca com Ciclo Tira Manchas Advanced e Ciclo Antibolinha - 110v' , 'A Máquina de Lavar Brastemp 12kg conta com design moderno e exclusivo e a alta performance do ciclo tira-manchas Advanced' , 'eletrodomésticos' , '1.949,00');
INSERT INTO Produtos ( `Nome_produto`, `Descricao_produto` , `Tipo_produto` , `Valor_produto`) VALUES ('Fogão Atlas Mônaco Top Glass 4 Bocas Preto - Bivolt' , 'O Mônaco Top Glass chegou para esbanjar inovação e praticidade na sua cozinha. ' , 'eletrodomésticos' , '779,99');

select produtos.Codigo_produto, produtos.Nome_produto, produtos.Descricao_produto, produtos.Tipo_produto, produtos.Valor_produto from produtos;



create table Clientes(
id int primary key auto_increment,
nome varchar(70) not null,
cpf varchar(15) not null,
email varchar(60) not null,
nascimento varchar(10) not null,
sexo varchar(30) not null,
estado_civil varchar(30) not null,
telefone varchar(20) not null,
estado varchar(2) not null,
cidade varchar(60) not null,
longadouro varchar(60) not null,
numero varchar(20) not null,
observacao text(500) 
);

select clientes.id, clientes.nome, clientes.cpf, clientes.email, clientes.nascimento, clientes.sexo, clientes.estado_civil, clientes.telefone, clientes.estado, clientes.cidade, clientes.longadouro, clientes.numero, clientes.observacao from clientes;

create table Funcionarios(
 id int primary key auto_increment,
 nome varchar(70) not null,
 cpf varchar(20) not null,
 data_contratacao varchar(20) not null,
 salario varchar(20) not null,
 cargo varchar(80) not null
);


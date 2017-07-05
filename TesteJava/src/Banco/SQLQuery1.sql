create database TesteJava
drop database TesteJava


create table Pessoa(
idPessoa int primary key identity ,
nome varchar(80) not null,
rg varchar(15) not null,
cpf varchar(20) not null,
nascimento date not null,
endereco varchar(120) not null
)

create table Funcionario(
idFun int primary key references Pessoa(idpessoa),
funcao varchar(30) not null,
observacao varchar(max) not null

)
create table pedido(
idpedido int primary key identity ,
nomeCliente varchar(80) not null,
quantlanches int not null,
quantBebidas int not null,
quantdoces int not null,
valorTotal decimal(10,2),
codFun int not null,
foreign key (codfun) references 
funcionario(idfun)
)

create table estoque(
idestoque int primary key identity ,
quantLanche int not null,
quantbebidas int not null,
quantdoces int not null,
datavalidade date not null,
codpedido int not null,
foreign key(codpedido) references 
pedido(idpedido)
)

select * from pessoa

insert Pessoa values('recepção', 'ikjkhju','hkuhyjk','2000-05-25', 'gdghthg');

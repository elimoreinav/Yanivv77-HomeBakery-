Create Database BakeryBD
USE BakeryBD

--public Client(String id, String firstName, String lastName, String phone, String email,String age,String gender,String address)--

create table  Client(
	ID char(9) not null check(ID like replicate('[0-9]',9)) primary key,
	FirstName varchar(15) not null,
	LastName varchar(15) not null,
	Phone char(9) not null check(Phone like replicate('[0-9]',9)),
	Email varchar(24),
	Age int,
	Gender varchar(6),
	Address varchar(100),
)
	

INSERT INTO Client (ID, FirstName, LastName , Phone, Email, Age, Gender, Address) VALUES
('111111111', 'client1', 'hello', '111111111', '111111111@.gmail.com', 24, 'male' ,'Street 1');

INSERT INTO Client (ID, FirstName, LastName , Phone, Email, Age, Gender, Address) VALUES
('111111112', 'client2', 'hello', '111111112', '111111112@.gmail.com', 45,'male','street 2');

INSERT INTO Client (ID, FirstName, LastName , Phone, Email, Age, Gender, Address) VALUES
('111111113', 'client1', 'hello', '111111113', '111111113@.gmail.com', 26 ,'male', 'Hell street 3');
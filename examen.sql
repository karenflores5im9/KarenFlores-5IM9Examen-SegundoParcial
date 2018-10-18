drop database if exists preexamen;
create database preexamen;
use preexamen;
create table registro(
idRegistro int primary key auto_increment,
Nombre varchar(30),
apellido varchar(30)
);
create table rol(
idRol int primary key auto_increment,
descripcion varchar(60)
);

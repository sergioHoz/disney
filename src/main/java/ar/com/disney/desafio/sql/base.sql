drop database if exists disney;
create database disney;

use disney;

create table pelicula(
    imagen blob,
    titulo varchar(25) not null,
    feha date,
    personaje varchar(50),
    comentarios varchar(250)
);
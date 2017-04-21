create database db_escuela;
use db_escuela;

-- tabla alumno
create table alumno(
id int auto_increment not null,
nombre varchar(45) default null,
ap_pat varchar(45) default null,
ap_mat varchar(45) default null,
genero varchar(45) default null,
semestre varchar(45) default null,
primary key(id)
);
DROP TABLE IF EXISTS cat_genero;
DROP TABLE IF EXISTS cat_estudio;
DROP TABLE IF EXISTS cat_estudio;
DROP TABLE IF EXISTS cat_clasificacion;




CREATE TABLE if not exists cat_genero (
	idu_genero serial,
	nom_genero varchar(50) default '',
	PRIMARY KEY (idu_genero)
);

INSERT INTO cat_genero(nom_genero)
VALUES('Acción'),
       ('Aventura'),
       ('Comedia'),
       ('Drama'),
       ('Ciencia ficción'),
       ('Fantasía'),
       ('Terror'),
       ('Suspense'),
       ('Romance'),
       ('Animación'),
       ('Documental');
-- SELECT * FROM cat_genero;

CREATE TABLE IF NOT EXISTS cat_estudio (
	idu_estudio serial,
	nom_estudio varchar(70) default '',
	PRIMARY KEY (idu_estudio)
);

INSERT INTO cat_estudio (nom_estudio)
VALUES ('Walt Disney Pictures'),
       ('Warner Bros. Pictures'),
       ('Universal Pictures'),
       ('20th Century Studios'),
       ('Paramount Pictures'),
       ('Sony Pictures Entertainment'),
       ('Lionsgate Films'),
       ('Metro-Goldwyn-Mayer (MGM)'),
       ('DreamWorks Pictures'),
       ('Pixar Animation Studios');
	   
-- SELECT * FROM cat_estudio

CREATE TABLE IF NOT EXISTS cat_tipos
(
	idu_tipo serial,
	des_tipo varchar (30) default '',
	PRIMARY KEY (idu_tipo)
);

INSERT INTO cat_tipos(des_tipo)
VALUES ('Pelicula'), ('Serie');

SELECT * FROM cat_tipos;

CREATE TABLE IF NOT EXISTS cat_clasificacion 
(
	idu_clasificacion serial,
	nom_clasificacion varchar (50) default '',
	des_clasificacion varchar (255) default '',
	idu_tipo int default 0,
	PRIMARY KEY (idu_clasificacion)
);

INSERT INTO cat_clasificacion (nom_clasificacion, des_clasificacion, idu_tipo)
VALUES ('PG', 'Apta para todos los públicos',1),
       ('PG-13', 'Se recomienda la guía de los padres para menores de 13 años',1),
       ('R', 'Restringido; se requiere la compañía de un adulto para menores de 17 años',1),
       ('NC-17', 'No apta para menores de 17 años',1),
	   ('TV-Y', 'Apta para todos los niños',2),
       ('TV-Y7', 'Apta para niños mayores de 7 años',2),
       ('TV-G', 'Apta para todos los públicos',2),
       ('TV-PG', 'Se recomienda la guía de los padres',2);

select * from cat_clasificacion;

CREATE TABLE IF NOT EXISTS ctl_contenidos
(
	idu_contenido serial,
	fec_lanzamiento date default '1900-01-01',
	des_sinopsis varchar(500) default '',
	hrs_duracion time default '00:00:00',
	img_portada varchar(2000) default '',
	primary key (idu_contenido)
);

select * from ctl_contenidos;

create table if not exists ctl_multimedias
(
	idu_multimedia serial,
	nom_titulo varchar (150) default '',
	idu_genero integer default 0,
	int_clasificacion integer default 0,
	idu_estudio integer default 0,
	idu_contenido integer default 0,
	primary key (idu_multimedia)
);

select * from ctl_multimedias
DROP TABLE IF EXISTS ${sch}.personajes;

CREATE TABLE ${sch}.personajes (
	id			BIGINT			NOT NULL IDENTITY(1, 1) PRIMARY KEY,
	nombre_personaje 	VARCHAR(100)	NOT NULL,
	apellido_personaje	VARCHAR(100)
);
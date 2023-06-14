DROP TABLE IF EXISTS ${sch}.actores;

CREATE TABLE ${sch}.actores (
	id			BIGINT			NOT NULL IDENTITY(1, 1) PRIMARY KEY,
	nombre_actor 	VARCHAR(100)	NOT NULL,
	apellido_actor	VARCHAR(100)	NOT NULL,
	id_sexo			BIGINT,
	CONSTRAINT actores_personajes_fk_01 FOREIGN KEY (id) REFERENCES ${sch}.personajes(id)
);
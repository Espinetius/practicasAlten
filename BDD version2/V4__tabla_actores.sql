DROP TABLE IF EXISTS ${sch}.actores;

CREATE TABLE ${sch}.actores (
	id			BIGINT			NOT NULL IDENTITY(1, 1) PRIMARY KEY,
	nombre_actor 	VARCHAR(100)	NOT NULL,
	apellido_actor	VARCHAR(100)	NOT NULL,
	id_sexo			BIGINT,
	id_personaje	BIGINT,
	CONSTRAINT fk_foreign_sexo FOREIGN KEY (id_sexo) REFERENCES ${sch}.sexo (id)
);
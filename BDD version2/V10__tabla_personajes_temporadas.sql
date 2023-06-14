DROP TABLE IF EXISTS ${sch}.personajes_temporadas;

CREATE TABLE ${sch}.personajes_temporadas (
	id				BIGINT NOT NULL IDENTITY(1, 1) PRIMARY KEY,
	id_personaje	BIGINT,
	id_temporada		BIGINT,
	CONSTRAINT fk01_personajes_temporadas FOREIGN KEY (id_personaje) REFERENCES ${sch}.personajes (id),
	CONSTRAINT fk02_personajes_temporadas FOREIGN KEY (id_temporada) REFERENCES ${sch}.temporadas (id)
);
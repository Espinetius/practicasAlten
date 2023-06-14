DROP TABLE IF EXISTS ${sch}.temporadas_capitulos;

CREATE TABLE ${sch}.temporadas_capitulos (
	id_temporada	BIGINT,
	id_capitulo	BIGINT,
	CONSTRAINT fk01_temporadas_capitulos FOREIGN KEY (id_temporada) REFERENCES ${sch}.temporadas (id),
	CONSTRAINT fk02_temporadas_capitulos FOREIGN KEY (id_capitulo) REFERENCES ${sch}.capitulos (id)
);
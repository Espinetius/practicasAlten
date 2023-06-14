DROP TABLE IF EXISTS ${sch}.character_temporadas;

CREATE TABLE ${sch}.character_temporadas (
	id_personaje		BIGINT,
	temporada		INT				NOT NULL,
	CONSTRAINT char_fk_03 FOREIGN KEY (id_personaje) REFERENCES ${sch}.characters (id),
	CONSTRAINT temp_fk_02 FOREIGN KEY (temporada) REFERENCES ${sch}.capitulos_temporadas(temporada)
);

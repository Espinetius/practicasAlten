DROP TABLE IF EXISTS ${sch}.sexo;

CREATE TABLE ${sch}.sexo (
	id             BIGINT       NOT NULL IDENTITY(1, 1) PRIMARY KEY,
	sexo	VARCHAR(25),
	CONSTRAINT sexo_fk_01 FOREIGN KEY (id) REFERENCES ${sch}.actores (id)
);
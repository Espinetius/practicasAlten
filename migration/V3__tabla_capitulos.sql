DROP TABLE IF EXISTS ${sch}.capitulos;

CREATE TABLE ${sch}.capitulos (
	id    BIGINT       NOT NULL IDENTITY(1, 1) PRIMARY KEY,
	num_capitulo	BIGINT	NOT NULL,
	resumen VARCHAR(2000) NOT NULL
);
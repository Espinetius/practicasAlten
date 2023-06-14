DROP TABLE IF EXISTS ${sch}.capitulos;

CREATE TABLE ${sch}.capitulos (
  id             BIGINT       NOT NULL IDENTITY(1, 1) PRIMARY KEY,
  num_capitulo     BIGINT NOT NULL,
  temporada       INT NOT NULL,
  resumen		VARCHAR(7000) NOT NULL
);
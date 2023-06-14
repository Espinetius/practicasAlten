DROP TABLE IF EXISTS ${sch}.capitulos_temporadas;

CREATE TABLE ${sch}.capitulos_temporadas (
  temporada				INT       NOT NULL IDENTITY(1, 1) PRIMARY KEY,
  num_capitulos		INT NOT NULL
);
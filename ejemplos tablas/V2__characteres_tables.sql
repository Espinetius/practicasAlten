DROP TABLE IF EXISTS ${sch}.characters;

CREATE TABLE ${sch}.characters (
  id				BIGINT       NOT NULL IDENTITY(1, 1) PRIMARY KEY,
  nombre			VARCHAR(100) NOT NULL,
  apellido			VARCHAR(100) NOT NULL,
  nom_personaje		VARCHAR(100) NOT NULL,
  ape_personaje		VARCHAR(100)
);
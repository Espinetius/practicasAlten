DROP TABLE IF EXISTS ${sch}.temporadas;

CREATE TABLE ${sch}.temporadas (
  	id    BIGINT       NOT NULL IDENTITY(1, 1) PRIMARY KEY,
	temporada		BIGINT
);
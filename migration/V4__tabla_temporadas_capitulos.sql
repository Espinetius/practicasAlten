DROP TABLE IF EXISTS ${sch}.temporadas_capitulos;

CREATE TABLE ${sch}.temporadas_capitulos (
    id_temporada BIGINT NOT NULL,
    id_capitulo  BIGINT NOT NULL,
    CONSTRAINT temporadas_capitulos_fk_01 FOREIGN KEY (id_temporada) REFERENCES temporadas (id) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT temporadas_capitulos_fk_02 FOREIGN KEY (id_capitulo) REFERENCES capitulos (id)  ON DELETE CASCADE ON UPDATE CASCADE
);
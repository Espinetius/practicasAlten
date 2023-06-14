DROP TABLE IF EXISTS ${sch}.capitulos_personajes;

CREATE TABLE ${sch}.capitulos_personajes(
    id_capitulo  BIGINT NOT NULL,
    id_personaje BIGINT NOT NULL,
    CONSTRAINT capitulos_personajes_fk_01 FOREIGN KEY (id_capitulo) REFERENCES capitulos (id) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT capitulos_personajes_fk_02 FOREIGN KEY (id_personaje) REFERENCES personajes (id)  ON DELETE CASCADE ON UPDATE CASCADE
);
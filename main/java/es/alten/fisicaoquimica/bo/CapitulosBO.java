package es.alten.fisicaoquimica.bo;

import java.util.List;

import es.alten.fisicaoquimica.domain.Capitulos;
import es.alten.fisicaoquimica.domain.QCapitulos;
import es.alten.fisicaoquimica.dto.CapitulosDTO;
import es.alten.fisicaoquimica.dto.CapitulosFilterDTO;

public interface CapitulosBO extends GenericCRUDService<Capitulos, Long, QCapitulos, CapitulosFilterDTO> {

}

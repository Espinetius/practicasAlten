package es.alten.fisicaoquimica.bo;

import java.util.List;

import es.alten.fisicaoquimica.domain.QTemporadas;
import es.alten.fisicaoquimica.domain.Temporadas;
import es.alten.fisicaoquimica.dto.TemporadasDTO;
import es.alten.fisicaoquimica.dto.TemporadasFilterDTO;

public interface TemporadasBO extends GenericCRUDService<Temporadas, Long, QTemporadas, TemporadasFilterDTO> {


}

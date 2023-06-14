package es.alten.fisicaoquimica.dto;

import java.util.ArrayList;
import java.util.List;

import es.alten.fisicaoquimica.domain.Capitulos;
import es.alten.fisicaoquimica.domain.Temporadas;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@ApiModel(value = "TemporadasDTO", description = "Data transfer object: temporadas")
@EqualsAndHashCode(callSuper = true)
@Data
@SuppressWarnings({ "unused" })
public class TemporadasDTO extends ElvisBaseDTO<Temporadas> {

	private static final long serialVersionUID = 320332654337448476L;

	private Long id;
	private Long numTemporada;
	private List<CapitulosDTO> capitulos;
		
}

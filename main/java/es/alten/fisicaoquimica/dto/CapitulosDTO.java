package es.alten.fisicaoquimica.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import es.alten.fisicaoquimica.domain.Capitulos;
import es.alten.fisicaoquimica.domain.Temporadas;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@ApiModel(value = "CapitulosDTO", description = "Data transfer object: capitulo")
@EqualsAndHashCode(callSuper = true)
@Data
@SuppressWarnings({ "unused" })
public class CapitulosDTO extends ElvisBaseDTO<Capitulos> {

	private static final long serialVersionUID = 183878974105760934L;

	private Long id;
	private Long numCapitulo;
	private String resumen;

}

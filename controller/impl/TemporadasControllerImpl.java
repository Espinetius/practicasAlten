package es.alten.fisicaoquimica.controller.impl;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.alten.fisicaoquimica.bo.TemporadasBO;
import es.alten.fisicaoquimica.controller.TemporadasController;
import es.alten.fisicaoquimica.domain.Temporadas;
import es.alten.fisicaoquimica.dto.TemporadasDTO;
import es.alten.fisicaoquimica.rest.impl.RestControllerImpl;
import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api/temporadas")
@Api(value = "temporadas", produces = MediaType.APPLICATION_JSON_VALUE)
public class TemporadasControllerImpl extends RestControllerImpl<Temporadas, TemporadasDTO, Long, TemporadasBO> implements TemporadasController {

	private static final long serialVersionUID = 4266021954726640160L;

	@Autowired
	public TemporadasControllerImpl(TemporadasBO bo) {
		super(bo);
	}

//	@GetMapping("/temporada/{temporada}")
//	public List<TemporadasDTO> findByNumTemporada(@PathVariable("temporada") @NotNull Long temporada) {
//		return bo.findByNumTemporada(temporada);
//	}
	
}

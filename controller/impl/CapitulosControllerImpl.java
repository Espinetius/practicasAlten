package es.alten.fisicaoquimica.controller.impl;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.alten.fisicaoquimica.bo.CapitulosBO;
import es.alten.fisicaoquimica.controller.CapitulosController;
import es.alten.fisicaoquimica.domain.Capitulos;
import es.alten.fisicaoquimica.dto.CapitulosDTO;
import es.alten.fisicaoquimica.rest.impl.RestControllerImpl;
import io.swagger.annotations.Api;


@RestController
@RequestMapping("/api/capitulos")
@Api(value = "capitulos", produces = MediaType.APPLICATION_JSON_VALUE)
public class CapitulosControllerImpl extends RestControllerImpl<Capitulos, CapitulosDTO, Long, CapitulosBO> implements CapitulosController {

	private static final long serialVersionUID = -7086055946475640944L;

	@Autowired
	public CapitulosControllerImpl(CapitulosBO bo) {
		super(bo);
	}

//	@GetMapping("/temporada/{temporada}")
//	public List<CapitulosDTO> findByTemporada(@PathVariable("temporada") @NotNull Long temporada) {
//		return bo.findByTemporada(temporada);
//	}
//
//	@GetMapping("/temporada/{temporada}/capitulo/{numCapitulo}")
//	public List<CapitulosDTO> findByTemporadaAndNumCapitulo(@PathVariable("temporada") @NotNull Long temporada, @PathVariable("numCapitulo") @NotNull Long numCapitulo) {
//		return bo.findByTemporadaAndNumCapitulo(temporada, numCapitulo);
//	}

}

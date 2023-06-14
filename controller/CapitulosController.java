package es.alten.fisicaoquimica.controller;

import java.util.List;

import es.alten.fisicaoquimica.dto.CapitulosDTO;
import es.alten.fisicaoquimica.rest.BaseController;

public interface CapitulosController extends BaseController {

	public List<CapitulosDTO> findByTemporada(Long temporada);

	public List<CapitulosDTO> findByNumCapitulo(Long capitulo);

	public List<CapitulosDTO> findByTemporadaAndNumCapitulo(Long temporada, Long numCapitulo);

}

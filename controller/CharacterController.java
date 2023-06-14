package es.alten.fisicaoquimica.controller;

import es.alten.fisicaoquimica.dto.CharacterDTO;
import es.alten.fisicaoquimica.web.BaseController;

public interface CharacterController extends BaseController {
	public CharacterDTO findByNomPersonaje(String nomPersonaje);

	public CharacterDTO findByNombre(String nombre);
}

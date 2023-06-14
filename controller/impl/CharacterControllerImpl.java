package es.alten.fisicaoquimica.controller.impl;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.alten.fisicaoquimica.bo.CharacterBO;
import es.alten.fisicaoquimica.controller.CharacterController;
import es.alten.fisicaoquimica.domain.Characters;
import es.alten.fisicaoquimica.dto.CharacterDTO;
import es.alten.fisicaoquimica.rest.impl.RestControllerImpl;

@RestController
@RequestMapping("/api/characters")
public class CharacterControllerImpl extends RestControllerImpl<Characters, CharacterDTO, Long, CharacterBO> implements CharacterController {

	private static final long serialVersionUID = 4098447286652216733L;
	
	@Autowired
	public CharacterControllerImpl(CharacterBO bo) {
		super(bo);
	}

	@GetMapping("/Personaje/{nomPersonaje}")
	public CharacterDTO findByNomPersonaje(@PathVariable ("nomPersonaje") @NotNull String nomPersonaje) {
		return bo.findByNomPersonaje(nomPersonaje);
	}

	@GetMapping("/Actor/{nombre}")
	public CharacterDTO findByNombre(@PathVariable ("nombre") @NotNull String nombre) {
		return bo.findByNombre(nombre);
	}

}

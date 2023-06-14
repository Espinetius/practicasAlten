package es.alten.fisicaoquimica.controller.impl;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.alten.fisicaoquimica.bo.UserBO;
import es.alten.fisicaoquimica.controller.UserController;
import es.alten.fisicaoquimica.domain.User;
import es.alten.fisicaoquimica.dto.UserDTO;
import es.alten.fisicaoquimica.rest.impl.RestControllerImpl;
import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api/users")
@Api(value = "users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserControllerImpl extends RestControllerImpl<User, UserDTO, Long, UserBO> implements UserController {

	private static final long serialVersionUID = 1989423005929002291L;

	public UserControllerImpl(UserBO bo) {
		super(bo);
	}

}

package es.alten.fisicaoquimica.bo;

import es.alten.fisicaoquimica.domain.QUser;
import es.alten.fisicaoquimica.domain.User;
import es.alten.fisicaoquimica.dto.UserFilterDTO;

/** Define services to work with Users. */
public interface UserBO extends GenericCRUDService<User, Long, QUser, UserFilterDTO> {
	User findByEmail(String email);
}

package es.alten.fisicaoquimica.bo.impl;

import es.alten.fisicaoquimica.bo.UserBO;
import es.alten.fisicaoquimica.dao.UserRepository;
import es.alten.fisicaoquimica.domain.QUser;
import es.alten.fisicaoquimica.domain.User;
import es.alten.fisicaoquimica.dto.UserFilterDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Implements interface {@link UserBO}.
 *
 * @noinspection unused
 */
@Service
@Transactional
public class UserBOImpl
    extends ElvisGenericCRUDServiceImpl<User, Long, QUser, UserFilterDTO, UserRepository>
    implements UserBO {

  private static final long serialVersionUID = -4166529873832767435L;
  private static final Logger LOG = LoggerFactory.getLogger(UserBOImpl.class);

  @Override
  public User findByEmail(String email) {
    LOG.debug("findByEmail");
    return this.repository.findByEmail(email);
  }
}

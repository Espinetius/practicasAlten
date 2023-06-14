package es.alten.fisicaoquimica.bo.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.alten.fisicaoquimica.bo.CapitulosBO;
import es.alten.fisicaoquimica.dao.CapitulosRepository;
import es.alten.fisicaoquimica.domain.Capitulos;
import es.alten.fisicaoquimica.domain.QCapitulos;
import es.alten.fisicaoquimica.dto.CapitulosDTO;
import es.alten.fisicaoquimica.dto.CapitulosFilterDTO;
import es.alten.fisicaoquimica.utils.ListMapper;

@Service
@Transactional
public class CapitulosBOImpl extends ElvisGenericCRUDServiceImpl<Capitulos, Long, QCapitulos, CapitulosFilterDTO, CapitulosRepository> implements CapitulosBO {

	private static final long serialVersionUID = -8791685794787290985L;
	private static final Logger LOG = LoggerFactory.getLogger(CapitulosBOImpl.class);

	@Autowired
	private transient CapitulosRepository capRepo;


}

package es.alten.fisicaoquimica.bo.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.alten.fisicaoquimica.bo.TemporadasBO;
import es.alten.fisicaoquimica.dao.TemporadasRepository;
import es.alten.fisicaoquimica.domain.QTemporadas;
import es.alten.fisicaoquimica.domain.Temporadas;
import es.alten.fisicaoquimica.dto.TemporadasDTO;
import es.alten.fisicaoquimica.dto.TemporadasFilterDTO;
import es.alten.fisicaoquimica.utils.ListMapper;

@Service
@Transactional
public class TemporadasBOImpl extends ElvisGenericCRUDServiceImpl<Temporadas, Long, QTemporadas, TemporadasFilterDTO, TemporadasRepository> implements TemporadasBO {

	private static final long serialVersionUID = 7339777545229613159L;
	private static final Logger LOG = LoggerFactory.getLogger(TemporadasBOImpl.class);

	@Autowired
	private transient TemporadasRepository temRepo;


}

package es.alten.fisicaoquimica.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;

import es.alten.fisicaoquimica.domain.QTemporadas;
import es.alten.fisicaoquimica.domain.Temporadas;

public interface TemporadasRepository
		extends ElvisBaseRepository<Temporadas, Long, QTemporadas>, JpaSpecificationExecutor<Temporadas>, QuerydslPredicateExecutor<Temporadas>, QuerydslBinderCustomizer<QTemporadas> {


}

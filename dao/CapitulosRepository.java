package es.alten.fisicaoquimica.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;

import es.alten.fisicaoquimica.domain.Capitulos;
import es.alten.fisicaoquimica.domain.QCapitulos;

public interface CapitulosRepository
		extends ElvisBaseRepository<Capitulos, Long, QCapitulos>, JpaSpecificationExecutor<Capitulos>, QuerydslPredicateExecutor<Capitulos>, QuerydslBinderCustomizer<QCapitulos> {

}

package es.alten.fisicaoquimica.dto;

import javax.persistence.criteria.Predicate;

import org.springframework.data.jpa.domain.Specification;

import es.alten.fisicaoquimica.domain.Capitulos;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings({})
@ApiModel(value = "CapiutlosFilterDTO", description = "Capitulos filter")
@EqualsAndHashCode(callSuper = true)
@Data
public class CapitulosFilterDTO extends BaseFilterDTO<Capitulos> {

	private static final long serialVersionUID = 2022176375625312079L;
	private Long numCapitulo;

	@Override
	public Specification<Capitulos> obtainFilterSpecification() {
		return (root, query, cb) -> {
			// Not deleted users
			Predicate predicate = cb.and();
			// User email filter
			if (numCapitulo != null) {
				predicate = cb.and(predicate, cb.like(root.get("Numero del capitulo"), "%" + this.numCapitulo + "%"));
			}

			return predicate;
		};
	}

}

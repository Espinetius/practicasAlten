package es.alten.fisicaoquimica.dto;

import javax.persistence.criteria.Predicate;

import org.springframework.data.jpa.domain.Specification;

import es.alten.fisicaoquimica.domain.Temporadas;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings({})
@ApiModel(value = "TemporadasFilterDTO", description = "Temporadas filter")
@EqualsAndHashCode(callSuper = true)
@Data
public class TemporadasFilterDTO extends BaseFilterDTO<Temporadas> {

	private static final long serialVersionUID = -1813364264218025242L;
	private Long temporadas;

	@Override
	public Specification<Temporadas> obtainFilterSpecification() {
		return (root, query, cb) -> {
			// Not deleted users
			Predicate predicate = cb.and();
			// User email filter
			if (temporadas != null) {
				predicate = cb.and(predicate, cb.like(root.get("temporada"), "%" + this.temporadas + "%"));
			}

			return predicate;

		};
	}
}

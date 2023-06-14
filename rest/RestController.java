package es.alten.fisicaoquimica.rest;

import java.io.Serializable;
import java.util.List;

import org.springframework.http.ResponseEntity;

import es.alten.fisicaoquimica.bo.GenericCRUDService;
import es.alten.fisicaoquimica.domain.ElvisEntity;
import es.alten.fisicaoquimica.dto.ElvisBaseDTO;

/**
 * Generic interface for REST Controllers.
 *
 * @param <D> type of DTO
 * @param <I> type of identification of entity
 * @noinspection unused
 */
public interface RestController<E extends ElvisEntity, D extends ElvisBaseDTO, I extends Serializable, B extends GenericCRUDService> {

	void init();

	ResponseEntity<List<D>> findAll();

	ResponseEntity<D> findOne(I id) throws IllegalAccessException, InstantiationException;

	ResponseEntity<D> add(D item);

	ResponseEntity<D> update(D input);

	ResponseEntity<Void> delete(I id);

	ResponseEntity<Void> deleteAll();
}

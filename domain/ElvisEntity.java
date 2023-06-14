package es.alten.fisicaoquimica.domain;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

import lombok.Data;

/**
 * Interface to mark every entity in the system.
 *
 * @author rbarroso
 */
@MappedSuperclass
@Data
public abstract class ElvisEntity implements Serializable, Cloneable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = -8776163045510963085L;

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}

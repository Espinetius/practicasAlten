package es.alten.fisicaoquimica.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@XmlRootElement
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "temporadas")
public class Temporadas extends ElvisEntity {

	private static final long serialVersionUID = -3829331826972957474L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Column(name = "temporada")
	private Long numTemporada;


	@ManyToMany(fetch=FetchType.EAGER, targetEntity=Capitulos.class)
	@Fetch(value=FetchMode.SUBSELECT)
	@JoinTable(
			name="temporadas_capitulos",
			joinColumns = @JoinColumn(name = "id_temporada", nullable = false),
			inverseJoinColumns = @JoinColumn(name = "id_capitulo", nullable = false)
			)
	private List<Capitulos> capitulos = new ArrayList<>();


}

package domain;

import javax.persistence.*;

@Entity
@Table(name = "tbl_alumno")
public class Alumno implements BaseEntity<Long> {
	@Id
	@SequenceGenerator(name = "id_generator", sequenceName = "id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
	private Long id;

	@Column(unique = true, nullable = false, updatable = false, length = 64)
	private String nombres;
	@Column(unique = true, nullable = false, updatable = false, length = 64)
	private String apellidoPaterno;
	@Column(unique = true, nullable = false, updatable = false, length = 64)
	private String apellidoMaterno;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

}

package domain;

import javax.persistence.*;
import java.security.PublicKey;

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
    @Column(unique = true, updatable = false, length = 64)
    private String DNI;


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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
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

	public Alumno(){

    }

    public Alumno(String nombres, String apellidoM, String apellidoP, String DNI ){

	    this.nombres = nombres;
	    this.apellidoMaterno = apellidoM;
	    this.apellidoPaterno = apellidoP;
	    this.DNI = DNI;
    }
}

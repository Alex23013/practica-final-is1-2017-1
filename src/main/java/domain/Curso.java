package domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "tbl_curso")
public class Curso implements BaseEntity<Long> {
    @Id
    @SequenceGenerator(name = "id_generator", sequenceName = "id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
	private Long id;

    @Column(unique = true, updatable = false, length = 64)
	private String codigo;

    @Column(unique = true, updatable = false, length = 64)
    private String DNI;

    @Column(unique = true, nullable = false, updatable = false, length = 64)
	private String nombre;

    @Column(nullable = false)
	private Integer creditos;

    @ManyToMany
    @JoinTable(
            name="prerequisitos",
            joinColumns=@JoinColumn(name="id1", referencedColumnName="id"),
            inverseJoinColumns=@JoinColumn(name="id2", referencedColumnName="id"))
	private List<Curso> prerequisitos;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

	public List<Curso> getPrerequisitos() {
		return prerequisitos;
	}

	public void setPrerequisitos(List<Curso> prerequisitos) {
		this.prerequisitos = prerequisitos;
	}

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Curso(){
        prerequisitos = new ArrayList<Curso>();
    }

    public Curso(Long id,String nombre, String codigo,String DNI, Integer creditos, List<Curso> prerequisitos){
        this.id = id;
	    this.nombre = nombre;
	    this.codigo = codigo;
	    this.DNI = DNI;
	    this.creditos = creditos;
	    this.prerequisitos = prerequisitos;
    }
}

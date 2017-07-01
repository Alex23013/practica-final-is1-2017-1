package domain;

import javax.persistence.*;

@Entity
@Table(name = "tbl_matricula")
public class Matricula implements BaseEntity<Long> {
	@Id
	@SequenceGenerator(name = "id_generator", sequenceName = "id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
	private Long id;

	@ManyToOne
	@JoinColumn(name="curso_id")
	private Curso curso;

	@ManyToOne
	@JoinColumn(name="alumno_id")
	private Alumno alumno;

	@Column(nullable = false)
	private Double nota;

	@Column(unique = true, nullable = false, updatable = false, length = 64)
	private String semestre;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}


	public Matricula(){}

	public Matricula(Long id, Alumno alumno, Curso curso, Double nota, String semestre){
		this.id = id;
		this.alumno = alumno;
		this.curso = curso;
		this.nota = nota;
		this.semestre = semestre;
	}
}

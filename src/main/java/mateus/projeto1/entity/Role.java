package mateus.projeto1.entity;

import javax.persistence.*;

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String name;
	
	@Enumerated(EnumType.STRING) //pega o valor do texto
	private StatusRole status;
	
	public Role(String name, StatusRole status) {
		super();
		this.name = name;
		this.status = status;
	}

	public Role() {
	}

	public Role(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StatusRole getStatus() {
		return status;
	}

	public void setStatus(StatusRole status) {
		this.status = status;
	}

}

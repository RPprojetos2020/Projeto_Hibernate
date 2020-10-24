package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMAIL")
public class Email {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID", length=50, nullable=false)
	private Integer id;
	
	@Column(name="ENDERECO", length=50, nullable=false)
	private String endereco;
	
	public Email() {
		
	}
	
	public Email(String endereco) {
		this.endereco = endereco;
	}

	public Email(Integer id, String endereco) {
		this.id = id;
		this.endereco = endereco;
	}

	public Integer getId() {
		return id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	

}

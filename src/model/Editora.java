package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EDITORA")
public class Editora {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CODIGO", length=50, nullable=false)
	private Integer codigo;
	
	@Column(name="NOME", length=50, nullable=false)
	private String nome;
	
	public Editora() {
		
	}
	
	public Editora(Integer id, String nome) {
		this.codigo = id;
		this.nome = nome;
	}
	
	public Editora(String nome) {
		this.nome = nome;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}

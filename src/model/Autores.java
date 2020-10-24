package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="AUTORES")
public class Autores {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CODIGO", length=50, nullable=false)
	private Integer codigo;
	
	@Column(name="NOME", length=50, nullable=false)
	private String nome;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	
	@JoinColumn(name = "IDFK_AUTORES")
	public List<Email> list;
	
	public Autores () {
		
	}
	
	public Autores(String nome) {
		this.nome = nome;
		this.list = new ArrayList();
	}

	public Autores(Integer codigo, String nome, List<Email> list) {
		this.codigo = codigo;
		this.nome = nome;
		this.list = list;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Email> getList() {
		return list;
	}

	public void setList(List<Email> list) {
		this.list = list;
	}
	
	
	
	
	
	
	

}

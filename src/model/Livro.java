package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="LIVRO")
public class Livro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ISBN", length=50, nullable = false)
	private Integer isbn;
	
	@OneToOne(cascade = javax.persistence.CascadeType.ALL)
	@JoinColumn(name="IDFK_EDICAO", referencedColumnName = "CODIGO")
	private Editora edicao;
	
	@Column(name="CUSTO", length=50, nullable=false)
	private Double custo;
	
	@Column(name="TITULO", length=50, nullable=false)
	private String titulo;
	
	@OneToOne(cascade = javax.persistence.CascadeType.ALL)
	@JoinColumn(name="IDFK_AUTOR", referencedColumnName = "CODIGO")
	private Autores autor;
	
	public Livro() {
		
	}
	
	public Livro(Editora edicao, Double custo, String titulo, Autores autor){
		this.edicao = edicao;
		this.custo = custo;
		this.titulo = titulo;
		this.autor = autor;
	}

	public Livro(Integer isbn, Editora edicao, Double custo, String titulo, Autores autor) {
		this.isbn = isbn;
		this.edicao = edicao;
		this.custo = custo;
		this.titulo = titulo;
		this.autor = autor;
	}

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}

	public Editora getEdicao() {
		return edicao;
	}

	public void setEdicao(Editora edicao) {
		this.edicao = edicao;
	}

	public Double getCusto() {
		return custo;
	}

	public void setCusto(Double custo) {
		this.custo = custo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autores getAutor() {
		return autor;
	}

	public void setAutor(Autores autor) {
		this.autor = autor;
	}
	
	

}

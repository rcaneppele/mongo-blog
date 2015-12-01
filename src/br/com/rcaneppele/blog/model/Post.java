package br.com.rcaneppele.blog.model;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Post {
	
	@Id
	private Long id;
	private String autor;
	private LocalDate dataPublicacao;
	private String titulo;
	private String conteudo;

	public Post(String autor, LocalDate dataPublicacao, String titulo, String conteudo) {
		this.autor = autor;
		this.dataPublicacao = dataPublicacao;
		this.titulo = titulo;
		this.conteudo = conteudo;
	}

	public Post(Long id, String autor, LocalDate dataPublicacao, String titulo, String conteudo) {
		this.id = id;
		this.autor = autor;
		this.dataPublicacao = dataPublicacao;
		this.titulo = titulo;
		this.conteudo = conteudo;
	}
	
	/*
	 * JAX-B eyes only!
	 */
	protected Post() {
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "POST[ID = " +id +"; Autor = " +autor +"]";
	}

	public Long getId() {
		return id;
	}
	public String getAutor() {
		return autor;
	}
	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getConteudo() {
		return conteudo;
	}
	
}

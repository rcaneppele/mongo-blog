package br.com.rcaneppele.blog.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("posts")
public class Post {
	
	@Id
	private ObjectId id;
	private String autor;
	private String dataPublicacao;
	private String titulo;
	private String resumo;
	private String conteudo;
	
	public Post(String autor, String dataPublicacao, String titulo, String resumo, String conteudo) {
		this.autor = autor;
		this.dataPublicacao = dataPublicacao;
		this.titulo = titulo;
		this.resumo = resumo;
		this.conteudo = conteudo;
	}
	
	/*
	 * Morphia Eyes Only! 
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

	public ObjectId getId() {
		return id;
	}
	public String getAutor() {
		return autor;
	}
	public String getDataPublicacao() {
		return dataPublicacao;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getResumo() {
		return resumo;
	}
	public String getConteudo() {
		return conteudo;
	}
	
}

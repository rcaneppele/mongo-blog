package br.com.rcaneppele.blog.dao;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.mongodb.morphia.Datastore;

import br.com.rcaneppele.blog.model.Post;

@Named
@RequestScoped
public class PostDao {
	
	@Inject
	private Datastore ds;

	public List<Post> todos() {
		return ds.createQuery(Post.class).asList();
	}

	public void cadastra(Post post) {
		ds.save(post);
	}
	
}

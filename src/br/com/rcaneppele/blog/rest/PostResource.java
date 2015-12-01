package br.com.rcaneppele.blog.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.rcaneppele.blog.dao.PostDao;
import br.com.rcaneppele.blog.model.Post;

@Path("/posts")
public class PostResource {
	
	@Inject
	private PostDao dao;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Post> todos() {
		return dao.todos();
	}
	
}

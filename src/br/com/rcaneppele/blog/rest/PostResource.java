package br.com.rcaneppele.blog.rest;

import java.net.URI;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import br.com.rcaneppele.blog.dao.PostDao;
import br.com.rcaneppele.blog.model.Post;

@Path("/posts")
public class PostResource {
	
	@Inject
	private PostDao dao;
	
	@Context
	private UriInfo uriInfo;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Post> todos() {
		return dao.todos();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastra(Post post) {
		dao.cadastra(post);
		
		return Response.created(URI.create(uriInfo.getBaseUri() + post.getTituloSubstituindoEspacosPorHifens())).build();
	}
	
}

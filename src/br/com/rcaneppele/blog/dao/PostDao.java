package br.com.rcaneppele.blog.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.rcaneppele.blog.model.Post;

@Named
@RequestScoped
public class PostDao {

	public List<Post> todos() {
		return new ArrayList<Post>(Arrays.asList(new Post("Fulano", LocalDate.now(), "Post Legal", "Bla bla bla bla bla")));
	}

	
}

(function($) {
	"use strict";
	
	var parametros = {
		url: "http://localhost:8080/mongo-blog/rest/posts",
		method: "GET",
		contentType: "application/json"
	};
	
	$.ajax(parametros).done(sucesso).fail(erro);
	
	function sucesso(dados) {
		$(dados).each(adicionaPostNaTela);
	}
	
	function erro(jqXHR, erro) {
		alert("ocorreu um erro ao carregar os posts!");
	}
	
	function adicionaPostNaTela(index, post) {
		var html = "<div class='post-preview'>";
		
		html += "<a href='#'>";
		html += "<h2 class='post-title'>" +post.titulo +"</h2>";
		html += "<h3 class='post-subtitle'>" +post.resumo +"</h3></a>";
		
		html += "<p class='post-meta'>";
		html += "Postado por <a href='#'>" +post.autor +"</a> em " +post.dataPublicacao +"</p></div>";
		
		$(".posts").append(html);
	}
})(jQuery);

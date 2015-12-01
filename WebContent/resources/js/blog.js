(function($) {
	"use strict";
	
	var parametros = {
		url: "http://localhost:8080/mongo-blog/rest/posts",
		method: "GET",
		contentType: "application/json"
	};
	
	$.ajax(parametros).done(sucesso).fail(erro);
	
	function sucesso(dados) {
		console.log(dados);
	}
	
	function erro(jqXHR, erro) {
		alert("ocorreu um erro ao carregar os posts!");
	}
})(jQuery);

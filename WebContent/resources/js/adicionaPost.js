(function($) {
	"use strict";

	$.fn.serializeFormToJSON = function() {
		var json = {};
		var array = this.serializeArray();
		
		$.each(array, function() {
			if (json[this.name]) {
				if (!json[this.name].push) {
					json[this.name] = [ json[this.name] ];
				}
				json[this.name].push(this.value || '');
			} else {
				json[this.name] = this.value || '';
			}
		});
		
		return JSON.stringify(json);
	};

	$(".post-form").submit(function(evt) {
		evt.preventDefault();
		
		var parametros = {
			url : "http://localhost:8080/mongo-blog/rest/posts",
			method : "POST",
			contentType : "application/json",
			data: $(this).serializeFormToJSON()
		};

		$.ajax(parametros).done(sucesso).fail(erro);
		
	});

	function sucesso(dados) {
		window.location.href = "http://localhost:8080/mongo-blog/home";
	}

	function erro(jqXHR, erro) {
		alert("ocorreu um erro ao salvar o post!");
	}
})(jQuery);

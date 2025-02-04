package br.com.bandtec.AgendaDeObjetivos.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.bandtec.AgendaDeObjetivos.domain.Livro;
import br.com.bandtec.AgendaDeObjetivos.domain.Opiniao;

@Service
public class LivrariaService {
	private RestTemplate restTemplate;
	String url;

	public LivrariaService() {
		this.restTemplate = new RestTemplate();
		this.url = "http://localhost:8081/livros";
	}

	public List<Livro> buscaPorTema(String tema){
		String url = "http://localhost:8081/livros/tema/";
		String urlBusca = url + tema;

		ResponseEntity<List> resposta = restTemplate.getForEntity(urlBusca, List.class);

		return resposta.getBody();
	}

	public String cadastrarOpiniao(Opiniao opiniao) {
		String urlCadastro = url+"/opiniao";
		ResponseEntity<String> resposta =
				restTemplate.postForEntity(urlCadastro, opiniao, String.class);
		return resposta.getBody();
	}
}

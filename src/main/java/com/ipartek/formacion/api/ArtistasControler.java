package com.ipartek.formacion.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ipartek.formacion.Artista;

@Controller
public class ArtistasControler {

	@RequestMapping(value = "/api/artistas/", method = RequestMethod.GET)
	public String listar() {

		return "artistas/index";
	}

	@RequestMapping(value = "/api/artistas/{id}", method = RequestMethod.GET)
	public @ResponseBody Artista detalle(@PathVariable("id") int id, Model model) {

		Artista a = new Artista();
		a.setId(id);

		return a;
	}

}

package it.dstech.formazione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControlloParole {
	@RequestMapping("/parole")
	public ModelAndView printPalindromo(@RequestParam("testo") String testo, Model model) {
		String[] parole = testo.split(" ");
		return new ModelAndView("risultato", "risultato", "Il numero di parole contenute è: " + parole.length);
	}
}

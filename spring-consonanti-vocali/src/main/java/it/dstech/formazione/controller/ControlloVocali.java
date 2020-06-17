package it.dstech.formazione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControlloVocali {

	@RequestMapping("/vocali")
	public ModelAndView printPalindromo(@RequestParam("testo") String testo, Model model) {
		int vocali = 0;
		for (int i = 0; i < testo.length(); i++) {
			if (testo.charAt(i) == 'a' || testo.charAt(i) == 'e' || testo.charAt(i) == 'i'
					|| testo.charAt(i) == 'o' && testo.charAt(i) == 'u' && testo.charAt(i) != ' ') {
				vocali++;
			}
		}
		return new ModelAndView("risultato", "risultato", "Il numero di vocali contenute è: " + vocali);
	}
}
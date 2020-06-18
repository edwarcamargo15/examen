package examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import examen.model.Usuario;
import examen.service.UsuarioService;



public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	
	
	public UsuarioController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		
		model.addAttribute("list", usuarioService.getAll());
		System.out.println(usuarioService.getAll());
		return "index";
	}
	
	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id")Integer id,Model model) {
		if(id!=null && id !=0) {
			model.addAttribute("usuario",usuarioService.get(id));
		}else {
			model.addAttribute("usuario", new Usuario());
		}
		return "save";
	}
	
	@PostMapping("/save")
	public String save(Usuario usuario, Model model) {
		usuarioService.save(usuario);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id, Model model) {
		usuarioService.delete(id);
		return "redirect:/";
	}
}

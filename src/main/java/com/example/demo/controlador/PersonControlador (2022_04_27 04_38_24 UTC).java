package com.example.demo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entidades.Person;
import com.example.demo.servicios.PersonService;

@Controller
public class PersonControlador {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("/home")
	public String seleccionarCursos(Model model)
	{
		try {
			List<Person> listaRegistro = personService.findAll();
			model.addAttribute("registros", listaRegistro);
		}catch(Exception e) {
			System.out.println("Error: "+e.getCause());
		}
		return "index";
	}

	@GetMapping("/registro")
    public String registro(Model model) {
        model.addAttribute("formulario", new Person());
        return "registro";
    }

    @PostMapping("/registrado")
    public String registro(@Validated Person person) {
    	System.out.println(person.toString());
        personService.save(person);
        return "redirect:/home";
    }

	@GetMapping("/consultar/{id}")
    public String consultar(@PathVariable int id, Model model) {
        try{
            Optional<Person> person = personService.findById(id);
            model.addAttribute("data", person.get());
        }
        catch(Exception e){
            System.out.println("Error: " + e.getCause());
            return "404";
        }
        //System.out.println(person.toString());
        return "datos";
    }

	@GetMapping("/consultar/home")
    public String irHome() {
        return "redirect:/home";
    }
    @GetMapping("/inicio")
    public String desplegar() {
        return "/indexcopy";
        
    }
    @GetMapping("/elecciones")
    public String elecciones() {
        return "/principal_elecciones";
    }
    @GetMapping("/estadistica")
    public String estadistica() {
        return "/secundaria_estadisticas";
    }
    @GetMapping("/formulario")
    public String formulario() {
        return "/secundaria_formulario";
    }        
    
    @GetMapping("/resultado")
    public String resultado() {
        return "/sprint3_3";
    }    
    


}

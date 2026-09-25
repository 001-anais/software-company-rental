package es.uclm.rentalplatform.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import es.uclm.rentalplatform.domain.User;
import es.uclm.rentalplatform.service.UserService;

@Controller
@RequestMapping("/register")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public String showForm(Model model) {

        model.addAttribute("user", new User("", ""));
        model.addAttribute("users", service.findAll());

        return "register";
    }

    @PostMapping
    public String registerUser(
            @RequestParam String name,
            @RequestParam String email,
            Model model) {

        if (name.isBlank() || email.isBlank()) {

            model.addAttribute("error",
                    "Todos los campos son obligatorios");

            model.addAttribute("users", service.findAll());

            return "register";
        }

        if (service.existsByEmail(email)) {

            model.addAttribute("error",
                    "Ese correo ya está registrado");

            model.addAttribute("users", service.findAll());

            return "register";
        }

        service.save(new User(name, email));

        return "redirect:/register";
    }
}
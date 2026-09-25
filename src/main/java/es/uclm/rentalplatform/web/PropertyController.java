package es.uclm.rentalplatform.web;

import es.uclm.rentalplatform.domain.Property;
import es.uclm.rentalplatform.service.PropertyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/properties")
public class PropertyController {

    private final PropertyService service;

    public PropertyController(PropertyService service) {
        this.service = service;
    }

    @GetMapping
    public String showProperties(Model model) {

        model.addAttribute("property", new Property("", ""));
        model.addAttribute("properties", service.findAll());

        return "properties";
    }

    @PostMapping
    public String addProperty(@ModelAttribute Property property) {

        service.save(property);

        return "redirect:/properties";
    }
}
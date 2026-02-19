package tn.enis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tn.enis.Service.ProductService;
import tn.enis.dto.ProductDto;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public String home(Model model) {
        model.addAttribute("products", service.getAll());
        model.addAttribute("total", service.getTotal());
        return "products";
    }

    @PostMapping("/add")
    public String add(ProductDto product) {
        service.add(product);
        return "redirect:/products";
    }

    @GetMapping("/delete/{index}")
    public String delete(@PathVariable int index) {
        service.delete(index);
        return "redirect:/products";
    }

    @GetMapping("/edit/{index}")
    public String edit(@PathVariable int index, Model model) {
        model.addAttribute("productToEdit", service.get(index));
        model.addAttribute("editIndex", index);
        model.addAttribute("products", service.getAll());
        model.addAttribute("total", service.getTotal());
        return "products";
    }

    @PostMapping("/update")
    public String update(@RequestParam int index, ProductDto product) {
        service.update(index, product);
        return "redirect:/products";
    }
}

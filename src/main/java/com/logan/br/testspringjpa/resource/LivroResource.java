package com.logan.br.testspringjpa.resource;

import com.logan.br.testspringjpa.model.Livro;
import com.logan.br.testspringjpa.model.User;
import com.logan.br.testspringjpa.repository.LivroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/rest/livro")
public class LivroResource {
    @Autowired

    private LivroRepo livroRepository;

    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody
    String addNewUser (@RequestParam String nome , @RequestParam String autor) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Livro n = new Livro(nome, autor);
        livroRepository.save(n);
        return "Saved";
    }

    /*
    @GetMapping("/all")
    public List<Livro> getAll() {
        List<Livro> livros = new ArrayList<Livro>();
        livros.add(new Livro("10 casas perdidas", "o Zé"));
        livros.add(new Livro("casa de cera", "Uai"));

        return livros;
    }
    */


    @GetMapping("/all")
    public List<Livro> getAll() {
        return livroRepository.findAll();
    }
}

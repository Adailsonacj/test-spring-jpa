package com.logan.br.testspringjpa.resource;

import com.logan.br.testspringjpa.model.Livro;
import com.logan.br.testspringjpa.model.User;
import com.logan.br.testspringjpa.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/user")
public class UserResource {

    @Autowired

    private UsersRepository userRepository;

    @GetMapping("/all")
    public List<User> getAll() {
        return userRepository.findAll();
    }


    @PostMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody User addNewUser (@RequestParam String nome , @RequestParam String cpf) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        User n = new User(nome, cpf);
        userRepository.save(n);
        return n;
    }
}

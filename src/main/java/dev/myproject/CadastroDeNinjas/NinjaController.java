package dev.myproject.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // lida com as requisições
@RequestMapping // mapeia requisições
public class NinjaController {

    @GetMapping("/boasvindas") // cria a rota e pega informacoes
    public String boasVindas() {
        return "Essa é a minha primeira rota";
    }
}

package dev.myproject.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController // lida com as requisições
@RequestMapping("ninjas") // mapeia requisições
public class NinjaController {

    @GetMapping("/boasvindas") // cria a rota e pega informacoes
    public String boasVindas() {
        return "Essa é a minha primeira rota";
    }

    // add ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    // show all ninjas (READ)
    @GetMapping("/listar")
    public String mostrarTodosOsNinjas() {
        return "Mostrar todos os Ninjas";
    }

    // show ninjas by id (READ)
    @GetMapping("/listarID")
    public String mostrarTodosOsNinjasPorId() {
        return "Lista Ninjas por ID";
    }

    // change ninja data (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId() {
        return "Alterar ninja por id";
    }

    // delete ninja (DELETE)
    @DeleteMapping("/deleteID")
    public String deletarNinjaPorId() {
        return "Ninja deletado por id";
    }
}

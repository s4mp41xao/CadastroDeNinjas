package dev.myproject.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("missoes")
public class MissoesController {


    // GET list
    @GetMapping("/listar")
    public String listarMissoes() {
        return "Missoes listadas";
    }

    // POST manda uma requisão para mostrar as requisisões
    @PostMapping("/criar")
    public String criarMissao() {
        return "Missao criada";
    }

    // PUT resquest changes
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missao alterada";
    }

    // DELETE
    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missao deletada";
    }

}

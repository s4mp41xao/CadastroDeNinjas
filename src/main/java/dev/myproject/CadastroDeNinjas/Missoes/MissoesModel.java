package dev.myproject.CadastroDeNinjas.Missoes;

import dev.myproject.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    private String dificuldadeMissao;
//    private int nivelMissao;

    // define that a mission has many ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;
}

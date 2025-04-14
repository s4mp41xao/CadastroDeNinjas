package dev.myproject.CadastroDeNinjas.Ninjas;
import dev.myproject.CadastroDeNinjas.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {

    private long id;
    private String nome;
    private String email;
    private String imgUrl;
    private int idade;
    private String rank;
    private MissoesModel missoes;
    private String description;
}

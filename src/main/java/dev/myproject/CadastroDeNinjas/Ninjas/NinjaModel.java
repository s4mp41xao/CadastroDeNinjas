package dev.myproject.CadastroDeNinjas.Ninjas;
import dev.myproject.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

/*
* import Spring Data JPA and transform a class
*  in a entity of DB
* */
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @Column(unique = true)
    private String email;
    private int idade;
    // defines that the ninja has a single mission in the table
    @ManyToOne
    // connect NinjaModel with MissoesModel
    @JoinColumn(name = "missoes_id") // foreing key
    private MissoesModel missoes;
}

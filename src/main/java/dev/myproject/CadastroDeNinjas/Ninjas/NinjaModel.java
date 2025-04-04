package dev.myproject.CadastroDeNinjas.Ninjas;
import dev.myproject.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

/*
* import Spring Data JPA and transform a class
*  in a entity of DB
* */
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private int idade;

    // defines that the ninja has a single mission in the table
    @ManyToOne
    // connect NinjaModel with MissoesModel
    @JoinColumn(name = "missoes_id") // foreing key
    private MissoesModel missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

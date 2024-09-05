package exercicio4;
/**
 *
 * @author pamplona
 */
public class CadernoDeEnderecos extends Endereco {
    private String nome;
    private String telefone;
    private String email;
    private String dataAniversario;

    
    public CadernoDeEnderecos(String nome, String telefone, String email, String dataAniversario, String rua, String cidade, String estado) {
        super(rua, cidade, estado);
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataAniversario = dataAniversario;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    
    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
               "Telefone: " + telefone + "\n" +
               "Email: " + email + "\n" +
               "Data de Aniversário: " + dataAniversario + "\n" +
               "Endereço: " + super.toString();  
    }
}

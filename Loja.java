package PastaLoja;

public class Loja {
    int codLocal;
    long telefone;
    String nome;
    String endereco;

    Loja() {

     }

    Loja(int codLocal, int telefone, String nome, String endereco) {
        this.codLocal = codLocal;
        this.telefone = telefone;
        this.nome = nome; 
        this.endereco = endereco;       
    }

    void setCodLocal(int codLocal) {
        this.codLocal = codLocal;
    }

    int getCodLocal() {
        return codLocal;
    }

    void setTelefone(long telefone) {
        this.telefone = telefone;
       }
    long getTelefone() {
        return telefone;
    }   

    void setNome(String nome) {
        this.nome = nome;
       }
    String getNome() {
        return nome;
    }

    void setEndereco(String endereco) {
        this.endereco = endereco;
       }

    public String getEndereco() {
        return endereco;
    }
}

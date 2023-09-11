package main.java.set.operacoesBasicas;

public class Convidado {

    private int codigoConvite;
    private String nome;

    public Convidado(String nome, int codigoConvidado) {
        this.codigoConvite = codigoConvidado;
        this.nome = nome;
    }
    public int getCodigoConvidado() {
        return codigoConvite;
    } 
    public void setCodigoConvidado(int codigoConvidado) {
        this.codigoConvite = codigoConvidado;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Convidado{" + 
        "codigoConvite" + codigoConvite +
        ", nome=" + nome + '}';
    }

}

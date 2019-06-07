package Entity;

public class Albuns {

    private String nome;
    private double anoLancamento;
    private int numeroMusica;


    public Albuns(String nome, double anoLancamento, int numeroMusica) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.numeroMusica = numeroMusica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(double anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getNumeroMusica() {
        return numeroMusica;
    }

    public void setNumeroMusica(int numeroMusica) {
        this.numeroMusica = numeroMusica;
    }

    @Override
    public String toString() {
        return  "\nNome=" + nome +
                "\nAno De Lancamento=" + anoLancamento +
                "\nNúmero de Musicas=" + numeroMusica;
    }
}

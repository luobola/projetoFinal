package Entity;

public class AutorBanda {

    private String nome;
    private String cidadeOrigem;
    private double nascimento;

    public AutorBanda(String nome, String cidadeOrigem, double nascimento) {
        this.nome = nome;
        this.cidadeOrigem = cidadeOrigem;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public double getNascimento() {
        return nascimento;
    }

    public void setNascimento(double nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "\nNome=" + nome +
                "\nCidade De Origem=" + cidadeOrigem +
                "\nNascimento=" + nascimento;
    }
}

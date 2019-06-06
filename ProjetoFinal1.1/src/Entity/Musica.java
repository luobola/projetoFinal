package Entity;

public class Musica {


    private String nome;
    private String compositor;
    private double duracao;

    public Musica(String nome, String compositor, double duracao) {
        this.nome = nome;
        this.compositor = compositor;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return  "\nNome=" + nome +
                "\nCompositor=" + compositor +
                "\nDuracao=" + duracao;
    }
}

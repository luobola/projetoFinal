package controle;


import Entity.Albuns;
import Entity.AutorBanda;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Cadastro {

    @FXML
    private TextField tfNome;
    @FXML
    private TextField tfCidadeOrigem;
    @FXML
    private TextField tfAnoNascimento;

    @FXML
    private TextField tfNome1;
    @FXML
    private TextField tfAnoLancamento;






    public AutorBanda coletaInformacao(){
        String nome = tfNome.getText();
        String cidadeOrigem = tfCidadeOrigem.getText();
        double anoNascimento = Double.parseDouble(tfAnoNascimento.getText());

        AutorBanda ab = new AutorBanda(nome, cidadeOrigem, anoNascimento);

        return ab;
    }

    public Albuns coletaAlbuns(){



    }




}

package controle;


import Entity.Albuns;
import Entity.AutorBanda;
import Entity.Musica;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;


public class Cadastro {

    @FXML
    private TextField tfNomeBanda;
    @FXML
    private TextField tfCidadeOrigem;
    @FXML
    private TextField tfAnoNascimento;
    @FXML
    private TextField tfNomeAlbum;
    @FXML
    private TextField tfAnoLancamento;
    @FXML
    private TextField tfNumeroDeMusicas;
    @FXML
    private Button btMusicas;

    @FXML
    private TextField tfNomeMusica;
    @FXML
    private TextField tfCompositores;
    @FXML
    private TextField tfDuracao;
    @FXML
    private DatePicker dpDuracao;
    @FXML
    private ListView<Musica> ltvMusica;
    private ObservableList<Musica> obsMusica;

    @FXML
    private TextArea verDescricao;
    @FXML
    private Text txtQtdMusicas;

    Albuns albuns = new Albuns();
    ArrayList<Musica> mus = new ArrayList<>();

    @FXML
    private void acaoClickLista() {
        Musica m = ltvMusica.getSelectionModel().getSelectedItem();
        Dialog<ButtonType> dialog = new Dialog<>();

        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("listMusic.fxml"));
            Parent content = loader.load();
            dialog.getDialogPane().setContent(content);
            dialog.getDialogPane().getButtonTypes().add(ButtonType.APPLY);
            dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
            Optional<ButtonType> resultado = dialog.showAndWait();

            if (resultado.isPresent() && resultado.get() == ButtonType.APPLY) {
                if (m != null)
               // atualizaTela();
                verDescricao.setText(m.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public AutorBanda coletaInformacao(){
        String nome = tfNomeBanda.getText();
        String cidadeOrigem = tfCidadeOrigem.getText();
        Integer anoNascimento = Integer.parseInt(tfAnoNascimento.getText());

        AutorBanda ab = new AutorBanda(nome, cidadeOrigem, anoNascimento);

        //System.out.println(ab.toString());


        return ab;
    }

    @FXML
    public Albuns coletaInfoAlbum(){


        String nomeAlbum = tfNomeAlbum.getText();
        Integer anoLancamento = Integer.parseInt(tfAnoLancamento.getText());
        Integer numeroMusicas = Integer.parseInt(tfNumeroDeMusicas.getText());



        Albuns ab = new Albuns(nomeAlbum, anoLancamento, numeroMusicas,cadastrarMusica());

        System.out.println(ab.toString());
        return ab;
    }

    @FXML
    public Musica addMusics(){


        String nomeMusica = tfNomeMusica.getText();
        String compositor = tfCompositores.getText();
        String duracao = tfDuracao.getText();

        return new Musica(nomeMusica,compositor,duracao);
    }

    public ArrayList<Musica> cadastrarMusica(){

        ArrayList<Musica>musicas = new ArrayList<>();

        musicas.add(addMusics());

        return musicas;
    }


    public void atualizaTela() {
        atualizaLista();
        txtQtdMusicas.setText("Total de Pessoas:" + albuns.getMusicas().size());
    }

    private void atualizaLista(){
        ltvMusica.getItems().clear();
        ltvMusica.getItems().addAll(albuns.getMusicas());
    }


}

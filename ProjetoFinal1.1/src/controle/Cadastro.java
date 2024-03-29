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
    @FXML
    private TextArea verDescricao;
    @FXML
    private Text txtQtdMusicas;

    Albuns albuns = new Albuns();
    private ArrayList<Musica> mus = new ArrayList<>();


    public ArrayList<Musica> getMus() {
        return mus;
    }

    /*
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
            dialog.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
            Optional<ButtonType> resultado = dialog.showAndWait();

           // if (resultado.isPresent() && resultado.get() == ButtonType.APPLY) {
             //   if (m != null)
                verDescricao.setText(m.toString());
            //}

        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

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


        Albuns ab = new Albuns(nomeAlbum, anoLancamento, numeroMusicas,getMus());

        System.out.println(ab.toString());
        return ab;
    }

    @FXML
    public void addMusics() {

        String nomeMusica = tfNomeMusica.getText();
        String compositor = tfCompositores.getText();
        String duracao = tfDuracao.getText();

        if(recebemusica(nomeMusica, compositor, duracao)){
            atualizaTela();
        }
    }

    public boolean recebemusica(String a, String b, String c){

        if(mus.add(new Musica(a,b,c))){
            return true;
        }
        return false;
    }

    public void atualizaTela() {
        atualizaLista();
        txtQtdMusicas.setText("Total de Pessoas:" + getMus().size());
    }

    private void atualizaLista(){
        ltvMusica.getItems().clear();
        ltvMusica.getItems().addAll(getMus());
    }


}

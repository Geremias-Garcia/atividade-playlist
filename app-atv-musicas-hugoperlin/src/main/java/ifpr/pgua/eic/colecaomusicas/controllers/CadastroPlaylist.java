package ifpr.pgua.eic.colecaomusicas.controllers;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.github.hugoperlin.results.Resultado;

import ifpr.pgua.eic.colecaomusicas.App;
import ifpr.pgua.eic.colecaomusicas.model.entities.Genero;
import ifpr.pgua.eic.colecaomusicas.model.entities.Musica;
import ifpr.pgua.eic.colecaomusicas.model.repositories.RepositorioGeneros;
import ifpr.pgua.eic.colecaomusicas.model.repositories.RepositorioMusicas;
import ifpr.pgua.eic.colecaomusicas.model.repositories.RepositorioPlaylist;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;

public class CadastroPlaylist{
    
    @FXML
    private TextField tfId;

    @FXML
    private TextField tfNome;

    private RepositorioPlaylist repositorio;

    public CadastroPlaylist(RepositorioPlaylist repositorio){
        this.repositorio = repositorio;
    }

    @FXML
    void cadastrar(ActionEvent event) {
        String nome = tfNome.getText();

        String msg = repositorio.cadastrarPlaylist(nome);

        Alert alert = new Alert(AlertType.INFORMATION,msg);
        alert.showAndWait();

    }

    @FXML
    void cancelar(ActionEvent event) {
        App.popScreen();
    }
    
}
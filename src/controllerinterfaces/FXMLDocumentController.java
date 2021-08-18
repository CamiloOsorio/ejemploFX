/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerinterfaces;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.swing.JOptionPane;
import modelo.JugadorFutbol;
import vista.EjemploFX;

/**
 *
 * @author oso
 */
public class FXMLDocumentController implements Initializable {

    LinkedList<JugadorFutbol> listajf;

    Image imagen;

    @FXML
    private Label tituloL;

    @FXML
    private Label telefonoL;

    @FXML
    private Label correoL;

    @FXML
    private Label numerodL;

    @FXML
    private Label posicionL;

    @FXML
    private Label nombreL;

    @FXML
    private TextField txtnombre;

    @FXML
    private TextField txttelefono;

    @FXML
    private TextField txtcorreo;

    @FXML
    private TextField txtnumerod;

    @FXML
    private TextField txtposicion;

    @FXML
    private ImageView img;

    @FXML
    private ImageView img1;

    @FXML
    private void mostrarJugador(ActionEvent event) {

        String mostrar = "";

        for (int i = 0; i < listajf.size(); i++) {
            JugadorFutbol jugador = listajf.get(i);
            mostrar += jugador.toString() + "\n";
        }
        System.out.println(mostrar);
        //JOptionPane.showMessageDialog(null, mostrar);
    }

    @FXML
    private void agregarJugador(ActionEvent event) {

        String nomj = txtnombre.getText();
        String telj = txttelefono.getText();
        String correoj = txtcorreo.getText();
        int numj = Integer.parseInt(txtnumerod.getText());
        String posj = txtposicion.getText();

        JugadorFutbol objjugador = new JugadorFutbol(numj, posj, nomj, telj, correoj);

        listajf.add(objjugador);
    }

    Timer timer = new Timer();

    @FXML
    private void mostrarImagen(ActionEvent event) {
        //img.setImage(imagen);

        TimerTask tarea = new TimerTask() {
            int i1 = 1;

            @Override
            public void run() {

                imagen = new Image("/imagenes/" + "i" + i1 + ".jpg");
                img.setImage(imagen);
                i1 = i1 + 1;
                if (i1 == 4) {
                    i1 = 1;

                }
            }
        };
        
         
        TimerTask tarea2 = new TimerTask() {
            int i = 1;
            @Override
            public void run() {
                 imagen = new Image("/imagenes/"+"i"+ i + ".jpg");
                img1.setImage(imagen);
                i = i+1;
                if (i==4)
                i=1;
            }
        };
        
        timer.schedule(tarea, 0, 1000);
        timer.schedule(tarea2, 0, 1000);
        
    }
    
    @FXML

    private void cancel(ActionEvent event) {

        timer.cancel();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        listajf = new LinkedList<>();
        imagen = new Image("/imagenes/i1.jpg");
        //imagen2 = new Image("/imagenes/i2.jpg");

    }

}

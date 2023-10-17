package es.ieslosmontecillos.di_432_anonymousinnerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BotonesAnonymousClass extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        BorderPane root = new BorderPane();

        primaryStage.setTitle("Botones Anonymous Class");

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);

        //Creamos la hbox
        HBox hbox = new HBox(10);

        //Creamos los botones
        Button btn1 = new Button("New");
        Button btn2 = new Button("Open");
        Button btn3 = new Button("Save");
        Button btn4 = new Button("Print");

        //Añadimos los botones a la hbox
        hbox.getChildren().addAll(btn1, btn2, btn3, btn4);

        //Centramos la hbox
        root.setCenter(hbox);
        hbox.setAlignment(Pos.CENTER);

        //Añadimos los eventos mediante Clases Anónimas
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println("Nuevo Proceso");
            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println("Abrir Proceso");
            }
        });

        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Guardar Proceso");
            }
        });

        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Imprimir Proceso");
            }
        });

        //Mostramos la ventana
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
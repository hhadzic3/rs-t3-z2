package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {

       /* Scanner ulaz = new Scanner(System.in);

        System.out.println("Unesite jednu recenicu: ");
        String recenica = ulaz.nextLine();

        String najduza = "";

        String recenica2 = "";

        for( String rijec : recenica.split(" ") ){
            if(rijec.length() > najduza.length() )
                najduza = rijec;
        }


        for (String rijec2 : recenica.split(" ")){
            if ( rijec2.equals(najduza))
                rijec2 = rijec2.toUpperCase();

            recenica2 += rijec2 + " ";

        }
        System.out.println("Recenica sada glasi: " + recenica2 );
*/
        launch(args);

    }







}

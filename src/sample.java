import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.util.Scanner;

public class sample {
    public TextField unos;

    public TextField ispis;

    public void akcija(ActionEvent actionEvent) {

        String recenica = unos.getText();

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
        ispis.setText(recenica2);


    }
}

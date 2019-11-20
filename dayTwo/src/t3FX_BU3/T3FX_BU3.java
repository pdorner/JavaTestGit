package t3FX_BU3;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class T3FX_BU3 extends Application {

	@Override
	public void start(Stage primaryStage) {
		CheckBox ck1 = new CheckBox ("Eins");
		ck1.setAllowIndeterminate(true);
		
		ck1.setIndeterminate(true);
		CheckBox ck2 = new CheckBox ("Zwei");
		Label lbl1 = new Label ();
		Label lbl2 = new Label ();
		TextField txt1 = new TextField("nichts ausgewählt");
		txt1.setPrefWidth(400);
		ck1.setOnAction(e->{
			if (ck1.isIndeterminate() && ck2.isSelected())
				txt1.setText("ck1 is indeterminate, ck2 is aktiv");
			else if (ck1.isIndeterminate())
				txt1.setText("ck1 ist indeterminate + ck2 inaktiv");
			else if (ck1.isSelected() & ck2.isSelected())
				txt1.setText("ck1 + ck2 aktiv");
			else if (ck2.isSelected())
				txt1.setText("ck2 aktiv, ck1 inaktiv");
			else if (ck1.isSelected())
				txt1.setText("nur ck1 aktive");
			else
				txt1.setText("ck1 + ck 2 inaktiv");
		});
		ck2.setOnAction(e->{
			if (ck1.isIndeterminate() && ck2.isSelected())
				txt1.setText("ck1 is indeterminate, ck2 is aktiv");
			else if (ck1.isIndeterminate())
				txt1.setText("ck1 ist indeterminate + ck2 inaktiv");
			else if (ck1.isSelected() & ck2.isSelected())
				txt1.setText("ck1 + ck2 aktiv");
			else if (ck2.isSelected())
				txt1.setText("ck2 aktiv, ck1 inaktiv");
			else if (ck1.isSelected())
				txt1.setText("nur ck1 aktive");
			else
				txt1.setText("ck1 + ck 2 inaktiv");
		});

		
		
		
			
		HBox hb1 = new HBox (20, ck1, ck2, txt1, lbl1, lbl2);
		Scene scene = new Scene (hb1);
		primaryStage.setScene(scene);
		primaryStage.setTitle ("T3FX_BU2");
		primaryStage.show();
		
			

		
	}

	public static void main(String[] args) {
		launch(args);
	}
}

package dayThree;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DayThree extends Application {

	@Override
	public void start(Stage primaryStage) {
		Button textInputShow = new Button("Check Value");
		TextField tf = new TextField();
		Label lb = new Label();
		DatePicker db = new DatePicker();
		textInputShow.setOnAction(e -> {
			if (Integer.parseInt(tf.getText()) > 2000000) {
				System.out.println("Number is negative\r\n");
				lb.setText("Number is over 2000000");
			}
			else if (Integer.parseInt(tf.getText()) > 0) {
				System.out.println("Number is positive\r\n");
				lb.setText("Number is positive");
			} else if (Integer.parseInt(tf.getText()) < 0) {
				System.out.println("Number is negative\r\n");
				lb.setText("Number is negativ");
			}
			
			else {
				System.out.println("Number is 0");
				lb.setText("Number is 0");

			}
		});
		TextField tf1 = new TextField();
		Label lb1 = new Label();
		Button b1 = new Button("Insert a number form 1-7 for the Day");
		b1.setOnAction(e -> {
			 switch(Integer.parseInt(tf1.getText())) {
		        case 1 :
		           lb1.setText( "Montag!");
		           break;
		        case 2 :
		        	 lb1.setText( "Dienstag!");
			           break;
		        case  3 :
		        	 lb1.setText("Mittwoch");
		            break;
		        case 4 :
		        	 lb1.setText( "Donnerstag");
		           break;
		        case 5 :
		        	 lb1.setText("Freitag");
		            break;
		        case 6  :
		        	lb1.setText("Samstag");
			            break;
		        case 7  :
		        	lb1.setText("Sonntag");
			            break;
		        default :
		        	lb1.setText( "not a Correct Value");
		}});
		
		TextField tf2 = new TextField();
		TextField tf3 = new TextField();
		TextField tf4 = new TextField();

		Label lb2 = new Label();
		Button b2 = new Button("Compare two Numbers");
		b2.setOnAction(e->{
			int i = Integer.parseInt(tf2.getText());
			int j = Integer.parseInt(tf3.getText());
			int k = Integer.parseInt(tf4.getText());
			System.out.println(i + " " + j);
			if(i > j && i > k){
				if (j > k) {
				lb2.setText(i + " is bigger than " + j +" is bigger than" +k);
				} else {
					lb2.setText(i + " is biggest  " + k +" is bigger than" +k);
				}
			} else if (j > i && j > k){
				if (i > k) {
					lb2.setText(j + " is bigger than " + i +" is bigger than" +k);
					} else {
						lb2.setText(j + " is biggest  " + k +" is bigger than" +i);
					}

			}else {
				if (i > k) {
					lb2.setText(k + " is bigger than " + i +" is bigger than" +j);
					} else {
						lb2.setText(k + " is biggest  " + j +" is bigger than" +i);
					}
				lb2.setText(k + " is bigger than " + j + " and " + i);
			}
		});
		
		
		HBox hb1 = new HBox(20, textInputShow, tf);
		HBox hb2 = new HBox(20, b1, tf1);
		HBox hb3 = new HBox(20, b2, tf2, tf3, tf4);

		VBox vb1 = new VBox(20, hb1, lb, db, hb2, lb1, hb3, lb2);
		primaryStage.setScene(new Scene(vb1));
		primaryStage.setTitle("T3FX_TRV1");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

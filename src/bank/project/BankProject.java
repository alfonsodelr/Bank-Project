
package bank.project;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BankProject extends Application {
    
    private String m_accountNum = "";
    private String m_amount = "";
    private double m_balance = 0.0f;
    
    public void deposit(){
        
    }
    
    public void withdraw(){
        
    }
    
    public String getAccountNumber(){
        return m_accountNum;
    }
    
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane root = new GridPane();
        root.setPadding(new Insets(10,10,10,10));
        root.setVgap(5);
        root.setHgap(5);
        HBox buttonHolder = new HBox(5);
        
        final Label output = new Label();
        output.setText("");
        
        Label text = new Label();
        Label text2 = new Label();
        text.setText("Account Number:");
        text2.setText("Amount $");
        
        TextField textbox = new TextField();
        textbox.setPrefColumnCount(10);
        TextField textbox2 = new TextField();
        textbox2.setPrefColumnCount(10);
        
        
        Button balance = new Button("Balance");
        balance.setMinSize(Button.USE_PREF_SIZE, Button.USE_PREF_SIZE);
        
        Button deposit = new Button("Deposit");
        deposit.setMinSize(Button.USE_PREF_SIZE, Button.USE_PREF_SIZE);
        
        Button withdraw = new Button("Withdraw");
        withdraw.setMinSize(Button.USE_PREF_SIZE, Button.USE_PREF_SIZE);
        
        Button quit = new Button("Quit");
        quit.setMinSize(Button.USE_PREF_SIZE, Button.USE_PREF_SIZE);
        
        buttonHolder.getChildren().addAll(balance,deposit,withdraw,quit);
        
        //text and textboxes
        
        root.add(text,0,0);
        root.add(textbox,1,0);
        root.add(text2, 0, 1);
        root.add(textbox2, 1,1);
        root.add(buttonHolder, 0, 2);
        root.add(output,0,3);
        
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Client");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        balance.setOnAction((ActionEvent event) -> {
            output.setText("Balance: " + String.valueOf(m_balance));
        });
        
        deposit.setOnAction((ActionEvent event) -> {
            System.out.println("deposit");
        });
        
        withdraw.setOnAction((ActionEvent event) -> {
            System.out.println("withdraw");
        });
        
        quit.setOnAction((ActionEvent event) -> {
            System.exit(0);
        });
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}


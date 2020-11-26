package Main.Model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static int randarr[]=new int[9];

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("../View/ui.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 375));
        primaryStage.show();
    }

    public static void arraycreate()
    {
        for(int i=0;i<randarr.length;i++)
        {
            randarr[i]=0;
        }
    }

    public static void main(String[] args)
    {
        arraycreate();
        launch(args);
    }
}

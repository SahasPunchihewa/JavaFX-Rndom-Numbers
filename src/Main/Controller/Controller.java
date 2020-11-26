package Main.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;

public class Controller extends Main.Model.Main
{
    @FXML
    private Label l1,l2,l3,l4,l5,l6,l7,l8,l9;
    private static int rand=0;
    private int count=0;

    public static void randomgen()
    {
        Random ran=new Random();
        rand=ran.nextInt(10);
        if(rand==0)
        {
            randomgen();
        }
    }

    public void uniquecheck()
    {
        for(int i=0;i<randarr.length;i++)
        {
            if(randarr[i]!=0)
            {
                if(randarr[i]==rand)
                {
                    randomgen();
                    uniquecheck();
                    break;
                }
            }
        }
    }

    public void generator()
    {
        count++;
        if(count<10)
        {
            randomgen();
            if(count==1)
            {
                uniquecheck();
                randarr[count-1]=rand;
                l1.setText(String.valueOf(rand));
            }
            else if(count==2)
            {
                uniquecheck();
                randarr[count-1]=rand;
                l2.setText(String.valueOf(rand));
            }
            else if(count==3)
            {
                uniquecheck();
                randarr[count-1]=rand;
                l3.setText(String.valueOf(rand));
            }
            else if(count==4)
            {
                uniquecheck();
                randarr[count-1]=rand;
                l4.setText(String.valueOf(rand));
            }
            else if(count==5)
            {
                uniquecheck();
                randarr[count-1]=rand;
                l5.setText(String.valueOf(rand));
            }
            else if(count==6)
            {
                uniquecheck();
                randarr[count-1]=rand;
                l6.setText(String.valueOf(rand));
            }
            else if(count==7)
            {
                uniquecheck();
                randarr[count-1]=rand;
                l7.setText(String.valueOf(rand));
            }
            else if(count==8)
            {
                uniquecheck();
                randarr[count-1]=rand;
                l8.setText(String.valueOf(rand));
            }
            else if(count==9)
            {
                uniquecheck();
                randarr[count-1]=rand;
                l9.setText(String.valueOf(rand));
            }

        }
    }

}

package za.ac.cput.ngosa; /**
 * Created by User on 2015/02/13.
 */
import javax.lang.*;
import java.lang.System;import java.util.Scanner;

public class UserInput {
    float fluid;
    float cubic;


    Scanner input= new Scanner(System.in);
    public void setFluid()
    {
        System.out.println("How much liquid is in container: ");
        fluid= input.nextFloat();
    }

    public void setCubic()
    {
        System.out.println("How much solid is in container: ");
        cubic= input.nextFloat();
    }

    public float getFluid()
    {
        return fluid;
    }

    public float getCubic()
    {
        return cubic;
    }
}

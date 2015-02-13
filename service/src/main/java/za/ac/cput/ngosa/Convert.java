package za.ac.cput.ngosa;import java.lang.String;import java.lang.System; /**
 * Created by User on 2015/02/13.
 */
public class Convert {

    float litres;
    float meters;
    public void convertToSolid(float m) {
        meters = m / 1000;
        String output= String.format("%.2f litres is %.2f cubic meters", m,meters);
        System.out.println(output);

    }

    public void convertToLiquid(float n){
        litres = n *1000;
        String output= String.format("%.2f litres is %.2f cubic meters", n,litres);
        System.out.println(output);
    }

}

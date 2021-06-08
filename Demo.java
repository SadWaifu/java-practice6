import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner objScan = new Scanner(System.in);
        String textInput = objScan.nextLine();

        String[] arrInput = textInput.split(" ");
        double fNumber = Double.parseDouble(arrInput[0]);

        if(arrInput[1].equals("USD")) {
            USD objUSD = new USD();
            System.out.println(String.format("%.2f", objUSD.getConvert(fNumber)) + " UAH");
        }
        else if(arrInput[1].equals("EUR")) {
            Euro objEuro = new Euro();
            System.out.println(String.format("%.2f", objEuro.getConvert(fNumber)) + " UAH");
        }
        else {
            System.out.println("Only dollars and euros are supported");
        }

        objScan.close();
    }
}

/*
public interface Conversion {
    double getConvert(double arg_num);
}
*/

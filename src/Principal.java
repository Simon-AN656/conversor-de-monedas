import com.conversor.Conversor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ApiRequest resultConvert = new ApiRequest();
        Scanner readBase = new Scanner(System.in);
        Scanner readTarget = new Scanner(System.in);
        System.out.println("Ingrese el codigo de moneda de la base del tipo de cambio");
        var baseConvert = readBase.nextLine();
        System.out.println("Ingrese el codigo a lo que lo desea convertir");
        var targetConvert = readTarget.nextLine();
        Conversor convercionBase = resultConvert.convercion(baseConvert,targetConvert);
        System.out.println(convercionBase.conversion_rate());

    }
}

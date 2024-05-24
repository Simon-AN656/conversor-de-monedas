import com.conversor.Conversor;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        ApiRequest resultConvert = new ApiRequest();
        Scanner readMenu = new Scanner(System.in);
        String baseConvert;
        String targetConvert;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1.- Dolar a Peso Argentino");
            System.out.println("2.- Peso Argentino a Dolar");
            System.out.println("3.- Dolar a Real Brasileño");
            System.out.println("4.- Real Brasileño a Dolar");
            System.out.println("5.- Dolar a Peso Colombiano");
            System.out.println("6.- Peso Colombiano a Dolar");
            System.out.println("7.- Dolar a Peso Mexicano");
            System.out.println("8.- Peso Mexicano a Dolar");
            System.out.println("9.- Salir");

            System.out.print("Selecciona una opción: ");
            int selection = Integer.parseInt(readMenu.nextLine());

            switch (selection) {
                case 1:
                    baseConvert = "USD";
                    targetConvert = "ARS";
                    Conversor conversionDA = resultConvert.conversion(baseConvert,targetConvert);
                    System.out.println("Conversion de Dolar a Peso Argentino: "+conversionDA.conversion_rate());
                    GeneradorArchivos generadorDA = new GeneradorArchivos();
                    generadorDA.guardarJson(conversionDA);
                    break;
                case 2:
                    baseConvert = "ARS";
                    targetConvert = "USD";
                    Conversor conversionAD = resultConvert.conversion(baseConvert,targetConvert);
                    System.out.println("Conversion de Peso Argentino a Dolar: " + conversionAD.conversion_rate());
                    GeneradorArchivos generadorAD = new GeneradorArchivos();
                    generadorAD.guardarJson(conversionAD);
                    break;
                case 3:
                    baseConvert = "USD";
                    targetConvert = "BRL";
                    Conversor conversionUB = resultConvert.conversion(baseConvert,targetConvert);
                    System.out.println("Conversion de Dolar a Real Brasileño: " + conversionUB.conversion_rate());
                    GeneradorArchivos generadorUB = new GeneradorArchivos();
                    generadorUB.guardarJson(conversionUB);
                    break;
                case 4:
                    baseConvert = "BRL";
                    targetConvert = "USD";
                    Conversor conversionBD = resultConvert.conversion(baseConvert,targetConvert);
                    System.out.println("Conversion de Real Brasileño a Dolar: " + conversionBD.conversion_rate());
                    GeneradorArchivos generadorBD = new GeneradorArchivos();
                    generadorBD.guardarJson(conversionBD);
                    break;
                case 5:
                    baseConvert = "USD";
                    targetConvert = "COP";
                    Conversor conversionDC = resultConvert.conversion(baseConvert,targetConvert);
                    System.out.println("Conversion de Dolar a Peso Colombiano: " + conversionDC.conversion_rate());
                    GeneradorArchivos generadorDC = new GeneradorArchivos();
                    generadorDC.guardarJson(conversionDC);
                    break;
                case 6:
                    baseConvert = "COP";
                    targetConvert = "USD";
                    Conversor conversionCD = resultConvert.conversion(baseConvert,targetConvert);
                    System.out.println("Conversion de Peso Colombiano a Dolar: " + conversionCD.conversion_rate());
                    GeneradorArchivos generadorCD = new GeneradorArchivos();
                    generadorCD.guardarJson(conversionCD);
                    break;
                case 7:
                    baseConvert = "USD";
                    targetConvert = "MXN";
                    Conversor conversionDM = resultConvert.conversion(baseConvert,targetConvert);
                    System.out.println("Conversion de Dolar a Peso Mexicano: " + conversionDM.conversion_rate());
                    GeneradorArchivos generadorDM = new GeneradorArchivos();
                    generadorDM.guardarJson(conversionDM);
                    break;
                case 8:
                    baseConvert = "MXN";
                    targetConvert = "USD";
                    Conversor conversionMD = resultConvert.conversion(baseConvert,targetConvert);
                    System.out.println("Conversion de Peso Mexicano a Dolar: " + conversionMD.conversion_rate());
                    GeneradorArchivos generadorMD = new GeneradorArchivos();
                    generadorMD.guardarJson(conversionMD);
                    break;
                case 9:
                    System.out.println("Saliendo del menú.");
                    return;
                default:
                    System.out.println("Opción no válida, por favor selecciona una opción del 1 al 9.");
                    break;
            }

        }
    }

}

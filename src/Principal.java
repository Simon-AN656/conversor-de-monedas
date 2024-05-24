import com.conversor.Conversor;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        ApiRequest resultConvert = new ApiRequest();
        Scanner readMenu = new Scanner(System.in);
        String menu = ("""
                Menu:
                1.- Dolar a Peso Argentino
                2.- Peso Argentino a Dolar
                3.- Dolar a Real Brasileño
                4.- Real Brasileño a Dolar
                5.- Dolar a Peso Colombiano
                6.- Peso Colombiano a Dolar
                7.- Dolar a Peso Mexicano
                8.- Peso Mexicano a Dolar
                9.- Salir""");
        String[][] conversions = {
                {"USD", "ARS", "Dolar a Peso Argentino"},
                {"ARS", "USD", "Peso Argentino a Dolar"},
                {"USD", "BRL", "Dolar a Real Brasileño"},
                {"BRL", "USD", "Real Brasileño a Dolar"},
                {"USD", "COP", "Dolar a Peso Colombiano"},
                {"COP", "USD", "Peso Colombiano a Dolar"},
                {"USD", "MXN", "Dolar a Peso Mexicano"},
                {"MXN", "USD", "Peso Mexicano a Dolar"}
        };

        while (true) {
            System.out.println(menu);

            System.out.print("Selecciona una opción: ");
            try {
                int selection = Integer.parseInt(readMenu.nextLine());

                if (selection >= 1 && selection <= conversions.length) {
                    String[] selectedConversion = conversions[selection - 1];
                    String baseConvert = selectedConversion[0];
                    String targetConvert = selectedConversion[1];
                    String description = selectedConversion[2];

                    Conversor conversion = resultConvert.conversion(baseConvert, targetConvert);
                    System.out.println("Conversion de " + description + ": " + conversion.conversion_rate());

                    GeneradorArchivos generador = new GeneradorArchivos();
                    generador.guardarJson(conversion);
                } else if (selection == 9) {
                    System.out.println("Saliendo del menú.");
                    return;
                } else {
                    System.out.println("Opción no válida, por favor selecciona una opción del 1 al 9.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Ingresaste un caracter en lugar de un numero");
            }
        }
    }
}

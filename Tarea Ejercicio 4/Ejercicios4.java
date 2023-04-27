public class Main {

    public static void main(String[] args) {
        
        int numeroIf = 0;

        if (numeroIf > 0) {
            System.out.println(numeroIf + " Es un numero positivo");
        } else if (numeroIf < 0) {
            System.out.println(numeroIf + " Es un numero negativo");
        } else {
            System.out.println("Su valor es igual a 0");
        }

        // Parte 2 While

        int numeroWhile = 1;

         while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile ++;
         }

         // Parte 3 Do While

         int numeroDoWhile = 3;

         do {
            System.out.println(numeroDoWhile);
            numeroDoWhile ++;
         } while(numeroDoWhile < 3);

         // Parte 4 Bucle For

         for (int numeroFor = 0; numeroFor <= 3; numeroFor ++) {
            System.out.println(numeroFor);
         }  

         // Parte 5 Switch

         var estaciones = "Otoño";

         switch (estaciones) {
            case "Invierno":
            System.out.println("La estacion del año es Invierno");
            break;
            case "Verano":
            System.out.println("La estacion del año es Verano");
            break;
            case "Primavera":
            System.out.println("La estacion del año es Primavera");
            break;
            case "Otoño":
            System.out.println("La estacion del año es Otoño");
            break;
            default:
            System.out.println("Esa no es una estación del año");
         }
    }
}
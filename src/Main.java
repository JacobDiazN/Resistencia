import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Double resistencia1 = 0.0;
        Double resistencia2 = 0.0;
        Double resistencia3 = 0.0;
        Double resistencisTotal = 0.0;
        String ohmios = "ohmios";
        Scanner sc = new Scanner(System.in);


        do{
            System.out.printf("Ingrese resistencia 1: ");
            resistencia1 = sc.nextDouble();
            if(resistencia1 <= 0) {
                System.out.println("Dato inválido, ingrese una resistencia superior a 0");
            }
        }while(resistencia1 <= 0);

        do{
            System.out.printf("Ingrese resistencia 2: ");
            resistencia2 = sc.nextDouble();
            if(resistencia2 <= 0) {
                System.out.println("Dato inválido, ingrese una resistencia superior a 0");
            }
        }while(resistencia2 <= 0);

        do{
            System.out.printf("Ingrese resistencia 3: ");
            resistencia3 = sc.nextDouble();
            if(resistencia3 <= 0) {
                System.out.println("Dato inválido, ingrese una resistencia superior a 0");
            }
        }while(resistencia3 <= 0);

        resistencisTotal = ((1)/((1/resistencia1) + (1/resistencia2) + (1/resistencia3)));

        System.out.println("\n _________________________________________");
        System.out.printf("| La resistencia total es de: %.2f %s", resistencisTotal, ohmios + " |\n");
        System.out.println("|_________________________________________|\n");
    }
}
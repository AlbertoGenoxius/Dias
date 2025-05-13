import java.util.Scanner;
public class Onichan {
    public static void main(String[] args) {
        Scanner UWU = new Scanner(System.in);
        int dia;
        do {
        System.out.println("Ingresa el numero dia de la semana ingrese 8 para salir: ");
        dia = UWU.nextInt();
        if (dia == 1) {
            System.out.println("Lunes");
        }else if (dia == 2) {
            System.out.println("Martes");
        }else if (dia == 3) {
            System.out.println("Miercoles");
        }else if (dia == 4) {
            System.out.println("Jueves");
        }else if (dia == 5) {
            System.out.println("Viernes");
        }else if (dia == 6) {
            System.out.println("Sabado");
        }else if (dia == 7) {
            System.out.println("Domingo");
        }else if (dia == 8){
            System.out.println("Saliendo del Programa");
        }else{
            System.out.println("Dia invalido");
        }
        }while (dia != 8);
    }
}
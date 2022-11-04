package lab4p1_andreflores;

import java.util.Scanner;

public class Lab4P1_AndreFlores {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("Menu");
            System.out.println("1 -> Sumador binario");
            System.out.println("2 -> Contains");
            System.out.println("3 -> Alpha");
            System.out.println("4 -> Salida");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1 -> {
                    String cadena1, cadena2;
                    System.out.println("Ingrese el primer numero, solo 1s y 0s:  ");
                    cadena1 = leer.next();
                    System.out.println("Ingrese el segundo numero, solo 1s y 0s:  ");
                    cadena2 = leer.next();

                } // fin case 1
                case 2 -> {
                    String cadena1, cadena2;
                    int largo1, largo2;
                    System.out.println("Ingrese su primera cadena:  ");
                    leer.nextLine();
                    cadena1=leer.nextLine();
                    System.out.println(cadena1);
                    System.out.println("Ingrese su segunda cadena (mas corta que la primera):  ");
                    //leer.nextLine();
                    cadena2 = leer.nextLine();
                    largo1 = cadena1.length();
                    largo2 = cadena2.length();
                    contains(cadena1,cadena2,largo1,largo2);
                } // fin case 2
                case 3 -> {
                } // fin case 3
            } // fin switch 
        } // fin do
        while (opcion != 4);

    } // fin del main
public static void contains(String cadena1, String cadena2, int largo1, int largo2){
                       
                    if (largo2 <= largo1) {
                        String acumulador ="";
                        for (int i = 0; i < cadena2.length(); i++) {
                            char letra1 = cadena2.charAt(i);
                            for (int j = 0; j < cadena1.length(); j++) {
                                char letra2 = cadena1.charAt(j);
                                    if(letra1==letra2){
                                        acumulador+=letra1;
                                    }
                            }// fin for exter

                        } // fin while largo
                        //System.out.println("hola");
                        if(acumulador.length()==cadena2.length()){
                            System.out.println("Si incluye la palabra");
                        }
                        /* */
                    }
} // fin contains
} //  fin class

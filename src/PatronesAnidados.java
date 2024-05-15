import java.util.InputMismatchException;
import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variables
        int square = 0;
        int Z = 0;
        int X = 0;
        int l = 0;



        //Mensaje Bienvenida
        System.out.println("------    ------        ----    ---     ---  ---     -----  ");
        System.out.println("-------   -------      --  --    ---   ---   ---    ------- ");
        System.out.println("--    --  --     --   ---  ---    --- ---    ---   ---      ");
        System.out.println("--    --  --     --   ---  ---     -----     ---    -----   ");
        System.out.println("-------   -------     --------     ------    ---     ------ ");
        System.out.println("----      ---  ---    --------    ---  ---   ---         ---");
        System.out.println("---       ---   ---   ---  ---   ---    ---  ---    ------- ");
        System.out.println("---       ---    ---  ---  ---  ---      --- ---     -----  ");
        System.out.println("____________________________________________________________");
        System.out.println("-----------    Bienvenidos a Patrones Anidados   -----------");
        System.out.println("____________________________________________________________");
        System.out.println("");

        do {
            try {


                // Ingreso Patrón n°1
                System.out.println("Ingrese número para Patrón N°1: ");
                square = sc.nextInt();
                Cuadrado(square);
                System.out.println("");

                // Ingreso Patrón n°2
                System.out.println("Ingrese número para Patrón N°2: ");
                Z = sc.nextInt();
                Zeta(Z);
                System.out.println("");

                // Ingreso Patrón n°3
                System.out.println("Ingrese número para Patrón N°3: ");
                X = sc.nextInt();
                EX(X);
                System.out.println("");

                // Ingreso Patrón n°4
                System.out.println("Ingrese número para Patrón N°4: ");
                l = sc.nextInt();
                Pergamino(l);
                System.out.println("");

                //Mensaje despedida
                System.out.println("");
                System.out.println("           |- -- -- -- -- -- -- -|          ");
                System.out.println("   -- -- --|                     |-- -- --  ");
                System.out.println("  |       Gracias por usar Patrones       | ");
                System.out.println("   -- -- --|                     |-- -- --  ");
                System.out.println("           |- -- -- -- -- -- -- -|          ");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");

            } //restricción ingreso de letras
            catch (InputMismatchException ex) {
                System.out.println("Lo siento, solo puede ingresar números");
                System.out.println("");
                System.out.println("");
                sc.next();
            }
        } while (X < 0|| Z < 0 || l < 0 || square < 0);

        sc.close();


    }

    //Patrón Cuadrado
    public static void Cuadrado(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                if (i == 1 || i == length || j == 1 || j == length) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    //Patrón Z
    public static void Zeta(int length) {
        //Variables
        int i=0;
        int j=0;

        for (i = 1; i <= length; i++) {
            for (j = 1; j <= length; j++) {
                if (i == 1 || i == length || i + j == length + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //Patrón X
    public static void EX(int length) {
        //Variables
        int i=0;
        int j=0;

        for (i = 1; i <= length; i++) {
            for (j = 1; j <= length; j++) {
                if (i == j || i + j == length + 1) {
                    System.out.print("x");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    //Patrón Pergamino
    public static void Pergamino(int length) {
        //Variables
        int i=0;
        int j=0;
        int Firstlenght = length - 1;
        int Lastlenght = length == 1 ? 1 : Firstlenght;

        // linea superior
        if (length == 1) {
            System.out.println("*");
        }

        else {
            for (i = 1; i <= Firstlenght; i++) {
                System.out.print("*");
            }
            System.out.println();

            // cuadrado interno
            for (i = 3; i <= length; i++) {

                for (j = 1; j <= length; j++) {
                    if (j == 1 || j == length) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }

                System.out.println();
            }

            // linea inferior
            if (length > 1) {
                for (i = 1; i <= Lastlenght; i++) {
                    if (i == 1) {
                        System.out.print(" *");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }

        }
    }
}

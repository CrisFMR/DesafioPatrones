import java.util.InputMismatchException;
import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //Variables
        int n =0;
        int i =0;

        //Mensaje bienvenida
        System.out.println("------    ------        ----    ---     ---  ---     -----  ");
        System.out.println("-------   -------      --  --    ---   ---   ---    ------- ");
        System.out.println("--    --  --     --   ---  ---    --- ---    ---   ---      ");
        System.out.println("--    --  --     --   ---  ---     -----     ---    -----   ");
        System.out.println("-------   -------     --------     ------    ---     ------ ");
        System.out.println("----      ---  ---    --------    ---  ---   ---         ---");
        System.out.println("---       ---   ---   ---  ---   ---    ---  ---    ------- ");
        System.out.println("---       ---    ---  ---  ---  ---      --- ---     -----  ");
        System.out.println("____________________________________________________________");
        System.out.println("------------   Bienvenidos a Desafio Patrones   ------------");
        System.out.println("____________________________________________________________");
        try {


            do {
                try {
                    // Indicación de ingreso
                    System.out.println("- Ingrese un número para comenzar con la muestra:");
                    n = sc.nextInt();

                    // Comienzo Patrón n°1
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Patrón N°1");
                    for (i = 1; i <= n; i++) {
                        if (i % 2 == 0) {
                            System.out.print(".");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                    System.out.println("");
                    // Fin Patrón n°1

                    // Comienzo Patron n°2
                    System.out.println("Patrón N°2");
                    for (i = 1; i <= n; i++) {
                        if ((i % 4) != 0) {
                            System.out.print(i % 4);
                        } else {
                            System.out.print(4);
                        }
                    }
                    System.out.println("");
                    System.out.println("");
                    // Fin Patrón n°2

                    // Comienzo Patron n°3
                    System.out.println("Patrón N°3");
                    for (i = 1; i <= n; i++) {
                        if ((i % 3) == 0) {
                            System.out.print("*");
                        } else {
                            System.out.print("|");
                        }
                    }
                    // Fin Patrón n°2

                    //Mensaje despedida
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("           |- -- -- -- -- -- -- -|          ");
                    System.out.println("   -- -- --|                     |-- -- --  ");
                    System.out.println("  |       Gracias por usar Patrones       | ");
                    System.out.println("   -- -- --|                     |-- -- --  ");
                    System.out.println("           |- -- -- -- -- -- -- -|          ");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");

                }//restricción ingreso de letras
                catch (InputMismatchException ex) {
                        System.out.println("Lo siento, solo puede ingresar números");
                        System.out.println("");
                        System.out.println("");
                        sc.next();
                    }
                } while (n < 0);
                sc.close();

        } catch (Exception e) {

        }

    }

}


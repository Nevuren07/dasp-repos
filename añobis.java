import java.util.Scanner;

public class añobis {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un año: ");
        int mes,me;//definir varialbes utilizadas
        int año = teclado.nextInt();

        if (año % 400 == 0 || (año % 4 == 0 && año % 100 != 0)){//comprobar si el año es bisiesto 
            System.out.println("El año " + año + " es bisiesto");
            
            System.out.println("En que numero de mes estamos?");
            mes = teclado.nextInt();//leer el mes mediante su numero
            me = mes%2;//comprobar si el mes tiene 30 o 31 dias (1 si tiene 30 y 0 si tiene 31)
            if(mes>12){System.out.println("ERROR:. ientroduce un número de mes correcto"); }//coprobar que introduce nien el mes
            else if (mes == 2) {
                System.out.println("tu mes tiene 29 dias, 4 semamas y 1 dia");
            } //si es febrero no tiene ni 30 ni 31 dias pr lo que es condición aparte
            else {
           switch (me) {
            case 0:
                System.out.println("tu mes tiene 31 dias, 4 semanas y 3 dias");
                break;
            case 1:
                System.out.println("tu mes tiene 31 dias, 4 semanas y 2 dias ");
                break;
            default:
                System.out.println("ERROR:. introduce un número de mes correcto");
           }
            }
        }
          else {
            System.out.println("El año " + año + " no es bisiesto");
            System.out.println("En que numero de mes estamos?");
            mes = teclado.nextInt();//leer el mes mediante su numero
            me = mes % 2;//comprobar si el mes tiene 30 o 31 dias (1 si tiene 30 y 0 si tiene 31)
            if (mes > 12) {
                System.out.println("ERROR: introduce un número de mes correcto");
            } else if (mes == 2) {//si es febrero no tiene ni 30 ni 31 dias pr lo que es condición aparte
                System.out.println("tu mes tiene 28 dias y 4 semanas");
            } else {
                switch (me) {
                    case 0:
                        System.out.println("tu mes tiene 31 dias, 4 semanas y 3 dias");
                        break;
                    case 1:
                        System.out.println("tu mes tiene 31 dias, 4 semanas y 2 dias");
                        break;
                    default:
                        System.out.println("ERROR: introduce un número de mes correcto");
                        break;
                }
            }
        }
    }
}
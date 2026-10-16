import java.util.Scanner;

public class añobis {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un año: ");
        int mes,dia,tot,N;//definir varialbes utilizadas
        double tott,tots;
        int año = teclado.nextInt();

        if (año % 400 == 0 || (año % 4 == 0 && año % 100 != 0)){//comprobar si el año es bisiesto 
            System.out.println("El año " + año + " es bisiesto");

            System.out.println("En que numero de mes estamos?");
            mes = teclado.nextInt();//leer el mes mediante su numero
           
            
           
            if( mes<1||mes > 12 ){System.out.println("ERROR:. introduce un número de mes correcto "); }//comprobar que introduce nien el mes
            else {
                tott=mes/3; tots=mes/6; System.out.println("Estamos en el "+Math.ceil(tott)+" trimestre y en el "+Math.ceil(tots)+" semestre");//calcular trimestre y semestre
                System.out.println("Que dia del mes es hoy?");//leer dia de hoy
            dia= teclado.nextInt();
           
                switch (mes) {
                    case 1:
                        if(dia<1||dia>31){System.out.print("ERROR:. introduce un dia correcto ");}//comprobar que introduce bien el dia
                        else{
                        N= 31;
                        if(dia>N){tot=dia-N;}else{tot=N-dia;}//calcular los dias que faltan segun el mes en el que se esta
                        System.out.println("tu mes Es enero, 4 semanas y 3 dias");
                        System.out.println("quedan "+tot+" dias para que acabe el mes");
                        }
                         break;
                    case 2:
                          if(dia<1||dia>29){System.out.print("ERROR:. introduce un dia correcto ");}//comprobar que introduce bien el dia
                        else{
                        N= 29;
                        if(dia>N){tot=dia-N;}else{tot=dia-N;}
                        System.out.println("tu mes es febrero, tiene 4 semanas y 1 dia");
                       //calcular los dias que faltan 
                        System.out.println("quedan "+tot+" dias para que acabe el mes");}
                        break;
                    case 3:
                        if(dia<1||dia>31){System.out.print("ERROR:. introduce un dia correcto");}//comprobar que introduce bien el dia
                        else{   
                        System.out.println("tu mes es marzo, tiene 4 semanas y 3 dias");
                        N= 31;
                         if(dia>N){tot=dia-N;}else{tot=dia-N;}
                       //calcular los dias que faltan
                        System.out.println("quedan "+tot+" dias para que acabe el mes");}
                        break;
                    case 4:
                        if(dia<1||dia>30){System.out.print("ERROR:. introduce un dia correcto");}//comprobar que introduce bien el dia
                        else{   
                        System.out.println("tu mes es abril, tiene 4 semanas y 2 dias");
                        N= 30;
                         if(dia>N){tot=dia-N;}else{tot=dia-N;}
                        tot=dia-N;//calcular los dias que faltan
                        System.out.println("quedan "+tot+" dias para que acabe el mes");}
                        break;
                    case 5:
                        if(dia<1||dia>31){System.out.print("ERROR:. introduce un dia correcto");}//comprobar que introduce bien el dia
                        else{
                        System.out.println("tu mes es mayo, tiene 4 semanas y 3 dias");
                        N= 31;
                        if(dia>N){tot=dia-N;}else{tot=N-dia;}//calcular los dias que faltan
                        System.out.println("quedan "+tot+" dias para que acabe el mes");}
                        break;
                    case 6:
                        if(dia<1||dia>30){System.out.print("ERROR:. introduce un dia correcto");}//comprobar que introduce bien el dia
                        else{
                        System.out.println("tu mes es junio, tiene 4 semanas y 2 dias");
                        N= 30;
                        if(dia>N){tot=dia-N;}else{tot=N-dia;}//calcular los dias que faltan
                        System.out.println("quedan "+tot+" dias para que acabe el mes");}
                        break;
                    case 7:
                        if(dia<1||dia>31){System.out.print("ERROR:. introduce un dia correcto");}//comprobar que introduce bien el dia
                        else{
                        System.out.println("tu mes es julio, tiene 4 semanas y 3 dias");
                        N= 31;
                        if(dia>N){tot=dia-N;}else{tot=N-dia;}//calcular los dias que faltan
                        System.out.println("quedan "+tot+" dias para que acabe el mes");}
                        break;
                    case 8:
                        if(dia<1||dia>31){System.out.print("ERROR:. introduce un dia correcto");}//comprobar que introduce bien el dia
                        else{
                        System.out.println("tu mes es agosto, tiene 4 semanas y 3 dias");
                        N= 31;
                        if(dia>N){tot=dia-N;}else{tot=N-dia;}//calcular los dias que faltan
                        System.out.println("quedan "+tot+" dias para que acabe el mes");}
                        break;
                    case 9:
                        if(dia<1||dia>30){System.out.print("ERROR:. introduce un dia correcto");}//comprobar que introduce bien el dia
                        else{
                        System.out.println("tu mes es septiembre, tiene 4 semanas y 2 dias");
                        N= 30;
                        if(dia>N){tot=dia-N;}else{tot=N-dia;}//calcular los dias que faltan
                        System.out.println("quedan "+tot+" dias para que acabe el mes");}
                        break;
                    case 10:
                        if(dia<1||dia>31){System.out.print("ERROR:. introduce un dia correcto");}//comprobar que introduce bien el dia
                        else{
                        System.out.println("tu mes es octubre, tiene 4 semanas y 3 dias");
                        N= 31;
                        if(dia>N){tot=dia-N;}else{tot=N-dia;}//calcular los dias que faltan
                        System.out.println("quedan "+tot+" dias para que acabe el mes");}
                        break;
                    case 11:
                        if(dia<1||dia>30){System.out.print("ERROR:. introduce un dia correcto");}//comprobar que introduce bien el dia
                        else{
                        System.out.println("tu mes es noviembre, tiene 4 semanas y 2 dias");
                        N= 30;
                        if(dia>N){tot=dia-N;}else{tot=N-dia;}//calcular los dias que faltan
                        System.out.println("quedan "+tot+" dias para que acabe el mes");}
                        break;
                    case 12:
                        if(dia<1||dia>31){System.out.print("ERROR:. introduce un dia correcto");}//comprobar que introduce bien el dia
                        else{
                        System.out.println("tu mes es diciembre, tiene 4 semanas y 3 dias");
                        N= 31;
                        if(dia>N){tot=dia-N;}else{tot=N-dia;}//calcular los dias que faltan
                        System.out.println("quedan "+tot+" dias para que acabe el mes");}
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
           
             if( mes<1||mes > 12 ){System.out.println("ERROR:. introduce un número de mes correcto "); }//comprobar que introduce nien el mes
            else {
                System.out.println("Que dia del mes es hoy?");//ler dia de hoy
            dia= teclado.nextInt();
           
                switch (mes) {
                    case 1:
                        if(dia<1||dia>31){System.out.print("ERROR:. introduce un dia correcto ");}//comprobar que introduce bien el dia
                        else{
                        N= 31;
                        if(dia>N){tot=dia-N;}else{tot=N-dia;}//calcular los dias que faltan segun el mes en el que se esta
                        System.out.println("tu mes Es enero, 4 semanas y 3 dias");
                        System.out.println("quedan "+tot+" dias para que acabe el mes");}
                         break;
                    case 2:
                          if(dia<1||dia>28){System.out.print("ERROR:. introduce un dia correcto ");}//comprobar que introduce bien el dia
                        else{
                        N= 28;
                        if(dia>N){tot=dia-N;}else{tot=dia-N;}
                        System.out.println("tu mes es febrero, tiene 4 semanas y 1 dia");
                       //calcular los dias que faltan 
                        System.out.println("quedan "+tot+" dias para que acabe el mes");}
                        break;
                    case 3:
                        if(dia<1||dia>31){System.out.print("ERROR:. introduce un dia correcto");}//comprobar que introduce bien el dia
                        else{   
                        System.out.println("tu mes es marzo, tiene 4 semanas y 3 dias");
                        N= 31;
                         if(dia>N){tot=dia-N;}else{tot=dia-N;}
                       //calcular los dias que faltan
                        System.out.println("quedan "+tot+" dias para que acabe el mes");}
                        break;
                    case 4:
                        if(dia<1||dia>30){System.out.print("ERROR:. introduce un dia correcto");}//comprobar que introduce bien el dia
                        else{   
                        System.out.println("tu mes es abril, tiene 4 semanas y 2 dias");
                        N= 30;
                         if(dia>N){tot=dia-N;}else{tot=dia-N;}
                        tot=dia-N;//calcular los dias que faltan
                        System.out.println("quedan "+tot+" dias para que acabe el mes");}
                        break;
                    case 5:
                        if(dia<1||dia>31){System.out.print("ERROR:. introduce un dia correcto");}//comprobar que introduce bien el dia
                        else{
                        System.out.println("tu mes es mayo, tiene 4 semanas y 3 dias");
                        N= 31;
                        if(dia>N){tot=dia-N;}else{tot=N-dia;}//calcular los dias que faltan
                        System.out.println("quedan "+tot+" dias para que acabe el mes");}
                        break;
                    case 6:
                        if(dia<1||dia>30){System.out.print("ERROR:. introduce un dia correcto");}//comprobar que introduce bien el dia
                        else{
                        System.out.println("tu mes es junio, tiene 4 semanas y 2 dias");
                        N= 30;
                        if(dia>N){tot=dia-N;}else{tot=N-dia;}//calcular los dias que faltan
                        System.out.println("quedan "+tot+" dias para que acabe el mes");}
                        break;
                    case 7:
                        if(dia<1||dia>31){System.out.print("ERROR:. introduce un dia correcto");}//comprobar que introduce bien el dia
                        else{
                        System.out.println("tu mes es julio, tiene 4 semanas y 3 dias");
                        N= 31;
                        if(dia>N){tot=dia-N;}else{tot=N-dia;}//calcular los dias que faltan
                        System.out.println("quedan "+tot+" dias para que acabe el mes");}
                        break;
                    case 8:
                        if(dia<1||dia>31){System.out.print("ERROR:. introduce un dia correcto");}//comprobar que introduce bien el dia
                        else{
                        System.out.println("tu mes es agosto, tiene 4 semanas y 3 dias");
                        N= 31;
                        if(dia>N){tot=dia-N;}else{tot=N-dia;}//calcular los dias que faltan
                        System.out.println("quedan "+tot+" dias para que acabe el mes");}
                        break;
                    case 9:
                        if(dia<1||dia>30){System.out.print("ERROR:. introduce un dia correcto");}//comprobar que introduce bien el dia
                        else{
                        System.out.println("tu mes es septiembre, tiene 4 semanas y 2 dias");
                        N= 30;
                        if(dia>N){tot=dia-N;}else{tot=N-dia;}//calcular los dias que faltan
                        System.out.println("quedan "+tot+" dias para que acabe el mes");}
                        break;
                    case 10:
                        if(dia<1||dia>31){System.out.print("ERROR:. introduce un dia correcto");}//comprobar que introduce bien el dia
                        else{
                        System.out.println("tu mes es octubre, tiene 4 semanas y 3 dias");
                        N= 31;
                        if(dia>N){tot=dia-N;}else{tot=N-dia;}//calcular los dias que faltan
                        System.out.println("quedan "+tot+" dias para que acabe el mes");}
                        break;
                    case 11:
                        if(dia<1||dia>30){System.out.print("ERROR:. introduce un dia correcto");}//comprobar que introduce bien el dia
                        else{
                        System.out.println("tu mes es noviembre, tiene 4 semanas y 2 dias");
                        N= 30;
                        if(dia>N){tot=dia-N;}else{tot=N-dia;}//calcular los dias que faltan
                        System.out.println("quedan "+tot+" dias para que acabe el mes");}
                        break;
                    case 12:
                        if(dia<1||dia>31){System.out.print("ERROR:. introduce un dia correcto");}//comprobar que introduce bien el dia
                        else{
                        System.out.println("tu mes es diciembre, tiene 4 semanas y 3 dias");
                        N= 31;
                        if(dia>N){tot=dia-N;}else{tot=N-dia;}//calcular los dias que faltan
                        System.out.println("quedan "+tot+" dias para que acabe el mes");}
                        break;
                    default:
                        System.out.println("ERROR:. introduce un número de mes correcto");
                        break;}
                    
                       
                }
            }
                       
               
                }
            }
        
    

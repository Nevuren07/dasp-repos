import java.util.Scanner;
public class calc {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
       double num1,num2,sol;
       int op;
       System.out.println("introduce el primer número");  
        num1=sc.nextDouble();
        System.out.println("introduce el segundo número");
        num2= sc.nextDouble();
        System.out.println("Introduce la operacion que quieres realizar(1 para suma, 2 para resta, 3 para multipilicar y 4 para dividir)");
        op=sc.nextInt();
        switch (op) {
            case 1:
                sol=num1+num2;
                System.out.println("El resultado de tu suma es "+sol);
                break;
        
            case 2:
                sol=num1-num2;
                System.out.println("El resultado de tu resta es "+sol);
                break;
            case 3:
                sol=num1*num2;
                System.out.println("El resultado de tu multiplicación es "+sol);
                break;
            case 4:
                sol=num1/num2;
                System.out.println("El resultado de tu división es "+sol);
                break;
            default:
                System.out.println("ERROR:. introduce un valor válido");
                break;
        }
        sc.close();
    } 
}


import java.util.Scanner; // Importa la clase Scanner para leer datos del teclado
public class Numeros { // Declara la clase principal; debe llamarse igual que el archivo
public static void main(String[] args) { // Método main: punto de entrada del programa
int num1, num2, num3; // Declara las variables decimales que usaremos
Scanner sc = new Scanner(System.in); // Crea el objeto Scanner para leer desde el teclado
System.out.print("Introduce el primer número: "); // Muestra un mensaje pidiendo el primer número
num1 = sc.nextInt(); // Lee el número escrito por el usuario y lo guarda en num1
System.out.print("Introduce el segundo número: "); // Muestra un mensaje pidiendo la segunda base
num2 = sc.nextInt(); // Lee el número escrito por el usuario y lo guarda en num2
System.out.print("Introduce el tercer número "); // Muestra un mensaje pidiendo el tercer número
num3 = sc.nextInt(); // Lee el número escrito por el usuario y lo guarda en num3
if (num1 > num2 && num2 > num3) { // Comprueba si cumple la condicion de si el mayor es el primero, luego el segundo y luego el tercero
System.out.print("el mayor es "+num1 +"luego le sigue el "+num2 +"y finalmente el menor es "+num3);
} else if(num1 > num3 && num3 > num2) {// Comprueba si cumple la condicion de si el mayor es el primero, luego el tercero y luego el segundo
System.out.print("el mayor es "+num1 +"luego le sigue el "+num3 +"y finalmente el menor es "+num2);
} else if(num2 > num1 && num1 > num3) {// Comprueba si cumple la condicion de si el mayor es el segundo, luego el primero y luego el tercero
    System.out.print("el mayor es "+num2 +"luego le sigue el "+num1 +"y finalmente el menor es "+num3);
} else if(num2>num3 && num3 > num1) {// Comprueba si cumple la condicion de si el mayor es el segundo, luego el primero y luego el tercero
    System.out.print("el mayor es "+num2 +"luego le sigue el "+num3 +"y finalmente el menor es "+num1);
} else if(num3>num1 && num1 > num2) {// Comprueba si cumple la condicion de si el mayor es el tercero, luego el primero y luego el segundo
    System.out.print("el mayor es "+num3 +"luego le sigue el "+num1 +"y finalmente el menor es "+num2);
} else {// Comprueba si cumple la condicion de si el mayor es el tercero, luego el segundo y luego el primero
    System.out.print("el mayor es "+num3 +"luego le sigue el "+num2 +"y finalmente el menor es "+num1);
}

sc.close(); // Cierra el Scanner para liberar recursos
} // Fin del método main
}
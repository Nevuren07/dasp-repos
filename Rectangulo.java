import java.util.Scanner; // Importa la clase Scanner para leer datos del teclado
public class Rectangulo { // Declara la clase principal; debe llamarse igual que el archivo
public static void main(String[] args) { // Método main: punto de entrada del programa
double base, altura, area, perimetro; // Declara las variables decimales que usaremos
Scanner sc = new Scanner(System.in); // Crea el objeto Scanner para leer desde el teclado
System.out.print("Introduce la base: "); // Muestra un mensaje pidiendo la base (sin salto de línea)
base = sc.nextDouble(); // Lee el número escrito por el usuario y lo guarda en base
System.out.print("Introduce la altura: "); // Muestra un mensaje pidiendo la altura
altura = sc.nextDouble(); // Lee el número escrito por el usuario y lo guarda en altura
if (base > 0 && altura > 0) { // Comprueba que ambos valores sean positivos
area = base * altura; // Calcula el área del rectángulo: base por altura
perimetro = 2 * base + 2 * altura; // Calcula el perímetro: suma de los cuatro lados
System.out.println("Area = " + area); // Muestra el área por pantalla (con salto de línea)
System.out.println("Perimetro = " + perimetro); // Muestra el perímetro por pantalla
} else { // Si alguno de los valores es 0 o negativo...
System.out.println("Los datos son incorrectos"); // ...muestra un mensaje de error
} // Fin del if / else
sc.close(); // Cierra el Scanner para liberar recursos
} // Fin del método main
}
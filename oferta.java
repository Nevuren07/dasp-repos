import java.util.Scanner; // Importa la clase Scanner para leer datos del teclado
public class oferta { // Declara la clase principal; debe llamarse igual que el archivo
public static void main(String[] args) { // Método main: punto de entrada del programa
double precio, total, descuento; // Declara las variables decimales que usaremos
int cant;
Scanner sc = new Scanner(System.in); // Crea el objeto Scanner para leer desde el teclado
System.out.print("Introduce el precio del producto: "); // Muestra un mensaje pidiendo el precio
precio = sc.nextDouble(); // Lee el número escrito por el usuario y lo guarda en precio
while( precio<=0){ //verifica si el precio es válido, si no lo es vuelve a pedir que lo introduzcas
    System.out.print("Introduce un precio válido");
    precio = sc.nextDouble();
}
System.out.print("Introduce la cantidad de producto: "); // Muestra un mensaje pidiendo la cntidad
cant = sc.nextInt(); // Lee el número escrito por el usuario y lo guarda en cant
while( cant<=0){ //verifica si la cantidad es válida, si no lo es vuelve a pedir que la introduzcas
    System.out.print("Introduce una cantidad válida");
    cant = sc.nextInt();
}
total = precio * cant; //calcula el total sin descuento 
descuento=total- (0.1*total); //calcula el total con descuento
if(total>precio){ // verifica si se le aplica el descuento viendo si cumle la condición de que si el total es mayor que el 100% se le aplica un 10% de descuento
System.out.print("El precio total es "+descuento+" ya que al ser mayor que el precio original se le aplica un 10%  de descuento");
}else{
    System.out.print("El precio total es: "+total); 
}
sc.close();
}
}


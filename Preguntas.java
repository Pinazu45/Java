import java.util.Scanner;
public class Preguntas
{
    public static void main(String[]args)
    {
        Scanner entrada = new Scanner(System.in);
        int a, b, c;
        System.out.print("Ingresa el valor del primer valor: ");
        a = entrada.nextInt();
        System.out.print("Ingresa el valor del segundo valor: ");
        b = entrada.nextInt();

        if(a > b)
        {
            System.out.print("El primer valor es mayor que el segundo");
        } else {
            System.out.print("El primer valor es menor que el segundo");
        }
    }
}

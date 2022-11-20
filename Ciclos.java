import java.util.Scanner;
public class Ciclos
{
    public static void main()
    {
        Scanner entrada = new Scanner(System.in);
        int a;
        System.out.print("Ingresa Las veces que saludaras: ");
        a = entrada.nextInt();
        for(int i = 0; i < a; i++)

        {
            System.out.print("Hola\n");
        }
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("=-=-=-=-=-= Calculadora Trigonometrica =-=-=-=-=-=\n1. Seno\n2. Coseno\n3. Tangente\n4. Cotangente\n5. Secante\n6. Cosecante\n7.Salir\nDigita la opcion que quieras realizar >>> ");
        int opcionOperacion = scanner.nextInt();

        System.out.print("Ingrese el numero en radianes para operar >>> ");
        float numero = scanner.nextFloat();

        public float factorial(int numero) {
            float resultadoFactorial = 1; // Inicializa el resultado en 1

            while (numero > 0) {
                resultadoFactorial *= numero; // Multiplica el resultado por el número actual
                numero--; // Decrementa el número
            }

            return resultadoFactorial; // Devuelve el resultado
        }

        switch (opcionOperacion){
            case 1:
                float resultado = ((numero)*(numero)*(numero)/numero);
                System.out.print("Sen("+numero+") = "+resultado);
                break;
            case 2:



        }

    }
}
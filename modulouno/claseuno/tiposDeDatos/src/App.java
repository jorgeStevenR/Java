import java.util.Scanner;

public class App {

    public static void main(String[] args){
        
        //entrada de datos por consola           // = operador de Asignacion 

        Scanner entrada = new Scanner(System.in);

        int edad;
        String nombre;
        float estatura;
        char letra;

        System.out.print("Digite la edad : ");
        edad = entrada.nextInt();
        System.out.print("Digite su nombre : ");
        nombre = entrada.nextLine();

        entrada.nextLine(); //Limpiar el buffer
        System.out.print("Digite la estatura : ");
        estatura = entrada.nextFloat();
        System.out.print("Digire una letra : ");
        letra = entrada.next().charAt(0);

        //imprimir datos por consola 
        System.out.print("La edad del estudiante es " + edad 
                        + "\nanios" + " el nombre del estudiante es " + nombre 
                        + "\nla estatura del estudiante es " + estatura 
                        + "\nla letra digitada es " + letra);
        

    }

}

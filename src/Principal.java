import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a nota: ");
        int notaUsuario = 0;
        Nota nota1 = null;
        
        try {
            notaUsuario = teclado.nextInt();
            nota1 = new Nota(notaUsuario);
        } catch (InputMismatchException e) {
            System.out.println("Digite apenas números");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        if(nota1 != null) {
            System.out.println(nota1.getNota());
        } else {
            System.out.println("A nota não possui valor válido");
        }

    }
}

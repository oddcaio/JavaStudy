package maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos numeros pares até 1.000.000
        int numeroPar = 0;
        do { 
            System.out.println(numeroPar);
            numeroPar += 2;
        } while (numeroPar <= 100); // Até 100 para não rodar um milhão

        // Forma de resolver do William
        System.out.println("Forma de resolver do William");
        for (int i = 0; i <= 100; i+=2){
            System.out.println(i);
        }
    }
    
}

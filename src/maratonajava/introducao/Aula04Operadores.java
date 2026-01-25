package maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 / numero02;
        System.out.println(resultado);

        // o resultado de operção entre dois valores inteiros o resultado sempre vai ser em numero inteiro.
        // ou seja, não apareceria "0,5" se dividisse "int 10 por int 20", precisa ser passado como double por cast ou declarando.
        
        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <=  >= ==  !=
        boolean isDezMaiorQue20 = 10>20;
        boolean isDezMenorQueVinte = 10<20;
        boolean isDezIgual20 = 10 == 20;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQue20? "+isDezMaiorQue20);
        System.out.println("isDezMenorQueVinte " +isDezMenorQueVinte);
        System.out.println("isDezIgual20 " +isDezIgual20);
        System.out.println("isDezDiferenteDez " +isDezDiferenteDez);

    }
}
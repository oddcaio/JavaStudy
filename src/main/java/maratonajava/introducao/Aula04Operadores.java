package maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 / numero02;
        System.out.println(resultado);

        // o resultado de operação entre dois valores inteiros o resultado sempre vai ser em numero inteiro.
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

        // && (AND) || (OR) !
        
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        
        System.out.println("isDentroDaLeiMaiorQueTrinta " +isDezDiferenteDez);
        System.out.println("isDentroDaLeiMenorQueTrinta " +isDezDiferenteDez);
        
        double valoresTotalContaCorrente = 200;
        double valoresTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valoresTotalContaCorrente > valorPlaystation || valoresTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " +isPlaystationCincoCompravel);

        // =, =+, -=, *=, /=, %=
        double bonus = 1800; //1800
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        //
        int contador = 8;
        contador+= 1; //contador = contador + 1
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(++contador2);
    }
}
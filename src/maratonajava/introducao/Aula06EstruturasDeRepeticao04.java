package maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condicao valorParcela >= 1000
    public static void main(String[] args) {

        // Minha resolução : ( ERRADA )
        int valorTotal = 40000;
        int valorParcela = 1300;
        int quantidadeParcelas = 0;
        int restoParcelas = 0;

        if (valorParcela >= 1000) {
            quantidadeParcelas = valorTotal / valorParcela;
            System.out.println("Quantas parcelas a pagar: " +quantidadeParcelas);
            restoParcelas = valorTotal % valorParcela;
            System.out.println("O que falta pagar: " +restoParcelas);
        }
         else {
            System.out.println("Parcela menor que 1000");
        }

        // Resolução do professor :
        double valorTotal2 = 30000;
        for (int parcela = 1; parcela <= valorTotal2; parcela++){
            double valorParcela2 = valorTotal2 / parcela;
            if (valorParcela2 < 1000) {
                break;
            }
                System.out.println("Parcela "+ parcela+ "R$ " +valorParcela2);
        }
    } 

}

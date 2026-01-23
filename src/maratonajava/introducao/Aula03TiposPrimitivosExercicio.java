package maratonajava.introducao;

/*Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
*/

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Douglas";
        int idade = 20;
        String endereco="Rua São Paulo";
        double salario = 99999.99;
        String dataRecebimentoSalario = "23/01/2026";
        String mensagem = "Eu " +nome+" Morando no endereço "+ endereco+" Confirmo que recebi o salário de "+salario +", na data " +dataRecebimentoSalario;
        System.out.println(mensagem);
    }
}

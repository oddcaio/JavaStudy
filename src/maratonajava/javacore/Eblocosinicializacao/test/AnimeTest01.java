    // 1. O package deve terminar em .test se o arquivo estiver na pasta test
package maratonajava.javacore.Eblocosinicializacao.test; 

// 2. Remova o "src." do import
import maratonajava.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        System.out.println("rodou");
    }
}
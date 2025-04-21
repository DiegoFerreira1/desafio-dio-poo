import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome da musica que deseja escutar: ");
        String musica = scan.nextLine();

        //Criação do objeto iphone
        Iphone iphone = new Iphone();

        System.out.println("----------------REPRODUTOR DE MUSICA----------------");
        iphone.selecionarMusica(musica);
        iphone.tocarMusica();
        iphone.pausarMusica();
        System.out.println("--------------------------------------------------");

        System.out.println("----------------APARELHO TELEFONICO----------------");
        System.out.println("Digite o numero para realizar a chamada: ");
        String numero = scan.nextLine();
        iphone.ligar(numero);
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println("--------------------------------------------------");

        System.out.println("----------------APARELHO TELEFONICO----------------");
        System.out.println("Informe a url para acessar no navegador: ");
        String url = scan.nextLine();
        iphone.exibirPagina(url);
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();




    }
}



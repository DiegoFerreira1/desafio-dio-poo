import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    //Construtores
    public Iphone(){

    }
    //Métodos do reprodutor musical----------------------------------------------------------------------------
    @Override
    public void tocarMusica() {
        System.out.println("Reproduzindo musica selecionada");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Aperte pause para pausar musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: \n" + musica);
    }


    //Métodos do aparelho telefonico----------------------------------------------------------------------------
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero: \n" + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Chamada encaminhada para o correio de voz.");
    }


    //Métodos do navegador de internet----------------------------------------------------------------------------
    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando página com url: \n" + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba no navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página no navegador");
    }
}

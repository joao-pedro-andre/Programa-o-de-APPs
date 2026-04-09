
class ReprodutorMusical {
    public void tocar() {
        System.out.println("Tocando musica...");
    }

    public void pausar() {
        System.out.println("Musica pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println(" Música selecionada: " + musica);
    }
}


class AparelhoTelefonico extends ReprodutorMusical {
    public void ligar(String numero) {
        System.out.println(" Ligando para " + numero + "...");
    }

    public void atender() {
        System.out.println(" Chamada atendida.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }
}


class NavegadorInternet extends AparelhoTelefonico {
    public void exibirPagina(String url) {
        System.out.println(" Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println(" Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println(" Página atualizada.");
    }
}


public class iPhone extends NavegadorInternet {
    private String modelo;
    private String SO;

    public iPhone(String modelo, String versaoSO) {
        this.modelo = modelo;
        this.SO = SO;
    }

    public static void main(String[] args) {
        iPhone meuIphone = new iPhone("iPhone 2007", "iOS 1.0");

        System.out.println("--- iPhone JP ---");
        
      
        meuIphone.selecionarMusica("Mulher de fases");
        meuIphone.tocar();

        
        meuIphone.ligar("551199999999");

       
        meuIphone.exibirPagina("google.com");
    }
}

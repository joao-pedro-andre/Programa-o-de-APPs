public class Main {
    public static void main(String[] args) {

        VeloControl meuCarro = new VeloControl("Ferrari", 180);

        System.out.println("--- Iniciando o Teste: " + meuCarro.getMarca() + " ---");


        meuCarro.acelerar(50);
        System.out.println("Acelerando +50: " + meuCarro.getVelo_atual() + " km/h");


        System.out.println("\nTentando ultrapassar o limite (acelerando +200)...");
        meuCarro.acelerar(200);
        System.out.println("Velocidade Atual (deve ser 180): " + meuCarro.getVelo_atual() + " km/h");


        meuCarro.frear(80);
        System.out.println("\nFreando -80: " + meuCarro.getVelo_atual() + " km/h");


        System.out.println("\nTentando frear 150 km/h (maior que os 100 km/h atuais)...");
        meuCarro.frear(150);
        System.out.println("Velocidade após tentativa de freio brusco: " + meuCarro.getVelo_atual() + " km/h");


        System.out.println("\n--- Status Final ---");
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Velocidade Máxima permitida: " + meuCarro.getVelo_atual() + " km/h");
    }
}

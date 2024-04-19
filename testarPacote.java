public class testarPacote {
    public static void main(String[] args) {
        Pacote pacoteSimples = new PacoteSimples(5.0);
        Pacote pacoteExpresso = new PacoteExpresso(13.0);

        System.out.println("Valor para Pacote Simples: R$" + pacoteSimples.calcularCustoEnvio());
        System.out.println("Valor para Pacote Expresso: R$" + pacoteExpresso.calcularCustoEnvio());
    }
}

public class PacoteSimples extends Pacote{
    public PacoteSimples(double peso){
        super(peso);
    }
    public double calcularCustoEnvio() {
        return peso * 0.3;
    }
}

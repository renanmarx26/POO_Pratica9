public class PacoteExpresso extends Pacote{
    public PacoteExpresso(double peso){
        super(peso);
    }
    public double calcularCustoEnvio(){
        return peso * 1.5;
    }
}

public class Computador extends Produto{
    String modelo;

    public Computador(String modelo, double unicoProduto){
        super(unicoProduto);
        this.modelo = modelo;
    }
    public double calcularPrecoTotal(int quantidade){
        if(quantidade >= 8){
            return super.calcularPrecoTotal(quantidade) * 10.0;
        }
        return super.calcularPrecoTotal(quantidade);
    }
}

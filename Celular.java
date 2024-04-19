public class Celular extends Produto{
    String modelo;
  
    public Celular(String modelo, double unicoProduto){
        super(unicoProduto);
        this.modelo = modelo;
    }
    public double calcularPrecoTotal(int quantidade){
        if (quantidade >=10){
            return super.calcularPrecoTotal(quantidade) * 0.6;
        }
        return super.calcularPrecoTotal(quantidade);
    }
}

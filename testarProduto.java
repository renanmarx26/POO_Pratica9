public class testarProduto {
    public static void main(String [] args){
        Computador computador = new Computador("Dell", 3000.0);
        Celular celular = new Celular("Samsung", 2100.0);

        System.out.println("Valor para 1 computador: R$" + computador.calcularPrecoTotal());
        System.out.println("Valor para 5 computadores: R$" + computador.calcularPrecoTotal(5));
        System.out.println("Valor para 1 celular: R$" + celular.calcularPrecoTotal());
        System.out.println("Valor para 7 celulares: R$" + celular.calcularPrecoTotal(7));
    }
}

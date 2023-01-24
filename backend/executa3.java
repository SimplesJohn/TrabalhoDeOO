public class executa3 {
    public static void main(String[] args){
        Pedido p = new Pedido();


        System.out.println(p.calcularValorTotal());
        System.out.println(p.calcularImposto());
        System.out.println(p.calcularValorLiquido());
    }
}

public class executa3 {
    public static void main(String[] args){
        Pedido p = new Pedido();
        Pagamento pg = new Pagamento();


        System.out.println(p.calcularValorTotal());
        System.out.println(p.calcularImposto());
        System.out.println(p.calcularValorLiquido());
        System.out.println(pg.calcularPagamento());

    }
}

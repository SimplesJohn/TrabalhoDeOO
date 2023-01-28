import java.util.Scanner;

public class executa {
    public static void main(String[] args) {
    	
        /*pessoaFisica p1 = new pessoaFisica(
            "QL 31, conj 9",
            "Samambaia", 
            "72345-19", 
            "casa 1", 
            "54676754643", 
            "Arhur do Val", 
            "M"
        );

        pessoaJuridica j1 = new pessoaJuridica(
            "sgsgsg",
            "ggfgs", 
            "afggsg", 
            "1", 
            "36363", 
            "sksjfk", 
            "46747"
        );

        System.out.println(p1.toString());
        System.out.println(j1.toString());
    	
    	Item item1 = new Item(5, 4.38);
    	
    	System.out.printf("Temos %d quantidades de um item, com cada um custando R$ %.2f", item1.getQuantidade(), item1.getValor());
    	
    	System.out.println(p1.getCidade());*/
    	Scanner input = new Scanner(System.in);
    	
    	Item i1 = new Item(5, 6.80f);
    	Insumo insu1 = new Insumo("Armazem 2", "Local seco e arejado", 500);
    	///////////////
    	
    	System.out.printf("Tenho %d itens que custam R$ %.2f cada.\n\n", Item.getQuantidade(), Item.getValor());
    	//Teste dos métodos addInsumo() e rmvInsumo() da classe Insumo usando valores de quantidade da classe Item
    	/*System.out.print("Adicionando algum valor: ");
    	int n = input.nextInt();
    	insu1.addInsumo(n);
    	System.out.println("Depois do acrescimo, a qtde total de itens é: " + Item.getQuantidade());
    	
    	System.out.println();
    	System.out.print("Removendo algum valor: ");
    	n = input.nextInt();
    	insu1.rmvInsumo(n);
    	System.out.println("Depois do decrescimo, a qtde total de itens é: " + Item.getQuantidade());*/
    	
    	//Instanciando um produto

    	input.close();
    }
}

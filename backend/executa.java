import java.util.Date;

public class executa {
    public static void main(String[] args) {
        Date data = new Date();
        Cliente[] cliente = new Cliente[4];
        Pedido pedido = new Pedido(2, data, data, 22.4f, 443, 343);

        cliente[0] = new Cliente(
            "qr 232 conj 39 casa 24i",
            "Taguatinga", 
            "259095", 
            "32",
            pedido
        );

        cliente[1] = new Cliente(
            "qs 909 conj 214 casa 395",
            "Samambaia", 
            "49839", 
            "695",
            pedido
        );

        cliente[2] = new Cliente(
            "qn Abc conj 65 casa jk9",
            "Sao paulo", 
            "3406034", 
            "11",
            pedido
        );

        cliente[3] = new Cliente(
            "dkj 59 conj 9484 casa 5mki",
            "Porto Alegre", 
            "549348", 
            "23",
            pedido
        );

        pessoaFisica pFisica = new pessoaFisica(
            "qr 594 conjunto 245 casa 355",
            "Samambaia sul", 
            "72365-708", 
            "255", 
            "035.533.353-76", 
            "Jonh Doe", 
            "Masculino",
            pedido
        );

        pessoaJuridica pJuridica = new pessoaJuridica(
            "qs 343 conjunto B lote 968",
            "Taguatinga", 
            "45736-458", 
            "12", 
            "363635", 
            "50509", 
            "Fulano Beltrano",
            pedido
        );

        Pagamento pagamento = new Pagamento();

        // pedido.calcularValorTotal();


        // System.out.println(
        //     pFisica.getNome() + 
        //     "\nPortador do cpf: " + pFisica.getCpf() +
        //     "\nsexo: " + pFisica.getSexo() +
        //     "\nresidente em: " + pFisica.getCidade() +
        //     "\nno endereço: " + pFisica.getEndereco() +
        //     "\ncom complemento: " + pFisica.getComplemento() +
        //     "\nem que o cep é: " + pFisica.getCep() + 
        //     "\nEste cliente realizou o pedido de: "

        // );

        System.out.println(cliente[0].detalhes());
        System.out.println(pedido);

    }
}

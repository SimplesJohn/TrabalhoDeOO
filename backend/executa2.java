import java.util.Date;
public class executa2 {
    public static void main(String[] args){
        Date data = new Date(); 
        
        Pedido p = new Pedido( 
            0, 
            data,
            data, 
            3, 
            0, 
            0
        );

        System.out.println(p.toString());
    }

}

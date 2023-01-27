public class Imposto {
    public float calcularFaixas(){
        String produto = "comida";
        float faixa = 0;

        if(produto == "comida" || produto == "Comida") {
            faixa = 0.12f;
        };
        if(produto == "bebida" || produto == "Bebida") {
            faixa = 0.15f;
        };
        if(produto == "cafe" || produto == "Cafe") {
            faixa = 0.18f;
        };

        return faixa;
    }
}

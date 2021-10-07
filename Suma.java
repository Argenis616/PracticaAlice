

public class Suma{
    public static void main (String[] args){
        //Resolucion del problema de respiracion de litros por dia
        float centimetrosAlitros, centimetrosCubicos, respiracionesXmin, vecesXhora, vecesXdia,litrosXdia;
        centimetrosCubicos = 660;
        respiracionesXmin = 20;
        vecesXhora = 60 * respiracionesXmin; // variable que representa respiraciones por dia
        vecesXdia = 24 * vecesXhora;
        centimetrosAlitros = centimetrosCubicos/1000;
        litrosXdia = centimetrosAlitros * vecesXdia;

        System.out.println(litrosXdia);
        //Falta implementacion

        
    }
}
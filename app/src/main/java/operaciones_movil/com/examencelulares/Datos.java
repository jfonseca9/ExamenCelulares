package operaciones_movil.com.examencelulares;

import java.util.ArrayList;


public class Datos {
    private static ArrayList<Celulares> celular = new ArrayList<>();
    public static void guardar(Celulares c){
        celular.add(c);
    }
    public static ArrayList<Celulares> obtener(){
        return celular;
    }
}


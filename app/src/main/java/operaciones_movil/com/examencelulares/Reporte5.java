package operaciones_movil.com.examencelulares;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

public class Reporte5 extends AppCompatActivity {
    private TextView tv;
    private ArrayList<Celulares> celular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityreporte5);
        tv = (TextView) findViewById(R.id.txtPromedio);
        int suma=0, cont=0, promedio=0;
        celular = Datos.obtener();

        for (int i = 0; i <celular.size(); i++){
            if(celular.get(i).getMarca().equalsIgnoreCase("Samsung")){
                suma=suma+ Integer.parseInt(celular.get(i).getPrecio());
                cont=cont+1;
            }
        }
        promedio=suma/cont;
        String result= String.valueOf(promedio);
        tv.setText("$"+result);
    }
}

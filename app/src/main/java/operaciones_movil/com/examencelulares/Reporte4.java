package operaciones_movil.com.examencelulares;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

public class Reporte4 extends AppCompatActivity {
    private TextView tv;
    private ArrayList<Celulares> celular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityreporte4);
        tv = (TextView) findViewById(R.id.txtCantidad);
        int cont=0;
        celular = Datos.obtener();

        for (int i = 0; i <celular.size(); i++){
            if(celular.get(i).getMarca().equalsIgnoreCase("Apple")&&(celular.get(i).getColor().equalsIgnoreCase("negro")||celular.get(i).getColor().equalsIgnoreCase("black"))){
                cont=cont+1;
            }
        }
        String result= String.valueOf(cont);
        tv.setText(result);
    }
}


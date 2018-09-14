package operaciones_movil.com.examencelulares;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Reporte2 extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Celulares> celular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityreporte2);
        tabla = (TableLayout)findViewById(R.id.tabla);
        celular = Datos.obtener();

        for (int i = 0; i <celular.size(); i++){
            if(celular.get(i).getMarca().equalsIgnoreCase("Huawei")&&
                    (Integer.parseInt(celular.get(i).getCapacidad())>=2&& Integer.parseInt(celular.get(i).getCapacidad())<=4)) {
                TableRow fila = new TableRow(this);
                TextView c1 = new TextView(this);
                TextView c2 = new TextView(this);
                TextView c3 = new TextView(this);
                TextView c4 = new TextView(this);
                TextView c5 = new TextView(this);
                TextView c6 = new TextView(this);

                c1.setText("" + (i + 1));
                c2.setText(celular.get(i).getMarca());
                c3.setText(celular.get(i).getCapacidad());
                c4.setText(celular.get(i).getColor());
                c5.setText(celular.get(i).getSo());
                c6.setText(celular.get(i).getPrecio());
                fila.addView(c1);
                fila.addView(c2);
                fila.addView(c3);
                fila.addView(c4);
                fila.addView(c5);
                fila.addView(c6);
                tabla.addView(fila);
            }
        }
    }
}

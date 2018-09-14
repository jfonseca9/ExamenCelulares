package operaciones_movil.com.examencelulares;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Reportes extends AppCompatActivity {
    private ListView lv;
    private Resources resources;
    private String opc[];
    private Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);
        lv = (ListView)findViewById(R.id.lvReportes);
        resources = this.getResources();
        opc = resources.getStringArray(R.array.Reportes);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opc);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        in = new Intent(Reportes.this,ListarCel.class);
                        startActivity(in);
                        break;
                    case 1:
                        in = new Intent(Reportes.this,Reporte2.class);
                        startActivity(in);
                        break;
                    case 2:
                        in = new Intent(Reportes.this,Reporte4.class);
                        startActivity(in);
                        break;
                    case 3:
                        in = new Intent(Reportes.this, Reporte5.class);
                        startActivity(in);
                        break;
                }
            }
        });
    }
}

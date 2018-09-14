package operaciones_movil.com.examencelulares;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CrearCel extends AppCompatActivity {
    private EditText precio, marca, color, capacidad, so;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear);
        precio = (EditText) findViewById(R.id.txtPrecio);
        marca = (EditText) findViewById(R.id.txtMarca);
        color = (EditText) findViewById(R.id.txtColor);
        so = (EditText) findViewById(R.id.txtSo);
        capacidad = (EditText) findViewById(R.id.txtCapacidad);
        resources = this.getResources();
    }

    public boolean validar(){
        if(marca.getText().toString().isEmpty()) {
            marca.setError("Debe Introducir la Marca");
            return false;
        }
        if(capacidad.getText().toString().isEmpty()) {
            capacidad.setError("Debe introducir la capacidad");
            return false;
        }
        if(color.getText().toString().isEmpty()) {
            color.setError("Debe introducir el color");
            return false;
        }
        if(so.getText().toString().isEmpty()) {
            so.setError("Debe introducir el Sistema Operativo");
            return false;
        }
        if(precio.getText().toString().isEmpty()) {
            precio.setError("Debe Introducir Precio");
            return false;
        }
        return true;
    }

    public void Crear (View view) {
        String mar, col, cap, prec, sop;
        mar = marca.getText().toString();
        col = color.getText().toString();
        cap = capacidad.getText().toString();
        prec = precio.getText().toString();
        sop = so.getText().toString();
        if(validar()) {
            Celulares c = new Celulares(mar, cap, col, sop, prec);
            c.guardar();
            Toast.makeText(this, "Celular registrado de manera correcta", Toast.LENGTH_SHORT).show();
        }
    }

    public void borrar (View v){
        marca.setText("");
        color.setText("");
        capacidad.setText("");
        so.setText("");
        precio.setText("");

    }
}

package com.example.empresaxyz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner combo_manillas;
    private String[] opcionesmanillas;
    private ArrayAdapter<String> Adapter;
    private TextView Material;
    private TextView Dije;
    private TextView Tipo;
    private Spinner combo_tipomoneda;
    private String[] opcionmonedas;
    private EditText cantidades;
    private TextView resultado;
    private Double costo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Material = findViewById(R.id.lblMaterial);
        Dije = findViewById(R.id.lblDije);
        Tipo = findViewById(R.id.lblTipo);
        combo_manillas = findViewById(R.id.cmbManillas);
        opcionesmanillas = getResources().getStringArray(R.array.opcionesmanillas);
        Adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opcionesmanillas);
        combo_manillas.setAdapter(Adapter);
        combo_manillas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                manillas();
            }

            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });

        combo_tipomoneda = findViewById(R.id.cmbTipoMoneda);
        opcionmonedas = getResources().getStringArray(R.array.opcionmonedas);
        Adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opcionmonedas);
        combo_tipomoneda.setAdapter(Adapter);
        cantidades = findViewById(R.id.txtCantidad);
        resultado = findViewById(R.id.lblValor);
    }

    public void manillas() {
        int op;

        op = combo_manillas.getSelectedItemPosition();
        if (op == 0) {
            Material.setText(R.string.cuero);
            Dije.setText(R.string.martillo);
            Tipo.setText(R.string.oro);
            costo = 100.0;
        } else if (op == 1) {
            Material.setText(R.string.cuero);
            Dije.setText(R.string.martillo);
            Tipo.setText(R.string.plata);
            costo = 80.0;
        } else if (op == 2) {
            Material.setText(R.string.cuero);
            Dije.setText(R.string.martillo);
            Tipo.setText(R.string.niquel);
            costo = 70.0;
        } else if (op == 3) {
            Material.setText(R.string.cuero);
            Dije.setText(R.string.ancla);
            Tipo.setText(R.string.oro);
            costo = 120.0;
        } else if (op == 4) {
            Material.setText(R.string.cuero);
            Dije.setText(R.string.ancla);
            Tipo.setText(R.string.plata);
            costo = 100.0;
        } else if (op == 5) {
            Material.setText(R.string.cuero);
            Dije.setText(R.string.ancla);
            Tipo.setText(R.string.niquel);
            costo = 90.0;
        } else if (op == 6) {
            Material.setText(R.string.cuerda);
            Dije.setText(R.string.martillo);
            Tipo.setText(R.string.oro);
            costo = 90.0;
        } else if (op == 7) {
            Material.setText(R.string.cuerda);
            Dije.setText(R.string.martillo);
            Tipo.setText(R.string.plata);
            costo = 70.0;
        } else if (op == 8) {
            Material.setText(R.string.cuerda);
            Dije.setText(R.string.martillo);
            Tipo.setText(R.string.niquel);
            costo = 50.0;
        } else if (op == 9) {
            Material.setText(R.string.cuerda);
            Dije.setText(R.string.ancla);
            Tipo.setText(R.string.oro);
            costo = 110.0;
        } else if (op == 10) {
            Material.setText(R.string.cuerda);
            Dije.setText(R.string.ancla);
            Tipo.setText(R.string.plata);
            costo = 90.0;
        } else if (op == 11) {
            Material.setText(R.string.cuerda);
            Dije.setText(R.string.ancla);
            Tipo.setText(R.string.niquel);
            costo = 80.0;
        }

    }

    public void calcular(View v) {
        int opm;
        double cant, res = 0;
        if (Validar()){
            cant = Double.parseDouble(cantidades.getText().toString());
            opm = combo_tipomoneda.getSelectedItemPosition();
            if (opm == 0) {
                res = ((cant * costo) / 3200);

            } else if (opm == 1) {
                res = (cant * costo);
            }
            resultado.setText("" + res);
        }

    }

    public void limpiar(View v) {
        Material.setText("");
        Dije.setText("");
        Tipo.setText("");
        cantidades.setText("");
        resultado.setText("");
        combo_manillas.setSelection(0);
        combo_tipomoneda.setSelection(0);
    }

    public boolean Validar() {
        String error_cantidad;
        error_cantidad = getResources().getString(R.string.error_cantidad);
        if (cantidades.getText().toString().isEmpty()) {
            cantidades.setError(error_cantidad);
            return false;
        }
        return true;
    }
}

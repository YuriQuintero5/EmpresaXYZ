package com.example.empresaxyz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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
            }public void onNothingSelected(AdapterView<?> parentView) {}
        });
    }

    public void manillas(){
        String  Mat, Dij,Tip;
        int op;
        op = combo_manillas.getSelectedItemPosition();
        if ( op == 0){
            Material.setText(R.string.cuero);
            Dije.setText(R.string.martillo);
            Tipo.setText(R.string.oro);
        }else if (op == 1){
            Material.setText(R.string.cuero);
            Dije.setText(R.string.martillo);
            Tipo.setText(R.string.plata);
        }else if (op == 2){
            Material.setText(R.string.cuero);
            Dije.setText(R.string.martillo);
            Tipo.setText(R.string.niquel);
        }else if (op == 3){
            Material.setText(R.string.cuero);
            Dije.setText(R.string.ancla);
            Tipo.setText(R.string.oro);
        }else if (op == 4){
            Material.setText(R.string.cuero);
            Dije.setText(R.string.ancla);
            Tipo.setText(R.string.plata);
        }else if (op == 5){
            Material.setText(R.string.cuero);
            Dije.setText(R.string.ancla);
            Tipo.setText(R.string.niquel);
        }else if (op == 6){
            Material.setText(R.string.cuerda);
            Dije.setText(R.string.martillo);
            Tipo.setText(R.string.oro);
        }else if (op == 7){
            Material.setText(R.string.cuerda);
            Dije.setText(R.string.martillo);
            Tipo.setText(R.string.plata);
        }else if (op == 8){
            Material.setText(R.string.cuerda);
            Dije.setText(R.string.martillo);
            Tipo.setText(R.string.niquel);
        }else if (op == 9){
            Material.setText(R.string.cuerda);
            Dije.setText(R.string.ancla);
            Tipo.setText(R.string.oro);
        }else if (op == 10){
            Material.setText(R.string.cuerda);
            Dije.setText(R.string.ancla);
            Tipo.setText(R.string.plata);
        }else if (op == 11){
            Material.setText(R.string.cuerda);
            Dije.setText(R.string.ancla);
            Tipo.setText(R.string.niquel);
        }

    }



    
}

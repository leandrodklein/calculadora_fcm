package br.ldkstudiosart.freqmax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText txtNome;
    EditText txtIdade;
    Button btnAdicionarCalcular;
    ListView listAtletas;
    List<Atleta> atletas = new ArrayList<>();
    AtletaAdapter adapter;

    //EditText result;

    View.OnClickListener btClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d("EVT", "EVT Clique no botao!");
            processarCliqueAdicionarCalcular(v);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNome = findViewById(R.id.txtNome);
        txtIdade = findViewById(R.id.txtIdade);
        btnAdicionarCalcular = findViewById(R.id.btnAdicionarCalcular);
        btnAdicionarCalcular.setOnClickListener(btClickListener);
        listAtletas = findViewById(R.id.listAtletas);
        adapter = new AtletaAdapter(atletas, getBaseContext());
        listAtletas.setAdapter(adapter);
    }

    public void processarCliqueAdicionarCalcular(View v) {
        Atleta a = new Atleta();
        a.setNome(txtNome.getText().toString());
        //a.setIdade(txtIdade.getText().toString());

        int soma = Integer.valueOf(txtIdade.getText().toString());
        int total = 220 - soma;
        a.setIdade(String.valueOf("FCM: " + total));

        atletas.add(a);
        adapter.notifyDataSetChanged();
        Toast.makeText(getBaseContext(), a.toString(), Toast.LENGTH_LONG).show();
    }


}
package santana.olmo.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        //pegando a "inteção" que foi utilizada para abrir essa tela
        Intent intent = getIntent();
        //pegando a variavel que corresponde a 'texto' que foi trasmitida na "intencao"
        String texto = intent.getStringExtra("texto");
        //pegando uma area de texto(diferente de campo de texto) da tela atraves do ID dela
        TextView tvExibir = findViewById(R.id.tvExibir);
        //modificando o texto que esta dentro da area de texto
        tvExibir.setText(texto);
    }
}
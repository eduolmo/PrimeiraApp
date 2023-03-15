package santana.olmo.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //pegando o botao na tela atraves do ID dele
        Button btnEnviar = findViewById(R.id.btnEnviar);
        //adicionando evento de click ao botao
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            //criando o metodo que vai ser executado quando o botao for clicado
            public void onClick(View view) {
                //pegando o campo de texto atraves do ID dele
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);
                //pegando o texto dentro do campo de texto
                String texto = etDigiteAqui.getText().toString();
                //criando uma "intencao" de navegar para uma outra tela
                Intent intent = new Intent(MainActivity.this,NextActivity.class);
                //inserindo na "intencao" uma informacao que deve ser trasmitida para a proxima tela
                intent.putExtra("texto",texto);
                //abrindo uma nova tela a partir da "intecao"
                startActivity(intent);
            }
        });
    }
}
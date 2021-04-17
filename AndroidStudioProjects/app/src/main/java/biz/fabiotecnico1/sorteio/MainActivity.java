package biz.fabiotecnico1.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarBotao (View v){
        TextView texto = findViewById(R.id.textoResultado);
        texto.setText("TEXTO ALTERADO COM SUCESSO");
    }
}
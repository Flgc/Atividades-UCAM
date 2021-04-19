package biz.fabiotecnico1.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editPrecoAlcool;
    private EditText editPrecoGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool = findViewById(R.id.editAlcool);
        editPrecoGasolina = findViewById(R.id.editGasolina);
        textResultado = findViewById(R.id.textResultado);
    }

    public void calcularPreco(View view){

        if (editPrecoAlcool.getText().toString().trim().equals("") ||
                editPrecoGasolina.getText().toString().trim().equals("")){

            Toast.makeText(this, "Valores incorretos",Toast.LENGTH_LONG).show();

        }else{
            //Convertendo o valor de string para double
            Double precoAlcool = Double.parseDouble(editPrecoAlcool.getText().toString());
            Double precoGasolina = Double.parseDouble(editPrecoGasolina.getText().toString());

            /* Calcula (Preco Alcool / Preco Gasolina)
               Se resultado for >= 0,7 melhor utilizar gasolina senão melhor utilizar alcool
            */

            Double resultado = precoAlcool/precoGasolina;

            if(resultado >= 0.7){
                textResultado.setText("Melhor abastecer com gasolina.");
            } else {
                textResultado.setText("Melhor abastecer com alcool.");
            }
        }
    }
}
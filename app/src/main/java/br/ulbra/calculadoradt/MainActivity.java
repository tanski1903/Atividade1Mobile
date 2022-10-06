package br.ulbra.calculadoradt;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edValor1, edValor2;
    Button btSoma, btSubtracao, btMultiplicacao, btDivisao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edValor1 = (EditText) findViewById(R.id.ed1);
        edValor2 = (EditText) findViewById(R.id.ed2);
        btSoma = (Button) findViewById(R.id.btSoma);
        btSubtracao = (Button) findViewById(R.id.btSubtracao);
        btMultiplicacao = (Button) findViewById(R.id.btMultiplicacao);
        btDivisao = (Button) findViewById(R.id.btDivisao);
        btSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double valor1 = Double.parseDouble(edValor1.getText().toString());
                Double valor2 = Double.parseDouble(edValor2.getText().toString());
                Double soma = valor1 + valor2;
                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(MainActivity.this);
                        dialogo.setTitle("Resultado Soma");
                        dialogo.setMessage("A soma é: " + soma);
                        dialogo.setNeutralButton("Ok",null);
                        dialogo.show();
            }
        });
        btSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double valor1 = Double.parseDouble(edValor1.getText().toString());
                Double valor2 = Double.parseDouble(edValor2.getText().toString());
                Double subtracao = valor1 - valor2;
                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado Subtração");
                dialogo.setMessage("A soma é: " + subtracao);
                dialogo.setNeutralButton("Ok",null);
                dialogo.show();
            }
        });
        btMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double valor1 = Double.parseDouble(edValor1.getText().toString());
                Double valor2 = Double.parseDouble(edValor2.getText().toString());
                Double multiplicacao = valor1 * valor2;
                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado Soma");
                dialogo.setMessage("A soma é: " + multiplicacao);
                dialogo.setNeutralButton("Ok",null);
                dialogo.show();
            }
        });
        btDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double valor1 = Double.parseDouble(edValor1.getText().toString());
                Double valor2 = Double.parseDouble(edValor2.getText().toString());
                Double divisao = valor1 / valor2;
                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado Soma");
                dialogo.setMessage("A soma é: " + divisao);
                dialogo.setNeutralButton("Ok",null);
                dialogo.show();
            }
        });
    }
}
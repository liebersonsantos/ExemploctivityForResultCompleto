package com.example.lieberson.exemploctivityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int CONSTANTE_TELA_1 = 1;
    public static final int CONSTANTE_TELA_2 = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviarDadosTela1(View view) {
        EditText nomeTelaPrincipal = findViewById(R.id.nomeTelaPrincipal);
        EditText emailTelaPrincipal = findViewById(R.id.emailTelaPrincipal);

        Bundle params = new Bundle();
        params.putString("nomeTelaPrincipal", nomeTelaPrincipal.getText().toString());
        params.putString("emailTelaPrincipal", emailTelaPrincipal.getText().toString());

        Intent intent = new Intent(this, Tela1.class);
        intent.putExtras(params);

        startActivityForResult(intent, CONSTANTE_TELA_1);
    }

    public void enviarDadosTela2(View view) {
        EditText nomeTelaPrincipal = findViewById(R.id.nomeTelaPrincipal);
        EditText emailTelaPrincipal = findViewById(R.id.emailTelaPrincipal);

        Bundle params = new Bundle();
        params.putString("nomeTelaPrincipal", nomeTelaPrincipal.getText().toString());
        params.putString("emailTelaPrincipal", emailTelaPrincipal.getText().toString());

        Intent intent = new Intent(this, Tela2.class);
        intent.putExtras(params);

        startActivityForResult(intent, CONSTANTE_TELA_2);
    }

    protected void onActivityResult(int codigoTela, int resultado, Intent intent) {

        if (codigoTela == CONSTANTE_TELA_1) {
            Bundle params = intent.getExtras();
            if (params != null) {
                String msg = params.getString("mensagem");
                Toast.makeText(this, "Tela 1 -> Resultado: " + resultado + " | Msg: " + msg, Toast.LENGTH_LONG).show();
            }
        } else if (codigoTela == CONSTANTE_TELA_2) {
            Bundle params = intent.getExtras();
            if (params != null) {
                String msg = params.getString("mensagem");
                Toast.makeText(this, "Tela 2 -> Resultado: " + resultado + " | Msg: " + msg, Toast.LENGTH_LONG).show();
            }
        }
    }
}



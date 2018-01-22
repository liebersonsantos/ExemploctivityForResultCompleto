package com.example.lieberson.exemploctivityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        Intent intent = getIntent();
        if (intent != null){
            Bundle params = intent.getExtras();
            if (params != null){
                String nome = params.getString("nomeTelaPrincipal");
                String email = params.getString("emailTelaPrincipal");

                TextView nomeTela2 = findViewById(R.id.nomeTela2);
                TextView emailTela2 = findViewById(R.id.emailTela2);

                nomeTela2.setText("Nome: "+nome);
                emailTela2.setText("Email: "+email);
            }
        }
    }
    public void aceitaDadosTela2(View view){
        Intent intent = new Intent();
        intent.putExtra("mensagem", "Aceitou");

        setResult(1, intent);
        finish();
    }
    public void rejeitaDadosTela2(View view){
        Intent intent = new Intent();
        intent.putExtra("mensagem", "Rejeitou");

        setResult(2, intent);
        finish();
    }
}

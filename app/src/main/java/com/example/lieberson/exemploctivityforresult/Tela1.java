package com.example.lieberson.exemploctivityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Tela1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        Intent intent = getIntent();
        if (intent != null){
            Bundle params = intent.getExtras();
            if (params != null){
                String nome = params.getString("nomeTelaPrincipal");
                String email = params.getString("emailTelaPrincipal");

                TextView nomeTela1 = findViewById(R.id.nomeTela1);
                TextView emailTela1 = findViewById(R.id.emailTela1);

                nomeTela1.setText("Nome: "+nome);
                emailTela1.setText("Email: "+email);
            }
        }
    }
    public void aceitaDados(View view){
        Intent intent = new Intent();
        intent.putExtra("mensagem", "Aceitou");

        setResult(1, intent);
        finish();
    }
    public void rejeitaDados(View view){
        Intent intent = new Intent();
        intent.putExtra("mensagem", "Rejeitou");

        setResult(2, intent);
        finish();
    }
}

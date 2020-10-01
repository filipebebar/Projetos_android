package com.cursoandroid.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){
        this.opcaoSelecionada("pedra");
    }

    public void selecionadoPapel(View view){
        this.opcaoSelecionada("pedra");
    }

    public void selecionadoTesoura(View view){
        this.opcaoSelecionada("pedra");
    }

    public void opcaoSelecionada(String opcapSelecionada){

        ImageView imageResultado = findViewById(R.id.imageResultado);

        int numeroAleatorio = new Random().nextInt(3);
        String[] opcoes = { "pedra", "papel","tesoura"};
        String opcaoApp = opcoes[numeroAleatorio];

        switch (opcaoApp){
            case "pedra":
                imageResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imageResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imageResultado.setImageResource(R.drawable.tesoura);
                break;






        }

    }
}
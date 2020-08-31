package com.cursoandroid.classesemetodosnapratica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // int numero = 10;
        /*Casa minhaCasa = new Casa();
        minhaCasa.cor = "Cor";
        System.out.println();


        Casa minhaCasa2 = new Casa();
        minhaCasa2.cor = "Branca";*/

       /* Funcionario funcionario = new Funcionario();
        funcionario.nome = "Filipe";
        funcionario.salario = 920;

        double salarioRecuperado = funcionario.recuperarSalario();
        System.out.println("O salario é: " + (salarioRecuperado + 100));*/

       Animal animal = new Animal();
       animal.correr();



    }
}

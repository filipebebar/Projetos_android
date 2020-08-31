package com.cursoandroid.classesemetodosnapratica;

public class Funcionario {
    //ropriedades
    String nome;
    double salario;

    //metpdps
    double recuperarSalario() {
        this.salario = this.salario - (this.salario * 0.1);
        return this.salario;
        //System.out.println(this.salario);
    }
}

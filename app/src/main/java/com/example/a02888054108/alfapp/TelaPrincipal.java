package com.example.a02888054108.alfapp;

import android.os.Bundle;
import com.example.a02888054108.alfapp.AndGraph.AGActivityGame;
import com.example.a02888054108.alfapp.AndGraph.AGGameManager;

public class TelaPrincipal extends AGActivityGame {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //INSTANCIA O OBJETO RESPONSAVEL PELO GERENCIAMENTO DE CENAS
        //PARAMETRO BOOLEANO SERVE APENAS PARA PROJETOS QUE USAM
        //ACELEROMETRO E SERAO TESTADO EM APARELHO FISICO
        this.vrManager = new AGGameManager(this, false);

        //INSTANCIA OS OBJETOS DE CENA PASSANDO O GERENTE
        // DE CENAS COMO PARAMETRO
        TelaMenu menu = new TelaMenu(vrManager);
        TelaAnimacao animacao = new TelaAnimacao(vrManager);
        TelaSobre sobre = new TelaSobre(vrManager);
        TelaNumeros numeros = new TelaNumeros(vrManager);

        //REGISTRA AS CENAS NO GERENTE DE CENAS
        vrManager.addScene(menu); //RESPONDE PELO INDICE 0
        vrManager.addScene(animacao); //RESPONDE PELO INDICE 1
        vrManager.addScene(sobre); //RESPONDE PELO INDICE 2
        vrManager.addScene(numeros); //RESPONDE PELO INDICE 3
    }
}

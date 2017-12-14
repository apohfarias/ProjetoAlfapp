package com.example.a02888054108.alfapp;

import com.example.a02888054108.alfapp.AndGraph.AGGameManager;
import com.example.a02888054108.alfapp.AndGraph.AGInputManager;
import com.example.a02888054108.alfapp.AndGraph.AGScene;
import com.example.a02888054108.alfapp.AndGraph.AGScreenManager;
import com.example.a02888054108.alfapp.AndGraph.AGSprite;


public class TelaSobre extends AGScene {
    //ATRIBUTOS DA CLASSE
    AGSprite vrFundoTela = null;

    //CONSTRUTOR DA CLASSE (RECEBE O GERENCIADOR)
    TelaSobre(AGGameManager gerenciador){
        super(gerenciador);
    }

    @Override
    //CHAMADO SEMPRE QUE A CENA FOR CHAMADA
    public void init() {

        //COLOCAR O QUE SERA NECESSARIO PARA A CENA
        //CONFIGURA FUNDO DE IMAGEM
        vrFundoTela = this.createSprite(R.drawable.telasobre, 100,100);
        vrFundoTela.setScreenPercent(100,100);
        vrFundoTela.vrPosition.setXY(AGScreenManager.iScreenWidth/2,AGScreenManager.iScreenHeight/2);

    }

    @Override
    //CHAMADO QUANDO A APLICAÇÃO VOLTA DA INTERRUPÇÃO
    public void restart() {

        //FAZER O QUE FOR NECESSÁRIO PARA CONTINUAR A EXECUÇÃO
    }

    @Override
    //CHAMADO QUANDO A APLICAÇÃO SOFRE INTERRUPÇÃO
    public void stop() {

        //FAZER O QUE FOR NECESSÁRIO PARA INTERROMPER A APLICAÇÃO
    }

    @Override
    //CHAMADO X VEZES POR SEGUNDO
    public void loop() {//UTILIZADO PARA IMPLEMENTAR A LÓGICA DA CENA

        voltarTela();

    }

    public void voltarTela(){

        // BOTAO VOLTAR DO APARELHO ANDROID
        if (AGInputManager.vrTouchEvents.backButtonClicked()){
            vrGameManager.setCurrentScene(0); //volta para cena menu
            return;
        }

    }


}

package com.example.a02888054108.alfapp;

import com.example.a02888054108.alfapp.AndGraph.AGGameManager;
import com.example.a02888054108.alfapp.AndGraph.AGInputManager;
import com.example.a02888054108.alfapp.AndGraph.AGScene;
import com.example.a02888054108.alfapp.AndGraph.AGScreenManager;
import com.example.a02888054108.alfapp.AndGraph.AGSprite;


public class TelaMenu extends AGScene {
    //ATRIBUTOS DA CLASSE
    AGSprite botaoVoltar =null;
    int codigoSom1 = 0;

    AGSprite botaoVogais =null;
    AGSprite botaoSobre =null;
    AGSprite botaoNumeros =null;
    AGSprite vrFundoTela = null;

    //CONSTRUTOR DA CLASSE (RECEBE O GERENCIADOR)
    TelaMenu(AGGameManager gerenciador){
        super(gerenciador);
    }

    @Override
    //CHAMADO SEMPRE QUE A CENA FOR CHAMADA
    public void init() {

        //COLOCAR O QUE SERA NECESSARIO PARA A CENA
        //CONFIGURA FUNDO DE IMAGEM
        vrFundoTela = this.createSprite(R.drawable.telainicial, 100,100);
        vrFundoTela.setScreenPercent(100,100);
        vrFundoTela.vrPosition.setXY(AGScreenManager.iScreenWidth/2,AGScreenManager.iScreenHeight/2);

        //CRIA UM ELEMENTO VISUAL POSICIONADO NO CENTRO DA TELA
        botaoNumeros = createSprite(R.drawable.button_numeros, 1, 1);
        botaoNumeros.setScreenPercent(50,15);
        botaoNumeros.vrPosition.setXY((AGScreenManager.iScreenWidth/4)*2,
                (AGScreenManager.iScreenHeight/4)*3);

        botaoVogais = createSprite(R.drawable.button_vogais, 1, 1);
        botaoVogais.setScreenPercent(50,15);
        botaoVogais.vrPosition.setXY(AGScreenManager.iScreenWidth/2,
                AGScreenManager.iScreenHeight/2);

        botaoSobre = createSprite(R.drawable.button_sobre, 1, 1);
        botaoSobre.setScreenPercent(50,15);
        botaoSobre.vrPosition.setXY((AGScreenManager.iScreenWidth/4)*2,
                (AGScreenManager.iScreenHeight/4)*1);


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
        botoesTela();
        fecharTela();
    }

    public void fecharTela(){

        // BOTAO VOLTAR DO APARELHO ANDROID - FECHAR PROGRAMA
        if (AGInputManager.vrTouchEvents.backButtonClicked()){
            System.exit(0); //fecha aplicativo
            return;
        }

    }

    public void botoesTela(){
        if(AGInputManager.vrTouchEvents.screenClicked()){

            if (botaoVogais.collide(AGInputManager.vrTouchEvents.getLastPosition())){
                vrGameManager.setCurrentScene(1); //Tela animacao (vogais)
                return;
            }

            if (botaoNumeros.collide(AGInputManager.vrTouchEvents.getLastPosition())){
                vrGameManager.setCurrentScene(3); //Tela numeros
                return;
            }

            if (botaoSobre.collide(AGInputManager.vrTouchEvents.getLastPosition())){
                vrGameManager.setCurrentScene(2); //Tela sobre
                return;
            }

        }
    }

}

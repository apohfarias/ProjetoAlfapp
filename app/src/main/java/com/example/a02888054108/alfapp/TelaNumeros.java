package com.example.a02888054108.alfapp;

import com.example.a02888054108.alfapp.AndGraph.AGGameManager;
import com.example.a02888054108.alfapp.AndGraph.AGInputManager;
import com.example.a02888054108.alfapp.AndGraph.AGScene;
import com.example.a02888054108.alfapp.AndGraph.AGScreenManager;
import com.example.a02888054108.alfapp.AndGraph.AGSoundManager;
import com.example.a02888054108.alfapp.AndGraph.AGSprite;
import java.util.ArrayList;


public class TelaNumeros extends AGScene {

   //ATRIBUTOS DA CLASSE
    AGSprite vrFundoTela = null;

    AGSprite botao0 =null;
    AGSprite botao1 =null;
    AGSprite botao2 =null;
    AGSprite botao3 =null;
    AGSprite botao4 =null;
    AGSprite botao5 =null;
    AGSprite botao6 =null;
    AGSprite botao7 =null;
    AGSprite botao8 =null;
    AGSprite botao9 =null;

    int codigoSom0 = 0;
    int codigoSom1 = 0;
    int codigoSom2 = 0;
    int codigoSom3 = 0;
    int codigoSom4 = 0;
    int codigoSom5 = 0;
    int codigoSom6 = 0;
    int codigoSom7 = 0;
    int codigoSom8 = 0;
    int codigoSom9 = 0;


    ArrayList<AGSprite> vetorNumeros = null;
    AGSprite numeros[] = null;

    ArrayList<AGSprite> vetorNumerosSons = null;
    AGSprite numerosSons[] = null;

    //CONSTRUTOR DA CLASSE (RECEBE O GERENCIADOR)
    TelaNumeros(AGGameManager gerenciador){
        super(gerenciador);
    }

    @Override
    //CHAMADO SEMPRE QUE A CENA FOR CHAMADA
    public void init() {

        //COLOCAR O QUE SERA NECESSARIO PARA A CENA
        //CONFIGURA A COR DA CENA PARA AZUL (RGB)

        vrFundoTela = this.createSprite(R.drawable.telanumeros, 100,100);
        vrFundoTela.setScreenPercent(100,100);
        vrFundoTela.vrPosition.setXY(AGScreenManager.iScreenWidth/2,AGScreenManager.iScreenHeight/2);

        //Colocando imagem unica que mudam ao clicar na letra, usar uma imagem apenas
        vetorNumeros = new ArrayList<AGSprite>();
        numeros = new AGSprite[9];

        //Colocando os 10 CODIGOS dos sons de 0 a 9 ao clicar no numero, usar os codigos obtidos
        vetorNumerosSons = new ArrayList<AGSprite>();
        numerosSons = new AGSprite[9];

        //CRIANDO ELEMENTOS VISUAIS POSICIONADO NA TELA
        botao1 = createSprite(R.drawable.um, 1, 1);
        botao1.setScreenPercent(20,10);
        botao1.vrPosition.setXY((AGScreenManager.iScreenWidth/4)*1,
                (AGScreenManager.iScreenHeight/5)*4);
        codigoSom1 = AGSoundManager.vrSoundEffects.loadSoundEffect("um.mp3");

        botao2 = createSprite(R.drawable.dois, 1, 1);
        botao2.setScreenPercent(20,10);
        botao2.vrPosition.setXY((AGScreenManager.iScreenWidth/4)*2,
                (AGScreenManager.iScreenHeight/5)*4);
        codigoSom2 = AGSoundManager.vrSoundEffects.loadSoundEffect("dois.mp3");

        botao3 = createSprite(R.drawable.tres, 1, 1);
        botao3.setScreenPercent(20,10);
        botao3.vrPosition.setXY((AGScreenManager.iScreenWidth/4)*3,
                (AGScreenManager.iScreenHeight/5)*4);
        codigoSom3 = AGSoundManager.vrSoundEffects.loadSoundEffect("tres.mp3");

        botao4 = createSprite(R.drawable.quatro, 1, 1);
        botao4.setScreenPercent(20,10);
        botao4.vrPosition.setXY((AGScreenManager.iScreenWidth/4)*1,
                (AGScreenManager.iScreenHeight/5)*3);
        codigoSom4 = AGSoundManager.vrSoundEffects.loadSoundEffect("quatro.mp3");

        botao5 = createSprite(R.drawable.cinco, 1, 1);
        botao5.setScreenPercent(20,10);
        botao5.vrPosition.setXY((AGScreenManager.iScreenWidth/4)*2,
                (AGScreenManager.iScreenHeight/5)*3);
        codigoSom5 = AGSoundManager.vrSoundEffects.loadSoundEffect("cinco.mp3");

        botao6 = createSprite(R.drawable.seis, 1, 1);
        botao6.setScreenPercent(20,10);
        botao6.vrPosition.setXY((AGScreenManager.iScreenWidth/4)*3,
                (AGScreenManager.iScreenHeight/5)*3);
        codigoSom6 = AGSoundManager.vrSoundEffects.loadSoundEffect("seis.mp3");

        botao7 = createSprite(R.drawable.sete, 1, 1);
        botao7.setScreenPercent(20,10);
        botao7.vrPosition.setXY((AGScreenManager.iScreenWidth/4)*1,
                (AGScreenManager.iScreenHeight/5)*2);
        codigoSom7 = AGSoundManager.vrSoundEffects.loadSoundEffect("sete.mp3");

        botao8 = createSprite(R.drawable.oito, 1, 1);
        botao8.setScreenPercent(20,10);
        botao8.vrPosition.setXY((AGScreenManager.iScreenWidth/4)*2,
                (AGScreenManager.iScreenHeight/5)*2);
        codigoSom8 = AGSoundManager.vrSoundEffects.loadSoundEffect("oito.mp3");

        botao9 = createSprite(R.drawable.nove, 1, 1);
        botao9.setScreenPercent(20,10);
        botao9.vrPosition.setXY((AGScreenManager.iScreenWidth/4)*3,
                (AGScreenManager.iScreenHeight/5)*2);
        codigoSom9 = AGSoundManager.vrSoundEffects.loadSoundEffect("nove.mp3");

        botao0 = createSprite(R.drawable.zero, 1, 1);
        botao0.setScreenPercent(20,10);
        botao0.vrPosition.setXY((AGScreenManager.iScreenWidth/4)*2,
                (AGScreenManager.iScreenHeight/5)*1);
        codigoSom0 = AGSoundManager.vrSoundEffects.loadSoundEffect("zero.mp3");
    }

    //Reescreve o metodo de desenho da cena
    //Desenha primeiro todos os objetos autorender true
    //Desenha o restante dos elementos atraves da chamada ao metodo
    //Render do objeto a ser desenhado por ultimo
    public void render(){
        super.render();
        botao1.render();
        botao2.render();
        botao3.render();
        botao4.render();
        botao5.render();
        botao6.render();
        botao7.render();
        botao8.render();
        botao9.render();
        botao0.render();

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

        efeitosSonoros();
        voltarTela();
    }


    public void voltarTela(){

        // BOTAO VOLTAR DO APARELHO ANDROID
        if (AGInputManager.vrTouchEvents.backButtonClicked()){
            vrGameManager.setCurrentScene(0); //volta para cena menu
            return;
        }

    }

    public void efeitosSonoros(){
        //CONTROLA OS SONS DOS NUMEROS
        if (AGInputManager.vrTouchEvents.screenClicked()){

            if (botao1.collide(AGInputManager.vrTouchEvents.getLastPosition())){
                AGSoundManager.vrSoundEffects.play(codigoSom1);
                return;
            }
            if (botao2.collide(AGInputManager.vrTouchEvents.getLastPosition())){
                AGSoundManager.vrSoundEffects.play(codigoSom2);
                return;
            }

            if (botao3.collide(AGInputManager.vrTouchEvents.getLastPosition())){
                AGSoundManager.vrSoundEffects.play(codigoSom3);
                return;
            }

            if (botao4.collide(AGInputManager.vrTouchEvents.getLastPosition())){
                AGSoundManager.vrSoundEffects.play(codigoSom4);
                return;
            }
            if (botao5.collide(AGInputManager.vrTouchEvents.getLastPosition())){
                AGSoundManager.vrSoundEffects.play(codigoSom5);
                return;
            }
            if (botao6.collide(AGInputManager.vrTouchEvents.getLastPosition())){
                AGSoundManager.vrSoundEffects.play(codigoSom6);
                return;
            }
            if (botao7.collide(AGInputManager.vrTouchEvents.getLastPosition())){
                AGSoundManager.vrSoundEffects.play(codigoSom7);
                return;
            }
            if (botao8.collide(AGInputManager.vrTouchEvents.getLastPosition())){
                AGSoundManager.vrSoundEffects.play(codigoSom8);
                return;
            }

            if (botao9.collide(AGInputManager.vrTouchEvents.getLastPosition())){
                AGSoundManager.vrSoundEffects.play(codigoSom9);
                return;
            }
            if (botao0.collide(AGInputManager.vrTouchEvents.getLastPosition())){
                AGSoundManager.vrSoundEffects.play(codigoSom0);
                return;
            }
        }

    }

}

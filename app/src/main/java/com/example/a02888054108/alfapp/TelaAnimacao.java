package com.example.a02888054108.alfapp;

import com.example.a02888054108.alfapp.AndGraph.AGGameManager;
import com.example.a02888054108.alfapp.AndGraph.AGInputManager;
import com.example.a02888054108.alfapp.AndGraph.AGScene;
import com.example.a02888054108.alfapp.AndGraph.AGScreenManager;
import com.example.a02888054108.alfapp.AndGraph.AGSoundManager;
import com.example.a02888054108.alfapp.AndGraph.AGSprite;



public class TelaAnimacao extends AGScene {

    //ATRIBUTOS DA CLASSE

    AGSprite vrFundoTela = null;

    AGSprite botaoA =null;
    AGSprite botaoE =null;
    AGSprite botaoI =null;
    AGSprite botaoO =null;
    AGSprite botaoU =null;
    AGSprite abelha = null;
    AGSprite elefante = null;
    AGSprite igreja = null;
    AGSprite uva = null;
    AGSprite ovo = null;
    AGSprite aviao = null;
    AGSprite esquilo = null;
    AGSprite unicornio = null;

    int codigoSomA = 0;
    int codigoSomE = 0;
    int codigoSomI = 0;
    int codigoSomO = 0;
    int codigoSomU = 0;
    int codigoSomPoc = 0;
    int codigoSomOps = 0;



    //CONSTRUTOR DA CLASSE (RECEBE O GERENCIADOR)
    TelaAnimacao(AGGameManager gerenciador){
        super(gerenciador);
    }

    @Override
    //CHAMADO SEMPRE QUE A CENA FOR CHAMADA
    public void init() {

        //COLOCAR O QUE SERA NECESSARIO PARA A CENA
        //CONFIGURA A COR DA CENA PARA AZUL (RGB)
        //this.setSceneBackgroundColor(0,0,1);
        vrFundoTela = this.createSprite(R.drawable.telavogais, 100,100);
        vrFundoTela.setScreenPercent(100,100);
        vrFundoTela.vrPosition.setXY(AGScreenManager.iScreenWidth/2,AGScreenManager.iScreenHeight/2);

        //CRIANDO ELEMENTOS VISUAIS POSICIONADO NA TELA
        botaoA = createSprite(R.drawable.a, 1, 1); //Cria na tela
        botaoA.setScreenPercent(20,10); //Porcentagem de uso da tela
        botaoA.vrPosition.setXY((AGScreenManager.iScreenWidth/8)*4,
                (AGScreenManager.iScreenHeight/8)*6); //Posição na tela
        codigoSomA = AGSoundManager.vrSoundEffects.loadSoundEffect("a.mp3"); //mudar para os sons gravados no celular

        // Segue a mesma lógica usada na letra A
        botaoE = createSprite(R.drawable.e, 1, 1);
        botaoE.setScreenPercent(20,10);
        botaoE.vrPosition.setXY((AGScreenManager.iScreenWidth/8)*4,
                (AGScreenManager.iScreenHeight/8)*5);
        codigoSomE = AGSoundManager.vrSoundEffects.loadSoundEffect("e.mp3"); //mudar para os sons gravados no celul

        // Segue a mesma lógica usada nas letras anteriores
        botaoI = createSprite(R.drawable.i,1,1);
        botaoI.setScreenPercent(20,10);
        botaoI.vrPosition.setXY(AGScreenManager.iScreenWidth/2,
                AGScreenManager.iScreenHeight/2);
        codigoSomI = AGSoundManager.vrSoundEffects.loadSoundEffect("i.mp3"); //mudar para os sons gravados no celular

        // Segue a mesma lógica usada nas letras anteriores
        botaoO = createSprite(R.drawable.o, 1, 1);
        botaoO.setScreenPercent(20,10);
        botaoO.vrPosition.setXY((AGScreenManager.iScreenWidth/8)*4,
                (AGScreenManager.iScreenHeight/8)*3);
        codigoSomO = AGSoundManager.vrSoundEffects.loadSoundEffect("o.mp3"); //mudar para os sons gravados no celular

        // Segue a mesma lógica usada nas letras anteriores
        botaoU = createSprite(R.drawable.u, 1, 1);
        botaoU.setScreenPercent(20,10);
        botaoU.vrPosition.setXY((AGScreenManager.iScreenWidth/8)*4,
                (AGScreenManager.iScreenHeight/8)*2);
        codigoSomU = AGSoundManager.vrSoundEffects.loadSoundEffect("u.mp3"); //mudar para os sons gravados no celular

        //Criando imagens na tela
        abelha = createSprite(R.drawable.abelha, 1, 1);
        abelha.setScreenPercent(20,10);
        abelha.vrPosition.setXY((AGScreenManager.iScreenWidth/8)*1,
                (AGScreenManager.iScreenHeight/8)*5);

        aviao = createSprite(R.drawable.aviao, 1, 1);
        aviao.setScreenPercent(20,10);
        aviao.vrPosition.setXY((AGScreenManager.iScreenWidth/8)*7,
                (AGScreenManager.iScreenHeight/8)*3);

        elefante = createSprite(R.drawable.elefante, 1, 1);
        elefante.setScreenPercent(20,10);
        elefante.vrPosition.setXY((AGScreenManager.iScreenWidth/8)*1,
                (AGScreenManager.iScreenHeight/8)*3);

        esquilo = createSprite(R.drawable.esquilo, 1, 1);
        esquilo.setScreenPercent(20,10);
        esquilo.vrPosition.setXY((AGScreenManager.iScreenWidth/8)*7,
                (AGScreenManager.iScreenHeight/8)*7);

        igreja = createSprite(R.drawable.igreja, 1, 1);
        igreja.setScreenPercent(20,10);
        igreja.vrPosition.setXY((AGScreenManager.iScreenWidth/8)*7,
                (AGScreenManager.iScreenHeight/8)*1);

        ovo = createSprite(R.drawable.ovo, 1, 1);
        ovo.setScreenPercent(20,10);
        ovo.vrPosition.setXY((AGScreenManager.iScreenWidth/8)*1,
                (AGScreenManager.iScreenHeight/8)*1);

        uva = createSprite(R.drawable.uva, 1, 1);
        uva.setScreenPercent(20,10);
        uva.vrPosition.setXY((AGScreenManager.iScreenWidth/8)*7,
                (AGScreenManager.iScreenHeight/8)*5);

        unicornio = createSprite(R.drawable.unicornio, 1, 1);
        unicornio.setScreenPercent(20,10);
        unicornio.vrPosition.setXY((AGScreenManager.iScreenWidth/8)*1,
                (AGScreenManager.iScreenHeight/8)*7);

        //Efeito sonoro do erro
        codigoSomOps = AGSoundManager.vrSoundEffects.loadSoundEffect("ops.mp3");
        //Efeito sonoro do acerto
        codigoSomPoc = AGSoundManager.vrSoundEffects.loadSoundEffect("poc.wav");

    }

    //Reescreve o metodo de desenho da cena
    //Desenha primeiro todos os objetos autorender true
    //Desenha o restante dos elementos atraves da chamada ao metodo
    //Render do objeto a ser desenhado por ultimo
    public void render(){
        super.render();
        botaoA.render();
        botaoE.render();
        botaoI.render();
        botaoO.render();
        botaoU.render();
        abelha.render();
        aviao.render();
        esquilo.render();
        elefante.render();
        igreja.render();
        ovo.render();
        uva.render();
        unicornio.render();



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

        efeitosSonoro();
        ligaVogais();
        voltarTela();

    }

    public void voltarTela(){

        // BOTAO VOLTAR DO APARELHO ANDROID
        if (AGInputManager.vrTouchEvents.backButtonClicked()){
            vrGameManager.setCurrentScene(0); //volta para cena menu
            return;
        }

    }

    public void efeitosSonoro(){
        //CONTROLA OS SONS DAS LETRAS
        if (AGInputManager.vrTouchEvents.screenClicked()){

            if (botaoA.collide(AGInputManager.vrTouchEvents.getLastPosition())){
                AGSoundManager.vrSoundEffects.play(codigoSomA);
                return;
            }
            if (botaoE.collide(AGInputManager.vrTouchEvents.getLastPosition())){
                AGSoundManager.vrSoundEffects.play(codigoSomE);
                return;
            }
            if (botaoI.collide(AGInputManager.vrTouchEvents.getLastPosition())){
                AGSoundManager.vrSoundEffects.play(codigoSomI);
                return;
            }
            if (botaoO.collide(AGInputManager.vrTouchEvents.getLastPosition())){
                AGSoundManager.vrSoundEffects.play(codigoSomO);
                return;
            }
            if (botaoU.collide(AGInputManager.vrTouchEvents.getLastPosition())){
                AGSoundManager.vrSoundEffects.play(codigoSomU);
                return;
            }

        }

    }

    //FUNÇÃO QUE LIGA AS IMAGENS COM AS LETRAS
    public void ligaVogais() {

        //SE O EVENTO DE ARRASTAR NA  TELA FOR APLICADO
        if (AGInputManager.vrTouchEvents.screenDragged()) {
            //Abelha para o A
            if (abelha.collide(AGInputManager.vrTouchEvents.getLastPosition())) {
                //posicao da abelha vai pegando a ultima posicao clicada
                abelha.vrPosition.setXY(AGInputManager.vrTouchEvents.getLastPosition().getX(), AGInputManager.vrTouchEvents.getLastPosition().getY());
                if (abelha.collide(botaoA) ) { //Se abelha colidir com letra A,
                    abelha.bVisible = false; //some da tela
                    AGSoundManager.vrSoundEffects.play(codigoSomPoc); //Efeito sonoro, poc
                    return;
                }
                if (abelha.collide(botaoE) || abelha.collide(botaoI) || abelha.collide(botaoO) || abelha.collide(botaoU) ) { //Se colidir com quem não é A
                    abelha.vrPosition.setXY((AGScreenManager.iScreenWidth / 8) * 1,
                            (AGScreenManager.iScreenHeight / 8) * 5); //Volta para a posição inicial
                    AGSoundManager.vrSoundEffects.play(codigoSomOps); //Efeito sonoro, ops
                }
            }

            //Aviao para o A  -- Daqui pra baixo segue a mesma lógica usada na abelha
            if (aviao.collide(AGInputManager.vrTouchEvents.getLastPosition())) {
                aviao.vrPosition.setXY(AGInputManager.vrTouchEvents.getLastPosition().getX(), AGInputManager.vrTouchEvents.getLastPosition().getY());
                if (aviao.collide(botaoA) ) {
                    aviao.bVisible = false;
                    AGSoundManager.vrSoundEffects.play(codigoSomPoc);
                    return;
                }
                if (aviao.collide(botaoE) || aviao.collide(botaoI) || aviao.collide(botaoO) || aviao.collide(botaoU) ) {
                    aviao.vrPosition.setXY((AGScreenManager.iScreenWidth/8)*7,
                            (AGScreenManager.iScreenHeight/8)*3);
                    AGSoundManager.vrSoundEffects.play(codigoSomOps);
                    return;
                }
            }

            //Esquilo para o E - segue a mesma lógica usada nas imagens anteriores
            if (esquilo.collide(AGInputManager.vrTouchEvents.getLastPosition())) {
                esquilo.vrPosition.setXY(AGInputManager.vrTouchEvents.getLastPosition().getX(), AGInputManager.vrTouchEvents.getLastPosition().getY());
                if (esquilo.collide(botaoE) ) {
                    esquilo.bVisible = false;
                    AGSoundManager.vrSoundEffects.play(codigoSomPoc);
                    return;
                }
                if (esquilo.collide(botaoA) || esquilo.collide(botaoI) || esquilo.collide(botaoO) || esquilo.collide(botaoU) ) {
                    esquilo.vrPosition.setXY((AGScreenManager.iScreenWidth/8)*7,
                            (AGScreenManager.iScreenHeight/8)*7);
                    AGSoundManager.vrSoundEffects.play(codigoSomOps);
                    return;
                }
            }

            //Elefante para o E  - segue a mesma lógica usada nas imagens anteriores
            if (elefante.collide(AGInputManager.vrTouchEvents.getLastPosition())) {
                elefante.vrPosition.setXY(AGInputManager.vrTouchEvents.getLastPosition().getX(), AGInputManager.vrTouchEvents.getLastPosition().getY());
                if (elefante.collide(botaoE) ) {
                    elefante.bVisible = false;
                    AGSoundManager.vrSoundEffects.play(codigoSomPoc);
                    return;
                }
                if (elefante.collide(botaoA) || elefante.collide(botaoI) || elefante.collide(botaoO) || elefante.collide(botaoU) ) {
                    elefante.vrPosition.setXY((AGScreenManager.iScreenWidth/8)*1,
                            (AGScreenManager.iScreenHeight/8)*3);
                    AGSoundManager.vrSoundEffects.play(codigoSomOps);
                    return;
                }
            }

            //Igreja para o I  - segue a mesma lógica usada nas imagens anteriores
            if (igreja.collide(AGInputManager.vrTouchEvents.getLastPosition())) {
                igreja.vrPosition.setXY(AGInputManager.vrTouchEvents.getLastPosition().getX(), AGInputManager.vrTouchEvents.getLastPosition().getY());
                if (igreja.collide(botaoI) ) {
                    igreja.bVisible = false;
                    AGSoundManager.vrSoundEffects.play(codigoSomPoc);
                    return;
                }
                if (igreja.collide(botaoA) || igreja.collide(botaoE) || igreja.collide(botaoO) || igreja.collide(botaoU) ) {
                    igreja.vrPosition.setXY((AGScreenManager.iScreenWidth/8)*7,
                            (AGScreenManager.iScreenHeight/8)*1);
                    AGSoundManager.vrSoundEffects.play(codigoSomOps);
                    return;
                }
            }

            //Ovo para o O  - segue a mesma lógica usada nas imagens anteriores
            if (ovo.collide(AGInputManager.vrTouchEvents.getLastPosition())) {
                ovo.vrPosition.setXY(AGInputManager.vrTouchEvents.getLastPosition().getX(), AGInputManager.vrTouchEvents.getLastPosition().getY());
                if (ovo.collide(botaoO) ) {
                    ovo.bVisible = false;
                    AGSoundManager.vrSoundEffects.play(codigoSomPoc);
                    return;
                }
                if (ovo.collide(botaoA) || ovo.collide(botaoE) || ovo.collide(botaoI) || ovo.collide(botaoU) ) {
                    ovo.vrPosition.setXY((AGScreenManager.iScreenWidth/8)*1,
                            (AGScreenManager.iScreenHeight/8)*1);
                    AGSoundManager.vrSoundEffects.play(codigoSomOps);
                    return;
                }
            }

            //Uva para o U  - segue a mesma lógica usada nas imagens anteriores
            if (uva.collide(AGInputManager.vrTouchEvents.getLastPosition())) {
                uva.vrPosition.setXY(AGInputManager.vrTouchEvents.getLastPosition().getX(), AGInputManager.vrTouchEvents.getLastPosition().getY());
                if (uva.collide(botaoU) ) {
                    uva.bVisible = false;
                    AGSoundManager.vrSoundEffects.play(codigoSomPoc);
                    return;
                }
                if (uva.collide(botaoA) || uva.collide(botaoE) || uva.collide(botaoI) || uva.collide(botaoO)) {
                    uva.vrPosition.setXY((AGScreenManager.iScreenWidth/8)*7,
                            (AGScreenManager.iScreenHeight/8)*5);
                    AGSoundManager.vrSoundEffects.play(codigoSomOps);
                    return;
                }
            }
            //Unicornio para o U  - segue a mesma lógica usada nas imagens anteriores
            if (unicornio.collide(AGInputManager.vrTouchEvents.getLastPosition())) {
                unicornio.vrPosition.setXY(AGInputManager.vrTouchEvents.getLastPosition().getX(), AGInputManager.vrTouchEvents.getLastPosition().getY());
                if (unicornio.collide(botaoU) ) {
                    unicornio.bVisible = false;
                    AGSoundManager.vrSoundEffects.play(codigoSomPoc);
                    return;
                }
                if (unicornio.collide(botaoA) || unicornio.collide(botaoE) || unicornio.collide(botaoI) || unicornio.collide(botaoO)) {
                    unicornio.vrPosition.setXY((AGScreenManager.iScreenWidth/8)*1,
                            (AGScreenManager.iScreenHeight/8)*7);
                    AGSoundManager.vrSoundEffects.play(codigoSomOps);
                    return;
                }
            }

        }
    }
}


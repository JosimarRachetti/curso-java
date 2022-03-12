package condicoes;

public class breakContinue {
    public static void main(String[] args) {
        //BREAK para o programa

        for(int i=0;i<10;i++){
            if(i==8) break;
            System.out.println(i);
        }

        //Continue pula um valor ou passo na rotina do programa

        for (int j=0;j<10;j++){
         if(j==4 || j==8) continue;
         System.out.println(j);
        }

        //caso tenha um for dentro de outro e seja necessario
        //dar um break ou continue apenas no laço externo
        //usasse um externo apos o break ou continue;

    }
}

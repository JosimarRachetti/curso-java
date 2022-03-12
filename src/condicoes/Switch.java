package condicoes;

public class Switch {
    public static void main(String[] args) {
        String tribo = "preta";
        switch(tribo.toLowerCase()){
        case "preta":
            System.out.println("Aparece pouco no video");
            break;
        case "amarela":
            System.out.println("Aparece medio no video");
            break;
        case "azul":
            System.out.println("Aparece medio no video");
            break;
        case "vermelha":
            System.out.println("Aparace pouco no video");
            break;
        case "rosa":
            System.out.println("Aparece muito no video");
            break;
         default:
                System.out.println("Essa cor não existe");

        }

        //segundo exemplo
        int nota = 7;
        switch (nota){
            case 10: case 9: case 8:
                System.out.println("A");
                break;
            case 7: case 6: case 5:
                System.out.println("B");
                break;
            case 4: case 3:
                System.out.println("C");
            case 2: case 1: case 0:
                System.out.println("D");
            default:
                System.out.println("Valor não valido");

        }
    }
}

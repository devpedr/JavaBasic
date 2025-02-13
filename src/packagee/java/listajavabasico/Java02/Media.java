package listajavabasico.Java02;

public class Media {
    public static void main(String[]args){

        int num8 = 8;
        int num9 = 9;
        int num7 = 7;
        int num6 = 6;
        int num5 = 5;
        int num4 = 4;

        double media0 = (num8 + num9 + num7)/3;
        double media1 = (num6 + num5 + num4)/3;
        double somaMedia = media0 + media1;
        double mediaMedia = somaMedia/2;

        System.out.println("A média de 8, 9 e 7 é: "+media0);
        System.out.println("A média de 4, 4 e 6 é: "+media1);
        System.out.println("A soma das duas médias é: "+somaMedia);
        System.out.println("A média das médias é: "+mediaMedia);
    }
}

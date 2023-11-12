package figuras;

public class FIguras {

    public static void main(String[] args) {
        
        Cubo cubo1 = new Cubo(5);
        System.out.println(cubo1);
        
        Esfera esfera1 = new Esfera(1);
        System.out.println(esfera1);
        
        Paralelepipedo paralelepipedo1 = new Paralelepipedo(4,3,2);
        System.out.println(paralelepipedo1);
        
        Cilindro cilindro1 = new Cilindro(1,5);
        System.out.println(cilindro1);
        
        Cubo cubo2 = new Cubo(10);
        System.out.println(cubo2);
        
        System.out.println("-----------------------------------------");
        paralelepipedo1.setA(10);
        paralelepipedo1.setB(5);
        System.out.println(paralelepipedo1);
        
        System.out.println("-----------------------------------------");
        cubo1.setA(4);
        System.out.println(cubo1);
        
    } 
}

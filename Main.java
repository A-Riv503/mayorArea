import javax.swing.*;

public class Main {
    public static double figuraDeAreaMayor(Triangulo figura[]){
     double comparadorAreas=0;

          for(int i=0; i<figura.length; i++){
             if(figura[i].getAreaMayor() > comparadorAreas){
                 comparadorAreas=figura[i].getAreaMayor();
             }
          }
          return comparadorAreas ;

    }

    public static void main(String[] args) {
       /*DISEÑAR UN PROGRAMA PARA TRABAJAR CON TRIANGULOS ISOSELES PARA ELLO DEFINE LOS ATRIBUTOS NECESARIOS QUE SE REQUIEREN, PORPORCIONE METODOS DE CONSUTLA
       * UN METODO CONSTRUCTOR E IMPLEMENTA METODOS PARA CALCULAR EL PERIMETRO Y EL AREA DE UN TRIANGULO, ADEMAS IMPLEMENTA UN METODO QUE APARTIR DE UN ARREGLO DE
       * TRIANGULOS DEVUELVA EL AREA DEL DE MAYOR SUPERFICIE */


        int cantidad=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de triangulos que desa comparar "));
        Triangulo figura[]=new Triangulo[cantidad];
        int lado1,lado2,base;
        double areaMayor;
        for(int i=0; i<cantidad; i++){
            lado1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de los lados iguales del triangulo"));
            lado2=lado1;
            base=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la base del triangulo"));
            figura[i]=new Triangulo(lado1,lado2,base);
            System.out.println(figura[i].mostrarResultados());

        }

        areaMayor=figuraDeAreaMayor(figura);

        System.out.println("el triangulo que tiene el area mayor es "+String.format("%.2f",areaMayor));




    }
}
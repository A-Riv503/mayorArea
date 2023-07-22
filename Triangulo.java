public class Triangulo {

     int lado1;
     int lado2;
     int base;

     public Triangulo(int lado1, int lado2, int base){
          this.lado1=lado1;
          this.lado2=lado2;
          this.base=base;
     }

     public int perimetro(){

          int resultadoPerimetro=2*lado1+base;
          return resultadoPerimetro;
     }

     public double area(){
          double resultadoRaiz=((lado1*lado1)-(base*base/4));
          double raiz=Math.sqrt(resultadoRaiz);
          double resultadoArea=((base*raiz)/2);
          return resultadoArea;

     }

     public double getAreaMayor(){

          return area();
     }

     public String mostrarResultados(){
          return "el perimetro de los triangulos es de "+perimetro()+" el area de los triangulos es de "+String.format("%.2f",area());

     }






}

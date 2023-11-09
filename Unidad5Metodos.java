
package unidad5metodos;

public class Unidad5Metodos  {
   
    
       public static double  suma(double a, double b){
          double  resultado = a+b;
          return resultado;
          
       }
       public static double resta(double a, double b){
           double resultado = a-b;
           return resultado;
       }
       public  static double  multi(double a, double b){
           double resultado = a*b;
           return resultado;
       }
       public static double div(double a, double b){
           double resultado =a/b;
           return resultado;
           
       }
        public static void main(String[] args) {
         double a=1.2;
        double b=2.8; 
    System.out.println("la suma es:" + suma(a,b));
          
        System.out.println("La resta es:" + resta (a,b));
        System.out.println("La multiplicacion es:" + multi(a,b));
        System.out.println("La divicion es:" + div(a,b));
    }
       }
   

    


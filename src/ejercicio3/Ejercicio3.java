
package ejercicio3;


public class Ejercicio3 {
//Michelle, Araujo y Vitela
    
    public static void main(String[] args) {
        Quebrados q1 = new Quebrados(1, 1, 2);
        q1.Mostrar();
        q1.Suma("1 1/2");
        q1.Mostrar();
        q1.Resta("1 1/2");
        q1.Mostrar();
        q1.Multiplicacion("1 1/2");
        q1.Mostrar();
        q1.Dividir("1 1/2");
        q1.Mostrar();
        q1.nuevo(); 
        q1.Mostrar();
    }
    
}
class Quebrados{
    int entero, numerador, denominador;
    
    Quebrados(int e, int n, int d){
        entero=e;
        numerador=n;
        denominador=d;
    }
    
    public void Suma(String cadena){
        int et, nr, dr;
        et=Integer.parseInt(cadena.substring(0, cadena.indexOf(" ")));
        nr=Integer.parseInt(cadena.substring(cadena.indexOf(" ")+1, cadena.indexOf("/")));
        dr=Integer.parseInt(cadena.substring(cadena.indexOf("/")+1));
        
        numerador+=denominador*entero;
        nr+=dr*et;
//        System.out.println(num);
        if (denominador==dr) {
            numerador+=nr;
        } else {
            numerador=numerador*dr;
            nr=nr*denominador;
            numerador+=nr;
            denominador=denominador*dr;
        }
        entero=numerador/denominador;
        numerador=numerador%denominador;
    }
    public void Resta(String cadena){
        int et, nr, dr;
        et=Integer.parseInt(cadena.substring(0, cadena.indexOf(" ")));
        nr=Integer.parseInt(cadena.substring(cadena.indexOf(" ")+1, cadena.indexOf("/")));
        dr=Integer.parseInt(cadena.substring(cadena.indexOf("/")+1));
        
        numerador+=denominador*entero;
        nr+=dr*et;
        if (denominador==dr) {
            numerador-=nr;
        } else {
            numerador=numerador*dr;
            nr=nr*denominador;
            numerador-=nr;
            denominador=denominador*dr;
        }
        entero=numerador/denominador;
        numerador=numerador%denominador;
    }
    public void Multiplicacion(String cadena){
        int et, nr, dr;
        et=Integer.parseInt(cadena.substring(0, cadena.indexOf(" ")));
        nr=Integer.parseInt(cadena.substring(cadena.indexOf(" ")+1, cadena.indexOf("/")));
        dr=Integer.parseInt(cadena.substring(cadena.indexOf("/")+1));
        
        numerador+=denominador*entero;
        nr+=dr*et;
        numerador=numerador*nr;
        denominador=denominador*dr;
        
        entero=numerador/denominador;
        numerador=numerador%denominador;
    }
    public void Dividir(String cadena){
        int et, nr, dr;
        et=Integer.parseInt(cadena.substring(0, cadena.indexOf(" ")));
        nr=Integer.parseInt(cadena.substring(cadena.indexOf(" ")+1, cadena.indexOf("/")));
        dr=Integer.parseInt(cadena.substring(cadena.indexOf("/")+1));
        
        numerador+=denominador*entero;
        nr+=dr*et;
        numerador=numerador*dr;
        denominador=denominador*nr;
        
        entero=numerador/denominador;
        numerador=numerador%denominador;
    }
    public void Mostrar(){
        System.out.println(entero+" "+numerador+"/"+denominador);
    }
    public void nuevo(){
        entero=1;
        numerador=1;
        denominador=2;
    }
}
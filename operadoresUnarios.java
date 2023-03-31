
public class operadoresUnarios {
    public static void main(String args[]){
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //De esta manera invierto el valor de A
        
        var c = true;
        var d = !c;
        //De esta manera invierto de verdadero a falso
        
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //Operadores de incremento
        //1.preincremento (simbolo antes de la variable)
        var e = 3;   //De esta forma el incremento ya inpacta sobre el valor inicial
        var f = ++e; //Primero de incrementa la variable y despues se usa su valor
        
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        //2.postincremento (simbolo despues de la variable)
        var g = 5;   //De esta forma vemos que el valor impacta sobre el valor inicial pero despues vuelve a su valor.
        var h = g++; //Primero se utiliza el valor de la variable y despues se incrementa.
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //decremento
        //1.predecremento
        var i = 2; //Mismo que el primer ejemplo pero en decremento el valor afecta al inicial
        var j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //2.postdecremento
        var k = 4;
        var l = k--; //Primero se usa el valor de la variable y queda pendiente decremento
        System.out.println("k = " + k);//tenia pendiente un decremento 
        System.out.println("l = " + l);
        
        System.out.printf("%d", 2 < 3 ? 1 : 0);
        
        
        
        
        
        
    }
}


package calculadora.guicalculadora;

/**
 *
 * @author josem
 */
public class CalculadoraPruebaMain {

    public static void main(String[] args) {
        CalculadoraMetodos cal1 = new CalculadoraMetodos();
        CalculadoraMetodos cal2 = new CalculadoraMetodos();
        CalculadoraMetodos cal3 = new CalculadoraMetodos();
        CalculadoraMetodos cal4 = new CalculadoraMetodos();
        
        double resultado1 = cal1.sumar(15, 10);
        double resultado2 = cal2.restar(125, 10);
        double resultado3 = cal3.multiplicar(100, 10);
        double resultado4 = cal4.dividir(100, 10);
        
        System.out.println("Resultado suma = " + resultado1);
        System.out.println("Resultado resta =" + resultado2);
        System.out.println("Resultado multiplicacion =" + resultado3);
        System.out.println("Resultado division =" + resultado4);
        
        ConvertidorGrados conv = new ConvertidorGrados();
        
        double resultado = conv.celsius(90);
        
        double result = conv.fahrenheit(32);
        
        System.out.println("Resultados de Fahrenheit a Celsius = " + resultado);
        
        System.out.println("Resultados de Celsius a Fahrenheit = " + result);
    }
    
}


package calculadora.guicalculadora;

/**
 *
 * @author josem
 */
public class ConvertidorGrados {
    
    public double celsius(double grado1) {
        return ((grado1-32)*5/9);
    }
    
    public double fahrenheit(double grado1) {
        return ((grado1*9/5)+32);
    }
}

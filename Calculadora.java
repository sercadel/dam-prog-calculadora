
/**
 * Una clase que modela el funcionamiento basico de una calculadora.
 * 
 * @author sercadel 
 * @version 0.1.0
 */

import java.lang.Math;

public class Calculadora
{
    // Número del primer operando
    private int operando1;
    
    // Número del segundo operando
    private int operando2;
    
    // Número de operaciones realizadas
    private int totalOperaciones;

    /**
     * Constructor de objetos de la clase Calculadora
     * 
     * @param  operando1  valor del operando1
     * @param  operando2  valor del operando2
     */
    public Calculadora(int operando1, int operando2)
    {
        // inicializar las variables de la instancia
        
        // Valor inicial del primer operando al valor operando1
        this.operando1 = operando1;
        
        // Valor inicial del primer operando al valor operando2
        this.operando2 = operando2;
        
        // Valor inicial de totalOperaciones a 0
        this.totalOperaciones = 0;
    }
    
    /**
     * Devolver el numero de operaciones realizadas
     */
    public int getTotalOperaciones()
    {
        return totalOperaciones;
    }
    
    /**
     * Establecer el valor del primer operando
     * 
     * @param  operando1  valor del operando1
     */
    public void setOperando1(int operando1)
    {
        this.operando1 = operando1;
    }
    
    /**
     * Establecer el valor del segundo operando
     * 
     * @param  operando2  valor del operando2
     */
    public void setOperando2(int operando2)
    {
        this.operando2 = operando2;
    }

    /**
     * Suma
     * 
     * @return  la suma de operando1 y operando2
     */
    public int sumar()
    {
        // Aumenta el contador de totalOperaciones (Suma 1)
        this.totalOperaciones++;
        
        // Devuelve el valor de la operación
        return operando1 + operando2;
    }
    
    /**
     * Resta
     * 
     * @return  la resta de operando1 y operando2
     */
    public int restar()
    {
        // Aumenta el contador de totalOperaciones (Suma 1)
        this.totalOperaciones++;
        
        // Devuelve el valor de la operación
        return operando1 - operando2;
    }
    
    /**
     * Multiplicación
     * 
     * @return  la multiplicación de operando1 y operando2
     */
    public int multiplicar()
    {
        // Aumenta el contador de totalOperaciones (Suma 1)
        this.totalOperaciones++;
        
        // Devuelve el valor de la operación
        return operando1 * operando2;
    }
    
    /**
     * División
     * 
     * @return  la división de operando1 y operando2
     */
    public int dividir()
    {
        // Aumenta el contador de totalOperaciones (Suma 1)
        this.totalOperaciones++;
        
        // Devuelve el valor de la operación
        return operando1 / operando2;
    }
    
    /**
     * División Real
     * 
     * @return  la división real de operando1 y operando2
     */
    public double dividirReal()
    {
        // Aumenta el contador de totalOperaciones (Suma 1)
        this.totalOperaciones++;
        
        // Devuelve el valor de la operación
        return (operando1 * 1d) / operando2;
    }
    
    /**
     * Potencia
     * 
     * @return  la potencia de operando1 y operando2
     */
    public double calcularPotencia()
    {
        // Aumenta el contador de totalOperaciones (Suma 1)
        this.totalOperaciones++;
        
        // Devuelve el valor de la operación con la función pow()
        return Math.pow(operando1, operando2);
    }
    
    /**
     * Restablece los atributos al valor inicial
     */
    public void clear()
    {
        // Establece el valor del operando1 a 0
        this.operando1 = 0;
        
        // Establece el valor del operando2 a 0
        this.operando2 = 0;
        
        // Establece el valor de totalOperaciones a 0
        this.totalOperaciones = 0;
    }
}

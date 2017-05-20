/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorastrings;

import java.util.Scanner;

/**
 *
 * @author Ozuna
 */
public class CalculadoraStrings {

    
    public static void main(String[] args) {
        
        Scanner cadena = new Scanner (System.in);
        String opcion = cadena.nextLine();
                      
        String[] cadenaOperar = opcion.split(" ");
        
        switch (cadenaOperar[0].toUpperCase()){
            case "SUMA":
                sumar(cadenaOperar);
                break;
                
            case "RESTA":
                restar(cadenaOperar);               
                break;
                
            case "MULTIPLICACION":
                multiplicar (cadenaOperar);
                break;
                
            case "DIVISION":
                dividir(cadenaOperar);        
                break;
                
            default:
                System.out.println("Ingrese opcion valida");
                break;
        }
    }
    
    public static void sumar (String [] numeros){
        double resultadoSuma = 0;
                String [] cadenaSumar = numeros[1].split("\\+");
               
                try{
                    for(int i = 0; i < cadenaSumar.length; i ++){
                        if(cadenaSumar[i] != "+"){
                           resultadoSuma = resultadoSuma + Double.parseDouble(cadenaSumar[i]);
                        }
                    }
                    System.out.println(resultadoSuma);  
                }catch(NumberFormatException ex){
                    System.out.println("Operacion no valida");
                }
      
    }
    
    public static void restar(String [] numeros){
        double resultadoResta = 0;
                double auxiliar = 0;
                String [] cadenaRestar = numeros[1].split("\\-");
                
                try{
                    for(int i = 0; i < cadenaRestar.length; i ++){
                        if(cadenaRestar[i] != "-"){
                            if(i == 0){
                                resultadoResta = Double.parseDouble(cadenaRestar[i]);
                            }else{
                                auxiliar = Double.parseDouble(cadenaRestar[i]);
                            }
                            resultadoResta =  resultadoResta - auxiliar;
                        }
                    }
                    System.out.println(resultadoResta);  
                }catch(NumberFormatException ex){
                    System.out.println("Operacion no valida");
                }
    }
    
    public static void multiplicar (String [] numeros){
        double resultadoMultiplicar = 1;
        String [] cadenaMultiplicar = numeros[1].split("\\*");
                
        try{
            for(int i = 0; i < cadenaMultiplicar.length; i ++){
                if(cadenaMultiplicar[i] != "*"){
                    resultadoMultiplicar = resultadoMultiplicar * Double.parseDouble(cadenaMultiplicar[i]);
                }
            }
            System.out.println(resultadoMultiplicar);
        }catch(NumberFormatException ex){
            System.out.println("Operacion no valida");
        }  
    }
    
    public static void dividir (String [] numeros){
        double resultadoDividir = 0;
        double numerador = 0;
        double denominador = 0;
        String [] cadenaDividir = numeros[1].split("\\/");
                
        try{
            for(int i = 0; i < cadenaDividir.length; i ++){
                if(cadenaDividir[i] != "/"){
                    if(i == 0){
                        numerador = Double.parseDouble(cadenaDividir[i]);
                    }else{
                        denominador = Double.parseDouble(cadenaDividir[i]);
                    }
                }
                        
            }
            resultadoDividir = numerador / denominador;
            System.out.println(resultadoDividir);
            }catch(NumberFormatException ex){
                System.out.println("Operacion no valida");
            }
    }
}

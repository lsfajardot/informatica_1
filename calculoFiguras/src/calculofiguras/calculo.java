/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculofiguras;

/**
 *
 * @author estudiantes
 */
public class calculo {
    double lado;
    double base;
    double area;
    double perim;
    public void setLado(Double lado){
        this.lado=lado;
        }
    public Double getLado(){
        return this.lado;
        }
    public void setBase(Double base){
        this.base=base;
        }
    public Double getBase(){
        return this.base;
        }
    public void setarea(Double area){
        this.area=area;
        }
    public Double getarea(){
        return this.area;
        }  
    public void setperim(Double perim){
        this.perim=perim;
        }
    public Double getperim(){
        return this.perim;
        } 
    public static double cuadrado_area(double lado){
        double area= lado*lado;
        return area;
        }
    public static double cuadrado_perimetro(double lado){
        double perim=lado*4;
        return perim;
        }
    public static double circulo_area(double lado){
        double area= 3.14*lado*lado;
        return area;
        }
    public static double circulo_perimetro(double lado){
        double perim=2*3.14*lado;
        return perim;
        }
    public static double rectangulo_area(double lado, double base){
        double area= lado*base;
        return area;
        }
    public static double rectangulo_perimetro(double lado, double base){
        double perim=(2*lado)+(2*base);
        return perim;
        }
    public static double triangulo_area(double lado){
        double alt_tri=(Math.pow(3,1.0/2.0)*lado)/2;
        double area= (lado*alt_tri)/2;
        return area;
        }
    public static double triangulo_perimetro(double lado){
        double perim=lado*3;
        return perim;
        }  
}

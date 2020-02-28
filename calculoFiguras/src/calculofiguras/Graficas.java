/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculofiguras;

/**
 *
 * @author ageep
 */
import java.awt.Color;
import java.awt.Graphics;

public class Graficas {
    int ladog;
    int baseg;

        public void setLado(int ladog){
            this.ladog=ladog;
            }
        public int getLado(){
            return this.ladog;
            }
        public void setBase(int baseg){
            this.baseg=baseg;
            }
        public int getBase(){
            return this.baseg;
            }
        public static void Dibujarcuadrado (Graphics g, int ladog)  {
            g.setColor (Color.blue);
            g.drawRect (50, 50, ladog, ladog);
            }
        public static void Dibujarrectangulo (Graphics g,int ladog,int baseg)  {
            g.setColor (Color.blue);
            g.drawRect (50, 50, baseg, ladog);
            }
        public static void DibujarCirculo (Graphics g, int ladog)  {
            g.setColor (Color.blue);
            int radio=ladog*2;
            g.drawOval (50, 50, radio, radio); 
            } 
        public static void DibujarTriangulo (Graphics g,int ladog)  {
            g.setColor (Color.blue);
            int [] vx1 = {200, 200+ladog, 450};
            int [] vy1 = {200, 200+ladog, 120};
            g.drawPolygon (vx1, vy1, 3);   
            } 
}
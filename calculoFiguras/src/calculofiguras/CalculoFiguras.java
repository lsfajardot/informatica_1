/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package calculofiguras;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
/**
 *
 * @author estudiantes
 */
public class CalculoFiguras {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    interfazGrafica frame = new interfazGrafica();
                    frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            }
        });
    }

}

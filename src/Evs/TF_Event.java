/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evs;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 * Iván Zaid Corral Toca
 * Zayra Lucía Ortega Mejía
 * Sergio Jesús Quintero Mercado
 */
public class TF_Event {
    public void textKeyPpress(KeyEvent evt){
        char car=evt.getKeyChar();
        if((car<'a'||car>'z')&&(car<'A'||car>'Z')&&(car!=(char)KeyEvent.VK_BACK_SPACE)&&(car!=(char)KeyEvent.VK_SPACE)){
            evt.consume();
        }
    }
    public void numberKeyPress(KeyEvent evt){
        char car=evt.getKeyChar();
        
        if((car<'0'||car>'9')&&(car!=(char)KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        
    }
    public void numberDecimalKeyPress(KeyEvent evt,JTextField textField){
        char car=evt.getKeyChar();
        
        if((car <'0'||car>'9')&& textField.getText().contains(".")&&(car!=(char)KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        else if((car<'0'||car>'9')&&(car!='.')&&(car!=(char) KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
    }
}

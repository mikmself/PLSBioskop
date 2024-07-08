/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package widget;

import java.awt.Color;
import java.awt.Font;
import usu.widget.glass.ButtonImageReflection;

/**
 *
 * @author AA
 */
public class Button extends ButtonImageReflection{
     private static final long serialVersionUID = 1L;
     
      public Button() {
        super();
        setForeground(Color.white);
        setFont(getFont().deriveFont(Font.BOLD));
    }
     
     
}

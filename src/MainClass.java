import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;

public class MainClass {
    private static JFrame marco;
    private static JPanel pnl;
    private static JLabel eti;
    MainClass(){
        muestraGUI();

    }

    public static void muestraGUI(){
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco = new JFrame("Probando GitHub");
        pnl = new JPanel( new BorderLayout(0,1));
        eti = new JLabel("Hola GitHub!");
        marco.add(pnl);
        marco.add(eti);
        marco.setBounds(400,400,400,400);
        marco.setVisible(true);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            MainClass main = new MainClass();
        });
        //muestraGUI();
        //System.out.println("Hola Git!");
    }
}

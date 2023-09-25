package Control;
 import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class GUIControl extends JFrame implements ActionListener  {
    private JFrame frame;
    GUIControl admin;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem On, Off;
    TextField tf;
    
    
    public GUIControl() {
        frame = new JFrame("Controlador de Dispositivos");
        admin = new GUIControl();
        menuBar = new JMenuBar();
        
        menu = new JMenu("Botones");
        On = new JMenuItem("Encender");
        Off = new JMenuItem("Apagar");

        On.addActionListener(this);
        Off.addActionListener(this);

        On.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para agregar libro...
            }
        });
        
        Off.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para eliminar libro por ISBN...
            }
        });
        menu.add(On);
        menu.add(Off);
        frame.setJMenuBar(menuBar);


        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
}


@Override
public void actionPerformed(ActionEvent e) {}
}

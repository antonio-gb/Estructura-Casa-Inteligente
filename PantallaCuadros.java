package Control;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PantallaCuadros extends JFrame {
    private List<JLabel> cuadros;
    private List<Integer> lastConfiguration;

    public PantallaCuadros() {
        setTitle("Pantalla de Cuadros");
        setLayout(new GridLayout(1, 4));

        String[] nombres = {"Luz", "Garage", "Sala Luz", "Stereo", "TV", "Ventilador", "Yacuzzi", "Vacaciones"};

        cuadros = new ArrayList<>();
        lastConfiguration = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            JLabel cuadro = new JLabel(nombres[i]);
            cuadro.setOpaque(true);
            cuadro.setPreferredSize(new Dimension(100, 50));
            cuadro.setBackground(Color.WHITE);
            cuadros.add(cuadro);
            add(cuadro);
        }

        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void setColor(int number) {
        if (number >= 1 && number <= 7) {
            cuadros.get(number - 1).setBackground(Color.MAGENTA);        
            lastConfiguration.add(number);
        }
    }

    public void clearColor(int number) {
        if (number >= 1 && number <= 7) {
            cuadros.get(number - 1).setBackground(Color.WHITE);
            lastConfiguration.remove(Integer.valueOf(number));
        }
    }

    public void clearAll() {
        for (JLabel cuadro : cuadros) {
            cuadro.setBackground(Color.WHITE);
        }
        lastConfiguration.clear();
    }

    public List<Integer> getLastConfiguration() {
        return new ArrayList<>(lastConfiguration);
    }

    private static void delaySegundo(){
        try{
            Thread.sleep(999);
        }catch(InterruptedException e){}
    }

    public void setLastConfiguration(List<Integer> configuration) {
        clearAll();
        for (Integer number : configuration) { 
            setColor(number);
        }       
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PantallaCuadros().setVisible(true);
            }
        });
    }

    boolean isColorSet(int number) {
    if (number >= 1 && number <= 7) {
        Color backgroundColor = cuadros.get(number - 1).getBackground();
        return backgroundColor.equals(Color.MAGENTA);
    }
    return false;
}



}



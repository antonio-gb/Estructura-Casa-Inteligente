package Control;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class PantallaBotones extends JFrame implements Observer {
    private Subject subject = new Subject();
    private BotonesObserver botonesObserver;
    private static PantallaBotones instance;
    private List<Observer> observers = new ArrayList<>();
    private JButton luzButton;
    private JButton garageButton;
    private JButton salaLuzButton;
    private JButton stereoButton;
    private JButton tvButton;
    private JButton ventiladorButton;
    private JButton yacuzziButton;

    private JButton luzOffButton;
    private JButton garageOffButton;
    private JButton salaLuzOffButton;
    private JButton stereoOffButton;
    private JButton tvOffButton;
    private JButton ventiladorOffButton;
    private JButton yacuzziOffButton;

    private JButton undoButton;
    private JButton fueraDeCasaButton;
    private JButton modoVacacionesButton;
    private JButton adiosButton;

    private PantallaCuadros pantallaCuadros;

    private int lastActiveNumber = -1; // Para almacenar el número del último cuadro activo

    private List<Integer> lastConfiguration;

    private PantallaBotones() {
        botonesObserver = new BotonesObserver(this);
        setTitle("Pantalla de Botones");
        setLayout(new GridLayout(4, 1));
        
        lastConfiguration = new ArrayList<>();

        // Inicializar botones principales
        luzButton = new JButton("Luz");
        garageButton = new JButton("Garage");
        salaLuzButton = new JButton("Sala Luz");
        stereoButton = new JButton("Stereo");
        tvButton = new JButton("TV");
        ventiladorButton = new JButton("Ventilador");
        yacuzziButton = new JButton("Yacuzzi");

        // Inicializar botones "Off"
        luzOffButton = new JButton("Luz Off");
        garageOffButton = new JButton("Garage Close");
        salaLuzOffButton = new JButton("Sala Luz Off");
        stereoOffButton = new JButton("Stereo Off");
        tvOffButton = new JButton("TV Off");
        ventiladorOffButton = new JButton("Ventilador Off");
        yacuzziOffButton = new JButton("Yacuzzi Off");

        // Inicializar botón Undo
        undoButton = new JButton("Undo");

        // Inicializar botón Fuera de Casa
        fueraDeCasaButton = new JButton("Fuera de Casa");

        // Inicializar botón Modo Vacaciones
        modoVacacionesButton = new JButton("Modo Vacaciones");
        
        // Inicializar botón Adios
        adiosButton = new JButton("Adios");
        
        // Agregar ActionListener a los botones principales
        luzButton.addActionListener(new TopButtonListener(1));
        garageButton.addActionListener(new TopButtonListener(2));
        salaLuzButton.addActionListener(new TopButtonListener(3));
        stereoButton.addActionListener(new TopButtonListener(4));
        tvButton.addActionListener(new TopButtonListener(5));
        ventiladorButton.addActionListener(new TopButtonListener(6));
        yacuzziButton.addActionListener(new TopButtonListener(7));

        // Agregar ActionListener a los botones "Off"
        luzOffButton.addActionListener(new BottomButtonListener(1));
        garageOffButton.addActionListener(new BottomButtonListener(2));
        salaLuzOffButton.addActionListener(new BottomButtonListener(3));
        stereoOffButton.addActionListener(new BottomButtonListener(4));
        tvOffButton.addActionListener(new BottomButtonListener(5));
        ventiladorOffButton.addActionListener(new BottomButtonListener(6));
        yacuzziOffButton.addActionListener(new BottomButtonListener(7));

        // Agregar ActionListener al botón Undo
        undoButton.addActionListener(new UndoButtonListener());

        // Agregar ActionListener al botón Fuera de Casa
        fueraDeCasaButton.addActionListener(new FueraDeCasaButtonListener());

        // Agregar ActionListener al botón Modo Vacaciones
        modoVacacionesButton.addActionListener(new ModoVacacionesButtonListener());

        // Agregar ActionListener al botón Adios
        adiosButton.addActionListener(new AdiosButtonListener());
        
        // Crear paneles para los botones
        JPanel topPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        JPanel controlPanel = new JPanel();
        JPanel specialPanel = new JPanel();

        // Establecer el diseño de los paneles
        topPanel.setLayout(new GridLayout(1, 7));
        bottomPanel.setLayout(new GridLayout(1, 7));
        controlPanel.setLayout(new GridLayout(1, 1));
        specialPanel.setLayout(new GridLayout(1, 3));

        // Agregar los botones principales al panel superior
        topPanel.add(luzButton);
        topPanel.add(garageButton);
        topPanel.add(salaLuzButton);
        topPanel.add(stereoButton);
        topPanel.add(tvButton);
        topPanel.add(ventiladorButton);
        topPanel.add(yacuzziButton);

        // Agregar los botones "Off" al panel inferior
        bottomPanel.add(luzOffButton);
        bottomPanel.add(garageOffButton);
        bottomPanel.add(salaLuzOffButton);
        bottomPanel.add(stereoOffButton);
        bottomPanel.add(tvOffButton);
        bottomPanel.add(ventiladorOffButton);
        bottomPanel.add(yacuzziOffButton);

        // Agregar el botón Undo al panel de control
        controlPanel.add(undoButton);

        // Agregar los botones especiales al panel especial
        specialPanel.add(fueraDeCasaButton);
        specialPanel.add(modoVacacionesButton);
        specialPanel.add(adiosButton); 

        // Agregar los paneles al frame principal
        add(topPanel);
        add(bottomPanel);
        add(controlPanel);
        add(specialPanel);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

        public static PantallaBotones getInstance(){
            if(instance == null){
                instance = new PantallaBotones();
            }
            return instance;
        }

        @Override
        public void update(){
            notifyObservers();
        }

    
        public void addObserver(Observer observer) {
            observers.add(observer);
        }
    
        public void removeObserver(Observer observer) {
            observers.remove(observer);
        }
    
        private void notifyObservers() {
            for (Observer observer : observers) {
                observer.update();
            }
        }

    
   
    private void clearAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setColor(Integer buttonNumber) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private class TopButtonListener implements ActionListener {
        private int number;

        public TopButtonListener(int number) {
            this.number = number;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (pantallaCuadros != null) {
                pantallaCuadros.setColor(number);
                lastActiveNumber = number; // Almacenar el número del cuadro activo
                subject.notifyObservers();
            } else {
                pantallaCuadros = new PantallaCuadros();
                pantallaCuadros.setColor(number);
                pantallaCuadros.setVisible(true);
                lastActiveNumber = number; // Almacenar el número del cuadro activo
                subject.notifyObservers();
            }
            delaySegundo();
        }
    }

    private class BottomButtonListener implements ActionListener {
        private int number;

        public BottomButtonListener(int number) {
            this.number = number;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (pantallaCuadros != null) {
                pantallaCuadros.clearColor(number);
                subject.notifyObservers();
            }
            delaySegundo();
        }
    }

  private class UndoButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (lastActiveNumber != -1 && pantallaCuadros != null) {
            if (pantallaCuadros.isColorSet(lastActiveNumber)) {
                pantallaCuadros.clearColor(lastActiveNumber);
            } else {
                pantallaCuadros.setColor(lastActiveNumber);
            }
        }
        delaySegundo();
    }
}

    private class FueraDeCasaButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (pantallaCuadros != null) {
                lastConfiguration = pantallaCuadros.getLastConfiguration();
                pantallaCuadros.clearAll();
            }
            delaySegundo();
        }
    }

    private class ModoVacacionesButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (pantallaCuadros != null) {
                pantallaCuadros.setLastConfiguration(lastConfiguration);
                delaySegundo();
            }
           
        }
    }
    
    private class AdiosButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Cierra la ventana principal y finaliza la aplicación
        dispose(); // Cierra la ventana principal
        System.exit(0); // Finaliza la aplicación
    }
}
   
   public void setConfiguration(List<Integer> configuration) {
        // Configurar los cuadros según la lista de números proporcionada
        clearAll();
        for (Integer buttonNumber : configuration) {
            setColor(buttonNumber);
        }
    }

    private static void delaySegundo(){
        try{
            Thread.sleep(999);
        }catch(InterruptedException e){}
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                PantallaBotones pantallabotones = PantallaBotones.getInstance();
                pantallabotones.addObserver(pantallabotones.botonesObserver);
                pantallabotones.setVisible(true);
            }
        });
    }


}
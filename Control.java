package Control;
import java.lang.reflect.Array;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Control {
    public static void main(String[] args){  
        int opcion=0;
        int ultAccion = 0;
        Comando[] command = new Comando[15];
        Scanner c = new Scanner(System.in); 
        Stack<Integer> pila = new Stack<Integer>();
         Queue<Integer> cola = new LinkedList<Integer>();

        
        //ControlRemoto remote = new ControlRemoto();
        ControlRemoto remote = ControlRemoto.obtenerInstancia();
        //ControlRemoto [] arregloDeControl = new ControlRemoto[4];  
        Luz luz = new Luz();
        LuzEnComando luzOn = new LuzEnComando(luz); command[0]=luzOn;
        LuzOffComando luzOff = new LuzOffComando(luz);command[1]=luzOff;
        PuertaGarage puerta = new PuertaGarage();
        ComandoGarage puertaOn = new ComandoGarage(puerta) ;command[3]=puertaOn;
        ComandoGarageCerrar puertaOff = new ComandoGarageCerrar(puerta);command[4]=puertaOff;
        Stereo stereo = new Stereo("Sala");
        StereoOnComando StereoOn = new StereoOnComando(stereo);command[5]=StereoOn;
        StereoOffComando StereoOff = new StereoOffComando(stereo);command[6]=StereoOff;
        SalaLuzOn luzEnc = new SalaLuzOn(luz);command[7]=luzEnc;
        SalaLuzOff luzApa = new SalaLuzOff(luz);command[8]=luzApa;
        Yacuzzi yacuzzi = new Yacuzzi();
        YacuzziOn yaOn = new YacuzziOn(yacuzzi);command[9]=yaOn;
        YacuzziOff yaOff = new YacuzziOff(yacuzzi);command[10]=yaOff;
        TV tv = new TV("Cuarto");
        TVOn tvon = new TVOn(tv);command[11]=tvon;
        TVOff tvoff = new TVOff(tv);command[12]=tvoff;
        Ventilador ventilador = new Ventilador();
        VentiladorOn von = new VentiladorOn(ventilador);command[13]=von;
        VentiladorOff voff = new VentiladorOff(ventilador);command[14]=voff;
        int minutos=0;
        int segundos=0;

        for(minutos=0;minutos<100;minutos++){
            for(segundos=0;segundos<100;segundos++){
while(opcion != 17){
System.out.println("\n Elíge la opción que deseas: \n 1. Encender la luz \n 2. Apagar Luz \n 3. Abrir Puerta \n 4. Cerrar Puerta \n 5. Encender Stereo \n 6. Apagar Stereo \n 7. Encender luz de la Sala \n 8. Apagar luz de la sala \n 9. Encender yacuzzi \n 10. Apagar yacuzzi  \n 11. Encender TV \n 12. Apagar TV \n 13. Encender Ventilador \n 14. Apagar Ventilador \n 15. Modo Vacaciones \n 16. Undo \n 17. Salir");
opcion = c.nextInt();

switch(opcion){
        case 1:
        remote.setCommand(luzOn);
        remote.buttonWasPressed();
        pila.push(1);
        cola.add(1);
        break;
        case 2:
        remote.setCommand(luzOff);
        remote.buttonWasPressed();
        pila.push(2);
        cola.add(2);
        break;
        case 3:
        remote.setCommand(puertaOn);
        remote.buttonWasPressed();
        pila.push(3);
        cola.add(3);
        break;
        case 4:
        remote.setCommand(puertaOff);
        remote.buttonWasPressed();
        pila.push(4);
        cola.add(4);
        break;
        case 5:
        remote.setCommand(StereoOn);
        remote.buttonWasPressed();
        pila.push(5);
        cola.add(5);
        break;
        case 6:
        remote.setCommand(StereoOff);
        remote.buttonWasPressed();
        pila.push(6);
        cola.add(6);
        break;
        case 7:
        remote.setCommand(luzEnc);
        remote.buttonWasPressed();
        pila.push(7);
        cola.add(7);
        break;
        case 8:
        remote.setCommand(luzApa);
        remote.buttonWasPressed();
        pila.push(8);
        cola.add(8);
        break;
        case 9: 
        remote.setCommand(yaOn);
        remote.buttonWasPressed();
        pila.push(9);
        cola.add(9);
        break;
        case 10: 
        remote.setCommand(yaOff);
        remote.buttonWasPressed();
        pila.push(10);
        cola.add(10);
        break; 
        case 11:
        remote.setCommand(tvon);
        remote.buttonWasPressed();
        pila.push(11);
        cola.add(11);
        break;
        case 12:
        remote.setCommand(tvoff);
        remote.buttonWasPressed();
        pila.push(12);
        cola.add(12);
        break;
        case 13:
        remote.setCommand(von);
        remote.buttonWasPressed();
        pila.push(13);
        cola.add(13);
        break;
        case 14:
        remote.setCommand(voff);
        remote.buttonWasPressed();
        pila.push(14);
        cola.add(14);
        break;
        case 15:
        if(cola.isEmpty()){
            System.out.println("Ya no hay acciones");
         }
         while(!cola.isEmpty()){
        int elemento=cola.poll();;
            DeterminarAccionCola(elemento);
        }
         
    
         break;
         case 16:
         if(pila.isEmpty()){
            System.out.println("No acciones que deshacer");
        }
        if(pila.empty() == false){
        ultAccion = pila.peek();
        pila.pop();
        DeterminarAccion(ultAccion);
            break;
         }
         }
         
        }
        if(opcion != 17){
        delaySegundo();
        }
    
    
    }
        }
    }



    private static void delaySegundo(){
        try{
            Thread.sleep(9999);
        }catch(InterruptedException e){}
    }

    public static void DeterminarAccion(int accion){


        //ControlRemoto remote = new ControlRemoto();
        ControlRemoto remote = ControlRemoto.obtenerInstancia();
        //ControlRemoto [] arregloDeControl = new ControlRemoto[4];  
        Luz luz = new Luz();
        LuzEnComando luzOn = new LuzEnComando(luz); 
        LuzOffComando luzOff = new LuzOffComando(luz);
        PuertaGarage puerta = new PuertaGarage();
        ComandoGarage puertaOn = new ComandoGarage(puerta) ;
        ComandoGarageCerrar puertaOff = new ComandoGarageCerrar(puerta);
        Stereo stereo = new Stereo("Sala");
        StereoOnComando StereoOn = new StereoOnComando(stereo);
        StereoOffComando StereoOff = new StereoOffComando(stereo);
        SalaLuzOn luzEnc = new SalaLuzOn(luz);
        SalaLuzOff luzApa = new SalaLuzOff(luz);
        Yacuzzi yacuzzi = new Yacuzzi();
        YacuzziOn yaOn = new YacuzziOn(yacuzzi);
        YacuzziOff yaOff = new YacuzziOff(yacuzzi);
        TV tv = new TV("Cuarto");
        TVOn tvon = new TVOn(tv);
        TVOff tvoff = new TVOff(tv);
        Ventilador ventilador = new Ventilador();
        VentiladorOn von = new VentiladorOn(ventilador);
        VentiladorOff voff = new VentiladorOff(ventilador);
        
        switch(accion){
            case 1:
            remote.setCommand(luzOff);
            remote.buttonWasPressed();

            break;
            case 2:
            remote.setCommand(luzOn);
        remote.buttonWasPressed();
            break;
            case 3:
            remote.setCommand(puertaOff);
        remote.buttonWasPressed();
            break;
            case 4:
            remote.setCommand(puertaOn);
        remote.buttonWasPressed();
            break;
            case 5:
            remote.setCommand(StereoOff);
        remote.buttonWasPressed();
            break;
            case 6:
            remote.setCommand(StereoOn);
        remote.buttonWasPressed();
            break;
            case 7:
            remote.setCommand(luzApa);
        remote.buttonWasPressed();
            break;
            case 8:
            remote.setCommand(luzEnc);
        remote.buttonWasPressed();
            break;
            case 9:
            remote.setCommand(yaOff);
        remote.buttonWasPressed();
            break;
            case 10:
            remote.setCommand(yaOn);
        remote.buttonWasPressed();
            break;
            case 11:
            remote.setCommand(tvoff);
        remote.buttonWasPressed();
            break;
            case 12:
            remote.setCommand(tvon);
        remote.buttonWasPressed();
            break;
            case 13:
            remote.setCommand(voff);
        remote.buttonWasPressed();
            break;
            case 14:
            remote.setCommand(von);
        remote.buttonWasPressed();
            break;

        }
    }

     public static void DeterminarAccionCola(int accion){


        //ControlRemoto remote = new ControlRemoto();
        ControlRemoto remote = ControlRemoto.obtenerInstancia();
        //ControlRemoto [] arregloDeControl = new ControlRemoto[4];  
        Luz luz = new Luz();
        remote.agregarObservador(luz);
        LuzEnComando luzOn = new LuzEnComando(luz); 
        LuzOffComando luzOff = new LuzOffComando(luz);
        PuertaGarage puerta = new PuertaGarage();
        ComandoGarage puertaOn = new ComandoGarage(puerta) ;
        ComandoGarageCerrar puertaOff = new ComandoGarageCerrar(puerta);
        Stereo stereo = new Stereo("Sala");
        StereoOnComando StereoOn = new StereoOnComando(stereo);
        StereoOffComando StereoOff = new StereoOffComando(stereo);
        SalaLuzOn luzEnc = new SalaLuzOn(luz);
        SalaLuzOff luzApa = new SalaLuzOff(luz);
        Yacuzzi yacuzzi = new Yacuzzi();
        YacuzziOn yaOn = new YacuzziOn(yacuzzi);
        YacuzziOff yaOff = new YacuzziOff(yacuzzi);
        TV tv = new TV("Cuarto");
        TVOn tvon = new TVOn(tv);
        TVOff tvoff = new TVOff(tv);
        Ventilador ventilador = new Ventilador();
        VentiladorOn von = new VentiladorOn(ventilador);
        VentiladorOff voff = new VentiladorOff(ventilador);
        
        switch(accion){
            case 1:
            remote.setCommand(luzOn);
            remote.buttonWasPressed();

            break;
            case 2:
            remote.setCommand(luzOff);
        remote.buttonWasPressed();
            break;
            case 3:
            remote.setCommand(puertaOn);
        remote.buttonWasPressed();
            break;
            case 4:
            remote.setCommand(puertaOff);
        remote.buttonWasPressed();
            break;
            case 5:
            remote.setCommand(StereoOn);
        remote.buttonWasPressed();
            break;
            case 6:
            remote.setCommand(StereoOff);
        remote.buttonWasPressed();
            break;
            case 7:
            remote.setCommand(luzEnc);
        remote.buttonWasPressed();
            break;
            case 8:
            remote.setCommand(luzApa);
        remote.buttonWasPressed();
            break;
            case 9:
            remote.setCommand(yaOn);
        remote.buttonWasPressed();
            break;
            case 10:
            remote.setCommand(yaOff);
        remote.buttonWasPressed();
            break;
            case 11:
            remote.setCommand(tvon);
        remote.buttonWasPressed();
            break;
            case 12:
            remote.setCommand(tvoff);
        remote.buttonWasPressed();
            break;
            case 13:
            remote.setCommand(von);
        remote.buttonWasPressed();
            break;
            case 14:
            remote.setCommand(voff);
        remote.buttonWasPressed();
            break;

        }
    }


}



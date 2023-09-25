package Control;

public class DeterminarAccion {
    
    public void DeterminarAccion(int accion){

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
}

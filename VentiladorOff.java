package Control;
public class VentiladorOff implements Comando {
    Ventilador ventilador;

    public VentiladorOff(Ventilador ventilador){
        this.ventilador=ventilador;
    }

    public void execute(){
        ventilador.off();
    }
    public void undo(){
        ventilador.on();
    }
}
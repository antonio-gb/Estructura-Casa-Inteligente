package Control;
public class VentiladorOn implements Comando {
    Ventilador ventilador;

    public VentiladorOn(Ventilador ventilador){
        this.ventilador=ventilador;
    }

    public void execute(){
        ventilador.on();
    }
    public void undo(){
        ventilador.off();
    }
}

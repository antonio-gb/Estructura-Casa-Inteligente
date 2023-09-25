package Control;
public class LuzOffComando implements Comando{
    Luz luz;

    public LuzOffComando(Luz luz){
        this.luz = luz;
    }

    public void execute(){
        luz.off();
    }
    public void undo(){
        luz.on();
    }
}
package Control;
public class TVOff implements Comando {
    TV tv;

    public TVOff(TV tv){
        this.tv=tv;
    }

    public void execute(){
        tv.off();
    }
    public void undo(){
        tv.on();
    }
}
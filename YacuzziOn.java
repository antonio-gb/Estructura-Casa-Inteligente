package Control;
public class YacuzziOn implements Comando{
    
    Yacuzzi yacuzzi;

    public YacuzziOn(Yacuzzi yacuzzi){
        this.yacuzzi  = yacuzzi;
    }


    public void execute(){
        yacuzzi.on();
        yacuzzi.calentar();
        yacuzzi.burbujasOn();
    }
    public void undo(){
        yacuzzi.off();
    }
}

package Control;
public class StereoOnComando implements Comando {
    Stereo stereo;

    public StereoOnComando(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute(){
        stereo.on();
        stereo.setVolume(11);
        stereo.setCD();

    }
    public void undo(){
        stereo.off();
    }
}

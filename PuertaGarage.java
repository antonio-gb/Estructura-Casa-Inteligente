package Control;
public class PuertaGarage implements Observador {
    public PuertaGarage(){}
    public void actualizar(String mensaje) {
        // Implementa el código para reaccionar a las actualizaciones del sujeto observado (ControlRemoto)
        System.out.println("Garage: " + mensaje);
    }
    public void up(){
        System.out.println("La puerta está abierta");
    }
    public void down(){
        System.out.println("La puerta está cerrada");
    }
    public void stop(){
        System.out.println("La puerta se detuvo");
    }
    public void LightOn(){
        System.out.println("Se encendio la Luz del garage");
    }
    public void LightOff(){
        System.out.println("Se apago la luz de garage");
    }
}

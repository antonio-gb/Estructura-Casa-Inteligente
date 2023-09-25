package Control;
public class Luz implements Observador {
    public Luz(){

    }
    public void actualizar(String mensaje) {
        // Implementa el código para reaccionar a las actualizaciones del sujeto observado (ControlRemoto)
        System.out.println("Luz: " + mensaje);
    }
    public void on (){
System.out.println("Luz encendida");
    }
    public void off(){
System.out.println("Luz apagada");
    }
}

package Control;

import java.util.ArrayList;
import java.util.List;

public class ControlRemoto {
  
    private static ControlRemoto instancia = null;
  private List<Observador> observadores = new ArrayList<>();
    private ControlRemoto() {
        // Constructor privado para evitar la creación de instancias desde fuera de la clase.
    }

    public static ControlRemoto obtenerInstancia() {
        if (instancia == null) {
            instancia = new ControlRemoto();
        }
        return instancia;
}
public void agregarObservador(Observador observador) {
  observadores.add(observador);
}

// Notifica a todos los observadores cuando se realiza una acción
private void notificarObservadores(String mensaje) {
  for (Observador observador : observadores) {
      observador.actualizar(mensaje);
  }
}
  Comando slot;


    public void setCommand(Comando Comando){
slot = Comando;
    }
    public void buttonWasPressed(){
      slot.execute();
    }
    }


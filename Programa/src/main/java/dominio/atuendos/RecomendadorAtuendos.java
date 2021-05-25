package dominio.atuendos;

import servicios.clima.CondicionesClimaticas;
import servicios.clima.ServicioClima;

public class RecomendadorAtuendos {

  private ServicioClima servicioClima;

  public RecomendadorAtuendos(ServicioClima servicioClima) {
    this.servicioClima = servicioClima;
  }

  // Probablemente a este metodo se le pase la lista de atuendos que tiene el usuario
  public Atuendo sugerirAtuendo() {
    CondicionesClimaticas condicionesClimaticas = this.servicioClima.obtenerCondicionesClimaticas();
    // Manejar condiciones climaticas para obtener un atuendo acorde
    return null;
  }


}

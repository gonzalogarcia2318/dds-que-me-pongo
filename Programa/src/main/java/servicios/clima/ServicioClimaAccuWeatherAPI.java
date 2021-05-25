package servicios.clima;

import java.util.List;
import java.util.Map;

public class ServicioClimaAccuWeatherAPI implements ServicioClima {

  private AccuWeatherAPI accuWeatherAPI;
  private String ciudad;

  // Inyecto dependecia de accu weather para poder testar con mocks
  public ServicioClimaAccuWeatherAPI(String ciudad, AccuWeatherAPI accuWeatherAPI) {
    this.ciudad = ciudad;
    this.accuWeatherAPI = accuWeatherAPI;
  }


  public CondicionesClimaticas obtenerCondicionesClimaticas() {
    List<Map<String, Object>> response = accuWeatherAPI.getWeather(this.ciudad);
    return this.parseAccuWeatherDataToCondicionesClimaticas(response);
  }

  private CondicionesClimaticas parseAccuWeatherDataToCondicionesClimaticas(List<Map<String, Object>> data) {
    CondicionesClimaticas condicionesClimaticas = new CondicionesClimaticas();
    // PARSE DATA
    return condicionesClimaticas;
  }
}

package servicios.clima;

import java.math.BigDecimal;
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
    //
    condicionesClimaticas.setTemperatura(
        fahrenheitToDegrees((Integer) ((Map<String, Object>) data.get(0).get("Temperature")).get("Value"))
    );
    condicionesClimaticas.setProbabilidadLluvia(BigDecimal.valueOf((Integer) data.get(0).get("PrecipitationProbability")));
    //
    return condicionesClimaticas;
  }

  private BigDecimal fahrenheitToDegrees(Integer fahrenheit) {
    return BigDecimal.valueOf((fahrenheit - 32) * 5 / 9f);
  }
}

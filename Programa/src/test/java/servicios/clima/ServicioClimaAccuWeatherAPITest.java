package servicios.clima;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicioClimaAccuWeatherAPITest {

  ServicioClimaAccuWeatherAPI servicioClimaAccuWeatherAPI;
  AccuWeatherAPI accuWeatherAPIMock;

  @BeforeEach
  public void setUp() {
    this.accuWeatherAPIMock = Mockito.mock(AccuWeatherAPI.class);
    this.servicioClimaAccuWeatherAPI = new ServicioClimaAccuWeatherAPI("Bs As", accuWeatherAPIMock);
  }

  @Test
  public void obtenerClimaComoCondicionesClimaticasCon20Grados() {
    List<Map<String, Object>> response = Arrays.asList(new HashMap<String, Object>() {{
      put("PrecipitationProbability", 0);
      put("Temperature", new HashMap<String, Object>() {{
        put("Value", 59); // 59 F = 15 C
        put("Unit", "F");
      }});
    }});
    Mockito.when(accuWeatherAPIMock.getWeather("Bs As")).thenReturn(response);
    //
    CondicionesClimaticas condicionesClimaticas = servicioClimaAccuWeatherAPI.obtenerCondicionesClimaticas();
    //
    Mockito.verify(accuWeatherAPIMock, Mockito.only()).getWeather("Bs As");
    assertEquals(BigDecimal.valueOf(15f), condicionesClimaticas.getTemperatura());
    assertEquals(BigDecimal.ZERO, condicionesClimaticas.getProbabilidadLluvia());
  }

  @Test
  public void obtenerClimaComoCondicionesClimaticasCon30ProbabilidadLluvia() {
    List<Map<String, Object>> response = Arrays.asList(new HashMap<String, Object>() {{
      put("PrecipitationProbability", 30);
      put("Temperature", new HashMap<String, Object>() {{
        put("Value", 59); // 59 F = 15 C
        put("Unit", "F");
      }});
    }});
    Mockito.when(accuWeatherAPIMock.getWeather("Bs As")).thenReturn(response);
    //
    CondicionesClimaticas condicionesClimaticas = servicioClimaAccuWeatherAPI.obtenerCondicionesClimaticas();
    //
    Mockito.verify(accuWeatherAPIMock, Mockito.only()).getWeather("Bs As");
    assertEquals(BigDecimal.valueOf(30), condicionesClimaticas.getProbabilidadLluvia());
  }

}

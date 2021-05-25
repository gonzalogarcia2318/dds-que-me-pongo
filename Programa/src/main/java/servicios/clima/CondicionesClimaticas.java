package servicios.clima;

import java.math.BigDecimal;

public class CondicionesClimaticas {

  private BigDecimal temperaturaMin;
  private BigDecimal temperaturaMax;
  private BigDecimal humedad;
  private BigDecimal probabilidadLluvia;

  public CondicionesClimaticas(){

  }

  public CondicionesClimaticas(BigDecimal temperaturaMin, BigDecimal temperaturaMax, BigDecimal humedad, BigDecimal probabilidadLluvia) {
    this.temperaturaMin = temperaturaMin;
    this.temperaturaMax = temperaturaMax;
    this.humedad = humedad;
    this.probabilidadLluvia = probabilidadLluvia;
  }

  public BigDecimal getTemperaturaMin() {
    return temperaturaMin;
  }

  public void setTemperaturaMin(BigDecimal temperaturaMin) {
    this.temperaturaMin = temperaturaMin;
  }

  public BigDecimal getTemperaturaMax() {
    return temperaturaMax;
  }

  public void setTemperaturaMax(BigDecimal temperaturaMax) {
    this.temperaturaMax = temperaturaMax;
  }

  public BigDecimal getHumedad() {
    return humedad;
  }

  public void setHumedad(BigDecimal humedad) {
    this.humedad = humedad;
  }

  public BigDecimal getProbabilidadLluvia() {
    return probabilidadLluvia;
  }

  public void setProbabilidadLluvia(BigDecimal probabilidadLluvia) {
    this.probabilidadLluvia = probabilidadLluvia;
  }
}

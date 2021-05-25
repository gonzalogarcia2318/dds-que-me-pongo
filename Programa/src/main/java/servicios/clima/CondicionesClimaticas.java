package servicios.clima;

import java.math.BigDecimal;

public class CondicionesClimaticas {

  private BigDecimal temperatura;
  private BigDecimal probabilidadLluvia;

  public CondicionesClimaticas() {

  }

  public CondicionesClimaticas(BigDecimal temperatura, BigDecimal probabilidadLluvia) {
    this.temperatura = temperatura;
    this.probabilidadLluvia = probabilidadLluvia;
  }

  public BigDecimal getTemperatura() {
    return temperatura;
  }

  public void setTemperatura(BigDecimal temperatura) {
    this.temperatura = temperatura;
  }

  public BigDecimal getProbabilidadLluvia() {
    return probabilidadLluvia;
  }

  public void setProbabilidadLluvia(BigDecimal probabilidadLluvia) {
    this.probabilidadLluvia = probabilidadLluvia;
  }
}

package dominio.prendas;

import dominio.prendas.materiales.Material;
import dominio.utils.Color;

import java.math.BigDecimal;
import java.util.Objects;

public class BorradorPrenda {
  private TipoPrenda tipoPrenda;
  private Material material;
  private Color color;
  private Color colorSecundario;

  private BigDecimal temperaturaMaxima;

  public BorradorPrenda(){
  }

  public BorradorPrenda especificarTipoPrenda(TipoPrenda tipoPrenda){
    this.tipoPrenda = Objects.requireNonNull(tipoPrenda);
    return this;
  }

  public BorradorPrenda especificarMaterial(Material material){
    this.material = Objects.requireNonNull(material);;
    return this;
  }

  public BorradorPrenda especificarColor(Color color){
    this.color = Objects.requireNonNull(color);
    return this;
  }

  public BorradorPrenda especificarColorSecundario(Color colorSecundario){
    this.colorSecundario = Objects.requireNonNull(colorSecundario);
    return this;
  }

  public BorradorPrenda especificarTemperaturaMaxima(BigDecimal temperaturaMaxima){
    this.temperaturaMaxima = Objects.requireNonNull(temperaturaMaxima);
    return this;
  }

  public Prenda crearPrenda(){
    return new Prenda(this.tipoPrenda, this.material, this.color, this.colorSecundario, this.temperaturaMaxima);
  }
}

package dominio.prendas;

import dominio.prendas.materiales.Material;
import dominio.utils.Color;

import java.math.BigDecimal;
import java.util.Objects;

public class Prenda {
  private TipoPrenda tipoPrenda;
  private Material material;
  private Color color;
  private Color colorSecundario;

  private BigDecimal temperaturaMaxima;

  public Prenda(TipoPrenda tipoPrenda, Material material, Color color, Color colorSecundario, BigDecimal temperaturaMaxima) {
    this.tipoPrenda = Objects.requireNonNull(tipoPrenda);
    this.material = Objects.requireNonNull(material);
    this.color = Objects.requireNonNull(color);
    this.colorSecundario = colorSecundario;
    this.temperaturaMaxima = temperaturaMaxima;
  }
}
package dominio.uniformes;

import dominio.prendas.BorradorPrenda;
import dominio.prendas.Categoria;
import dominio.prendas.Prenda;
import dominio.prendas.TipoPrenda;
import dominio.prendas.materiales.Material;
import dominio.prendas.materiales.TipoMaterial;
import dominio.prendas.materiales.Trama;
import dominio.utils.Color;

public class SastreJohnson extends Sastre {

// Camisa blanca, pantalón de vestir negro y zapatos negros

  protected Prenda fabricarParteSuperior() {
    return new BorradorPrenda()
        .especificarTipoPrenda(new TipoPrenda("Camisa", Categoria.PARTE_SUPERIOR))
        .especificarColor(new Color(255, 255, 255))
        .especificarMaterial(new Material(TipoMaterial.ALGODON, Trama.LISA))
        .crearPrenda();
  }

  protected Prenda fabricarParteInferior() {
    return new BorradorPrenda()
        .especificarTipoPrenda(new TipoPrenda("Pantalon", Categoria.PARTE_INFERIOR))
        .especificarColor(new Color(0, 0, 0))
        .especificarMaterial(new Material(TipoMaterial.ACETATO, Trama.LISA))
        .crearPrenda();
  }

  protected Prenda fabricarCalzado() {
    return new BorradorPrenda()
        .especificarTipoPrenda(new TipoPrenda("Zapatos", Categoria.CALZADO))
        .especificarColor(new Color(0, 0, 0))
        .especificarMaterial(new Material(TipoMaterial.TELA, Trama.LISA))
        .crearPrenda();
  }
}

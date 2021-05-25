package dominio.uniformes;

import dominio.prendas.BorradorPrenda;
import dominio.prendas.Categoria;
import dominio.prendas.Prenda;
import dominio.prendas.TipoPrenda;
import dominio.prendas.materiales.Material;
import dominio.prendas.materiales.TipoMaterial;
import dominio.prendas.materiales.Trama;
import dominio.utils.Color;

public class SastreSanJuan extends Sastre {

// Chomba verde de piqué, un pantalón de acetato gris y zapatillas blancas

  protected Prenda fabricarParteSuperior() {
    return new BorradorPrenda()
        .especificarTipoPrenda(new TipoPrenda("Chomba", Categoria.PARTE_SUPERIOR))
        .especificarColor(new Color(27, 140, 51))
        .especificarMaterial(new Material(TipoMaterial.PIQUE, Trama.LISA))
        .crearPrenda();
  }

  protected Prenda fabricarParteInferior() {
    return new BorradorPrenda()
        .especificarTipoPrenda(new TipoPrenda("Pantalon", Categoria.PARTE_INFERIOR))
        .especificarColor(new Color(124, 130, 125))
        .especificarMaterial(new Material(TipoMaterial.ACETATO, Trama.LISA))
        .crearPrenda();
  }

  protected Prenda fabricarCalzado() {
    return new BorradorPrenda()
        .especificarTipoPrenda(new TipoPrenda("Zapatillas", Categoria.CALZADO))
        .especificarColor(new Color(255, 255, 255))
        .especificarMaterial(new Material(TipoMaterial.TELA, Trama.LISA))
        .crearPrenda();
  }
}

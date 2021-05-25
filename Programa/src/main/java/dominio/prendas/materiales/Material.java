package dominio.prendas.materiales;

public class Material {

  private TipoMaterial tipoMaterial;
  private Trama trama;

  public Material(TipoMaterial tipoMaterial, Trama trama) {
    this.tipoMaterial = tipoMaterial;
    this.trama = trama;
  }
}

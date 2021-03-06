package dominio.atuendos;

import dominio.prendas.Prenda;

import java.util.List;

public class Atuendo {

  private Prenda parteSuperior;
  private Prenda parteInferior;
  private Prenda calzado;
  private List<Prenda> accesorios;

  public Atuendo(Prenda parteSuperior, Prenda parteInferior, Prenda calzado, List<Prenda> accesorios) {
    this.parteSuperior = parteSuperior;
    this.parteInferior = parteInferior;
    this.calzado = calzado;
    this.accesorios = accesorios;
  }
}

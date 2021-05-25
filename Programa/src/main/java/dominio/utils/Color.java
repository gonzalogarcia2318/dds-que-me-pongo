package dominio.utils;

public class Color {

  private int r;
  private int g;
  private int b;

  public Color(int r, int g, int b) {
    this.r = r;
    this.g = g;
    this.b = b;
  }

  public String getColorAsString(){
    return "rgb(" + this.r + " ," + this.g + " ," + this.b + ")";
  }
}

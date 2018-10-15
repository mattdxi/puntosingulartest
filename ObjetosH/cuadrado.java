public class cuadrado {
  public double L;
  public cuadrado(double l){
    this.L = l;
  }

  public double calcularArea(){
    return (this.L * this.L);
  }
  public double calcularPerimetro(){
    return (this.L * 4);
  }
  public void setLado(double l){
    this.L = l;
  }
}

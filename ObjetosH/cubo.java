public class cubo extends cuadrado {
  public double L;
  public cubo(double l){
    super(l);
    this.L = l;
  }
  public double calcularVolumen(){
    return (super.calcularArea() * this.L);
  }
  public double calcularPerimetro(){
    return (super.calcularPerimetro() * 3);
  }
  public void setLado(double l){
    this.L = l;
    super.setLado(l);
  }
}

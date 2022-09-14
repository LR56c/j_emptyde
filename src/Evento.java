public class Evento
{
  private TipoEmpresa tipo;

  public Evento( TipoEmpresa tipo )
  {
    this.tipo = tipo;
  }

  public TipoEmpresa getTipo()
  {
    return tipo;
  }

  public void setTipo( TipoEmpresa tipo )
  {
    this.tipo = tipo;
  }

  @Override
  public String toString()
  {
    return "Evento{" +
      "tipo=" + tipo +
      '}';
  }
}

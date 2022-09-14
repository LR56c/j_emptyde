public class TipoEmpresa
{
  private String descripcion;

  public TipoEmpresa( String descripcion )
  {
    this.descripcion = descripcion;
  }

  public String getDescripcion()
  {
    return descripcion;
  }

  public void setDescripcion( String descripcion )
  {
    this.descripcion = descripcion;
  }

  @Override
  public String toString()
  {
    return "TipoEmpresa{" +
      "descripcion='" + descripcion + '\'' +
      '}';
  }
}

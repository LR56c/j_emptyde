public class Main
{
  public static void main( String[] args )
  {


    Empresa empresa = new Empresa();

    Evento e1 = new Evento( new TipoEmpresa( "Tipo 1" ) );
    Evento e2 = new Evento( new TipoEmpresa( "Tipo 1" ) );
    Evento e3 = new Evento( new TipoEmpresa( "Tipo 3" ) );
    Evento e4 = new Evento( new TipoEmpresa( "Tipo 2" ) );

    empresa.addEvento( e1 );
    empresa.addEvento( e2 );
    empresa.addEvento( e3 );
    empresa.addEvento( e4 );

    empresa.filterMax();
  }
}

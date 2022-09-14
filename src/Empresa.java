import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Empresa
{
  private ArrayList<Evento> tipos = new ArrayList<>();

  public void addEvento( Evento tipo )
  {
    tipos.add( tipo );
  }

  public void filterMax()
  {
    Comparator<TipoEmpresa> comparator = Comparator.comparing( TipoEmpresa::getDescripcion );

    // filter max repeated type of tipos
    tipos.stream()
      .map( Evento::getTipo )
      .collect( Collectors.groupingBy( Function.identity(), Collectors.counting() ) )
      .entrySet()
      .stream()
      .max( Map.Entry.comparingByValue() )
      .ifPresent( e -> System.out.println( e.getKey() ) );

  }

}

import java.util.ArrayList;
import java.util.Iterator;

public class Principal{
    public static void main(String[] args){
            ArrayList<Pessoa> listaEstados = new ArrayList<Pessoa>();

            listaEstados.add(new Pessoa("Rogerio",19));
            listaEstados.add(new Pessoa("Yasmim",27));
            listaEstados.add(new Pessoa("Carol",38));
            listaEstados.add(new Pessoa("Rodrigo",29));

            Iterator i = listaEstados.iterator();

            while (i.hasNext()) {
                String estado = i.next().toString();
                System.out.println(estado);
            }

            System.out.println("*** " + listaEstados.get(2) + "***");
    }
}
package arreglos;
import arreglos.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JhonFx
 */
public class Dato {

    List<Cliente> lista = new ArrayList<Cliente>();

    public void agregar(Cliente ent){
        lista.add(ent);
    }

    public void listar(){
        for(Cliente ent:lista){
            System.out.println(ent.getCodigo() + " " + ent.getNombre() + " " + ent.getApellido() +
                    " " + ent.getSueldo());
        }
    }

    public void actualizar(Cliente ent){
        int c = 0;
        for(Cliente ent1:lista){
            if(ent1.getCodigo().equals(ent.getCodigo())){
                lista.set(c, ent);
                return;
            }
            c++;
        }
    }

    public void eliminar(Cliente ent){
        int c = 0;
        for(Cliente ent1:lista){
            if(ent1.getCodigo().equals(ent.getCodigo())){
                lista.remove(c);
                return;
            }
            c++;
        }
    }
    public static void main(String a []){
        Dato d = new Dato();
        Cliente ent = null;

        //Agregando datos

        ent = new Cliente();
        ent.setCodigo("8171027");
        ent.setNombre("JhonFx");
        ent.setApellido("Mitnick");
        ent.setSueldo(40000);
        d.agregar(ent);

        //Otra forma de agregar datos

        d.agregar(new Cliente("9171022","Maleni","Pena",30000));
        d.agregar(new Cliente("8171001","Oscar Rodrigo","Aguinaga",30000));
        d.agregar(new Cliente("8171002","Rodrigo David","Raya",30000));
        //Listar datos
        System.out.println("Lista 1");
        d.listar();
        
        d.actualizar(new Cliente("8171002","Rodrigo David","Raya Islas",35000));
        d.eliminar(new Cliente("8171001","","",50000));
        System.out.println("Lista 2");
        d.listar();

    }
}

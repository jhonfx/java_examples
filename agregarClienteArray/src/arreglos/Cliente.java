package arreglos;

/**
 *
 * @author JhonFx
 */
public class Cliente {

    private String codigo;
    private String nombre;
    private String apellido;
    private double sueldo;

    public Cliente(){

    }

    public Cliente(String c, String n, String ap, double s){
        codigo = c;
        nombre = n;
        apellido = ap;
        sueldo = s;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public Double getSueldo(){
        return sueldo;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
}

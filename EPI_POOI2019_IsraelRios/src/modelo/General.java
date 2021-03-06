/*
Nombres: Israel Rios Contreras
Carrera: Ingenieria en informatica
Cuatrimestre: 5
Grupo:B
Evidencia: Integradora
EPI_POO2019_IsraelRios.
*/
package modelo;

/**
 *
 * @author israel
 */
public class General extends Empleado implements Descuento
{
    String Departamento;

    public General(String Departamento, String tipoUsuario, String nombre, String apellidoP, String apellidoM, String telefono)
    {
        super(tipoUsuario, nombre, apellidoP, apellidoM, telefono);
        this.Departamento = Departamento;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    @Override//Metodo sobre escrito
    public void multa(double deuda)
    {
        multa=deuda+15;
        deuda=0;
    }

    @Override//Metodo de interfaz
    public void descuento(double deuda) 
    {
        deuda=deuda-15;
        setDeuda(deuda); 
    }

    @Override
    public String toString() {
        return "General{" + "Departamento=" + Departamento + '}';
    }
    
    
}

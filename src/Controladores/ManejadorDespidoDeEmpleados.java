package Controladores;

import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author jose_
 */
public class ManejadorDespidoDeEmpleados {

    Conexion baseDatos = new Conexion().conectar();

    String no_empleado, primer_nom, segundo_nom, apellido_pat, apellido_mat;
    int dia_nac, mes_nac, año_nac;

    public ManejadorDespidoDeEmpleados() {
    }

    public String[] getDatos() {
        String[] salida = new String[7];
        String consulta = "SELECT Primer_Nom, Segun_Nom, Apellido_P, Apellido_M, Dia_Nac, "
                + "Mes_Nac, Año_Nac FROM profesor INNER JOIN persona ON "
                + "profesor.CURP = persona.CURP where profesor.No_Profesor = '" + no_empleado + "';";
        ResultSet res = baseDatos.consultar(consulta);
        try {
            while (res.next()) {
                Vector v = new Vector();
                salida[0] = res.getString(1);
                salida[1] = res.getString(2);
                salida[2] = res.getString(3);
                salida[3] = res.getString(4);
                salida[4] = Integer.toString(res.getInt(5));
                salida[5] = Integer.toString(res.getInt(6));
                salida[6] = Integer.toString(res.getInt(7));
            }
            for (int i = 0; i < salida.length; i++) {
                System.out.println(salida[i] + "\n");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }

        return salida;
    }

    public boolean despedir() {
        String sentenciaEmp = "";

        sentenciaEmp = "DELETE a1, a2 FROM profesor AS a1 INNER JOIN persona AS a2 "
                + "WHERE a1.CURP = a2.CURP AND a1.No_Profesor LIKE "
                + "'" + no_empleado + "';";

        baseDatos.ejecutar(sentenciaEmp);
        return true;
    }

    public String getNo_empleado() {
        return no_empleado;
    }

    public void setNo_empleado(String no_empleado) {
        this.no_empleado = no_empleado;
    }

}

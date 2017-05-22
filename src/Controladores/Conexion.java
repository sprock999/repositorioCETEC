package Controladores;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conexion {

    private Connection conexion;

    public Conexion conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String BaseDeDatos = "jdbc:mysql://localhost:3306/cetec";

            conexion = DriverManager.getConnection(BaseDeDatos, "root", "sprock999");
            if (conexion != null) {
                System.out.println("Conexion exitosa!");
            } else {
                System.out.println("Conexion fallida!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    public boolean ejecutar(String sql) {
        try {
            Statement sentencia;
            sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            sentencia.executeUpdate(sql);
            sentencia.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public ResultSet consultar(String sql) {
        ResultSet resultado = null;
        try {
            Statement sentencia;
            sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return resultado;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    public void cerrarConexion(){
        try {
            this.conexion.close();
            System.out.println("conexion cerrada");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public static void main(String[] args) {
//        Conexion baseDatos = new Conexion().conectar();
//        try{
//            baseDatos.ejecutar("insert into horario values(4,'10:00','12:00',1,50,0,1)");
//            ResultSet datos = baseDatos.consultar("select no_horario from horario");
//            if(datos != null){
//                datos.next();
//                System.out.println(datos.getInt(1));
//            }else{
//                System.out.println("vacio");
//            }
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//        if (baseDatos.ejecutar("INSERT INTO horario VALUES(4,'10:00','12:00',1,50,0,1)")) {
//            System.out.println("Ejecucion correcta!");
//        } else {
//            System.out.println("Ocurrió un problema al ejecutar!");
//        }
//        ResultSet resultados = baseDatos.consultar("SELECT no_horario from horario");
//        if (resultados != null) {
//            try {
//                System.out.println("IDENTIFICADOR       DESCRIPCION");
//                System.out.println("--------------------------------");
//                while (resultados.next()) {
//                    //System.out.println("" + resultados.getBigDecimal("IDENTIFICADOR") + "       " + resultados.getString("DESCRIPCION"));
//                    System.out.println(resultados.getString(1));
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        baseDatos.cerrarConexion();
//    }
}
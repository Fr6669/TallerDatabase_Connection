package com.ecodeup.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connection.Conexion;
import com.ecodeup.idao.IClienteDao;
import com.ecodeup.model.Cliente;
import com.ecodeup.model.Opinion;

public class ClienteDaoImpl implements IClienteDao {

    @Override
    public boolean registrar(Cliente cliente) {
        boolean registrar = false;

        Statement stm = null;
        Connection con = null;

        String sql = "INSERT INTO usuario values ('" + cliente.getNombre() + "','" + cliente.getCedula() + "')";

        try {
            con = Conexion.conectar();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método registrar");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public List<Cliente> obtener() {
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM USUARIO ORDER BY CEDULA";

        List<Cliente> listaCliente = new ArrayList<Cliente>();

        try {
            co = Conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setNombre(rs.getString(1));
                c.setCedula(rs.getString(2));
                listaCliente.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método obtener");
            e.printStackTrace();
        }

        return listaCliente;
    }

    @Override
    public boolean actualizar(String nombre, int cedula) {
        Connection connect = null;
        Statement stm = null;

        boolean actualizar = false;

        String sql = "UPDATE USUARIO SET nombre='" + nombre + "'" + " WHERE CEDULA=" + cedula;
        try {
            connect = Conexion.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImpl, método actualizar");
            e.printStackTrace();
        }
        return actualizar;
    }

    @Override
    public boolean eliminar(Cliente cliente) {
        Connection connect = null;
        Statement stm = null;

        boolean eliminar = false;

        String sql = "DELETE FROM USUARIO WHERE CEDULA=" + cliente.getCedula();
        try {
            connect = Conexion.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImpl, método eliminar");
            e.printStackTrace();
        }
        return eliminar;
    }

    @Override
    public boolean registarPQRS(Opinion opinion) {
        boolean registrar = false;
        String sql=null;
        Statement stm = null;
        Connection con = null;
        int a= opinion.getX();
        System.out.println(a);
        switch (a) {
            case 1:
                sql = "INSERT INTO peticion values ('" + opinion.getOp() + "','" + opinion.getCedula() + "')";
                break;
            case 2:
                sql = "INSERT INTO queja values ('" + opinion.getOp() + "','" + opinion.getCedula() + "')";
                break;
            case 3:
                sql = "INSERT INTO reclamo values ('" + opinion.getOp() + "','" + opinion.getCedula() + "')";
                break;
            case 4:
                sql = "INSERT INTO sugerencia values ('" + opinion.getOp() + "','" + opinion.getCedula() + "')";
                break;
        }

        try {
            con = Conexion.conectar();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método registrarPQRS");
            e.printStackTrace();
        }
        return registrar;
    }

}

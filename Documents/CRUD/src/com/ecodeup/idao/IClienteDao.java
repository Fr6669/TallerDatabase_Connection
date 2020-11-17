package com.ecodeup.idao;

import java.util.List;

import com.ecodeup.model.Cliente;
import com.ecodeup.model.Opinion;

public interface IClienteDao {
    
    public boolean registarPQRS(Opinion opinion);
     
    public boolean registrar(Cliente cliente);

    public List<Cliente> obtener();

    public boolean actualizar(String nombre, int cedula);

    public boolean eliminar(Cliente cliente);
    
}

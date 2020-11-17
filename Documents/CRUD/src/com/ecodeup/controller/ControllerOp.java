/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecodeup.controller;

import com.ecodeup.dao.ClienteDaoImpl;
import com.ecodeup.idao.IClienteDao;
import com.ecodeup.model.Opinion;

/**
 *
 * @author Frank Rojas
 */
public class ControllerOp {

    public ControllerOp() {
    }
    //llama al DAO para guardar un cliente
    public void registrarPQRS(Opinion opinion) {
        IClienteDao dao = new ClienteDaoImpl();
        dao.registarPQRS(opinion);
    }
}

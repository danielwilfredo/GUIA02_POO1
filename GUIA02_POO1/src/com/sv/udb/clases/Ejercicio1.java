/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

/**
 *
 * @author DanielWilfredo
 */
public class Ejercicio1 {
    
    private int numeBase;
    private int numePote;

    public int getNumeBase() {
        return numeBase;
    }

    public void setNumeBase(int numeBase) {
        this.numeBase = numeBase;
    }

    public int getNumePote() {
        return numePote;
    }

    public void setNumePote(int numePote) {
        this.numePote = numePote;
    }
    public int getResultado()
    {
        int resp=1;
        try {
            if (numePote==0)
            {
                return 1;
            }
            for(int i=1; i<=numePote; i++)
            {
                resp = this.multi(resp, numeBase);
            }
            
        } catch (Exception e) {
            System.out.println("Error en el ejercicio 1: "+ e.getMessage());
        }
        return resp;
    }
    private int multi(int num1, int num2)
    {
        int resp=0;
        for(int i=0; i<num1; i++)
        {
            resp+=num2;
        }
        return resp;
    }
    
}

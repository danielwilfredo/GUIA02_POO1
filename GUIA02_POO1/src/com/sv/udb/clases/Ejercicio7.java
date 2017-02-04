/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DanielWilfredo
 */
public class Ejercicio7 {
    
        
    public List<Datos> getData()
    {
        List<Datos> resp = null;
        try
        {
            String csvFile = "com/sv/udb/files/datos.csv";
            File file = new File(ClassLoader.getSystemResource(csvFile).getFile());
            String line = "";
            String simb = ",";
            if(file.exists())
            {
                resp = new ArrayList<>();
                BufferedReader br = new BufferedReader(new FileReader(file));
                while ((line = br.readLine()) != null)
                {
                    String[] nota = line.split(simb);
                    Datos objeTemp = new Datos();
                    objeTemp.setTitu(nota[0]);
                    objeTemp.setDesc(nota[1]);
                    objeTemp.setFech(nota[2]);
                    resp.add(objeTemp);
                    
                    //resp.add(new Notas(nota[0], nota[1], nota[2]));
                }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return resp;
    } 
}

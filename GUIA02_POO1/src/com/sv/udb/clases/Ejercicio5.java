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
public class Ejercicio5 {
   private String cade;
   private double resu;
   private boolean suma;
   private boolean rest;
   private boolean mult;
   private boolean divi;
   
  public Ejercicio5(){
  cade="";
  suma=false;
  rest=false;
  mult=false;
  divi=false;
    }
  public String Concatenar(String cade){
   this.cade = this.cade+cade;
      return this.cade;
  }
  public void suma(String cade)
  {
      this.resu=Double.parseDouble(cade);
      suma=true;
      this.cade="";
      
  }
  public void resta(String cade)
  {
      this.resu=Double.parseDouble(cade);
      rest=true;
      this.cade ="";
  }
  public void multiplicacion(String cade)
  {
      this.resu=Double.parseDouble(cade);
      mult=true;
      this.cade="";
  }
  public void division(String cade)
  {
      this.resu=Double.parseDouble(cade);
      divi=true;
      this.cade="";
  }
  public double resultado(String nume)
  {
      if (suma==true)
      {
          System.out.println("dentro de suma");
          resu=(resu + (Double.parseDouble(nume)));
      }
      else if(rest==true)
      {
          System.out.println("dentro de resta");
          resu=(resu - (Double.parseDouble(nume)));
      }
      else if(mult==true)
      {
          System.out.println("dentro de multi");
          resu = (resu * (Double.parseDouble(nume)));
      }
      else if(divi==true)
      {
          System.out.println("dentro de division");
          resu= (resu / (Double.parseDouble(nume)));
      }
      return resu;
  }
  public String Limpiar()
  {
      this.cade = "";
      return cade;
  }
    
}

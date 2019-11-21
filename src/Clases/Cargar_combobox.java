/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JComboBox;

/**
 *
 * @author jordi
 */
public class Cargar_combobox {
    conector metodos =new conector();
    public void consultar_cod(JComboBox cbox_cod){
     //coneccion
        java.sql.Connection conectar = null;
      //consulta sql
      String SQL = "SELECT mp FROM cod ORDER BY mp ASC ";
      
      try{
      }
      catch(Exception e){
          
      }
    }
}

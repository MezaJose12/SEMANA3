/***********************************************************************
 * Module:  Usuario.java
 * Author:  JOSE
 * Purpose: Defines the Class Usuario
 ***********************************************************************/

import java.util.*;

public class Usuario {
   private String nombre1;
   private String nombre2;
   private String apellido;
   private String idPersona;
   
   public String getNombre1() {
      return nombre1;
   }
   
   public void setNombre1(String newNombre1) {
      nombre1 = newNombre1;
   }

   public String getNombre2() {
         return nombre2;
      }
      
   public void setNombre2(String newNombre2) {
         nombre2 = newNombre2;
      }
   
   public String getApellido() {
      return apellido;
   }
   
   public void setApellido(String newApellido) {
      apellido = newApellido;
   }
   
   public String getIdPersona() {
      return idPersona;
   }
   
   public void setIdPersona(String newIdPersona) {
      idPersona = newIdPersona;
   }
   
   public Usuario() {
      
   }

}
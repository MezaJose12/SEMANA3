/***********************************************************************
 * Module:  Usuario.java
 * Author:  JOSE
 * Purpose: Defines the Class Usuario
 ***********************************************************************/

import java.util.*;

/** @pdOid 96fa5be9-171c-4257-a57f-af38e3aff117 */
public class Usuario {
   /** @pdOid ab22d43a-befc-4f1c-b470-489beb5869f1 */
   private String nombre;
   /** @pdOid bd6a08d6-04fd-48c7-9d0e-1df760326789 */
   private String apellido;
   /** @pdOid a9141559-558f-48d8-8476-c26c5887bd08 */
   private String idPersona;
   
   /** @pdOid 790e4fa6-81a4-4c16-8bc8-688e682a9eb4 */
   public String getNombre() {
      return nombre;
   }
   
   /** @param newNombre
    * @pdOid 44ac5044-eba5-4359-b654-1ba700dde632 */
   public void setNombre(String newNombre) {
      nombre = newNombre;
   }
   
   /** @pdOid 43bd70ea-1f08-4f8d-b789-0224a152f74d */
   public String getApellido() {
      return apellido;
   }
   
   /** @param newApellido
    * @pdOid 910fc6dc-3eb8-44c1-8c55-d1ac972f6975 */
   public void setApellido(String newApellido) {
      apellido = newApellido;
   }
   
   /** @pdOid 5caaf079-037d-429e-8c2d-720ee566f5a7 */
   public String getIdPersona() {
      return idPersona;
   }
   
   /** @param newIdPersona
    * @pdOid 57082adf-82f4-481f-bf14-bf3dac743eaa */
   public void setIdPersona(String newIdPersona) {
      idPersona = newIdPersona;
   }
   
   /** @pdOid 2dadc7ca-4386-4f6d-a9e3-7f809cca6359 */
   public Usuario() {
      // TODO: implement
   }

}
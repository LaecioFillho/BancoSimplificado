package ConnectionBD;

import java.sql.Date;
import java.sql.PreparedStatement; 

public class DAO {

      public void registrationUsers(String name, String email, String password){

      String sql = "INSERT INTO USUARIO (nome, nascimento, senha) VALUES (?,?,?,?)";
      PreparedStatement ps = null;
      ConectionSQL conection = new ConectionSQL();

      try {
          if(ps == null){
              ps = conection.getConectando().prepareStatement(sql);
              ps.setString(1, name);
              ps.setString(2, email);
              //ps.setString(3, birth.toString());
              ps.setString(3, password);
              
              ps.execute();
              ps.close();
          }
      } catch (Exception e) {
          System.out.println("Não foi possivel salvar dados!");
          e.printStackTrace();
      }
  }  
}

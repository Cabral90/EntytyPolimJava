package base;

import base.backup.*;
import base.entidades.Funcionario;
import base.entidades.Pessoal;

public class main {

    public static void main(String[] args) {
        // TODO code application logic here
        //Pessoal pessoal = new Pessoal();
   Pessoal pessoal = new Pessoal("Hose", "hhh", "25");
   
        //Send send = new Send();
        //send.pruebaEnvio();
       
   
   //Funcionario(String numAgente, String iniFuncao String nome, String apelido, String edade)
        Funcionario funcionario = new Funcionario("Jose", "Antonio", "29", "0445","23/02/2016");
        
        
//        Zip_Folder zip = new Zip_Folder();
//        
//        Unzip_File_Folder unzip = new Unzip_File_Folder();
//        
//       // zip.convertirZIP();
//        
//        unzip.extarArcZip();
//        
        

//        pessoal.setNome("Jose");
//        pessoal.setApelido("Cabral");
//        pessoal.setEdade("23");

        System.out.println(pessoal.toString());
        System.out.println(funcionario.toString());
    }

}

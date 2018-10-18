import java.io.*;
 
 public class CaseLogin{
     public static void main(String[] args) throws IOException{

         BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));
             String nim = "";
             String pass= "";
             Boolean status = true;
            do{
                System.out.print("Masukan ID.User : ");
                nim = dataInput.readLine();

                System.out.println("Masukan Password : ");
                pass = dataInput.readLine();


                if(!nim.equals("171530014")){
                    System.out.println("ID. User Salah");
                }else{
                    if(!pass.equals("mahasiswa123")){
                        System.out.println("Password Salah");
                    }else{
                        status = false;
                    }
                }
            }while(status);
                 System.out.println("Selamat Datang " + nim);


     }


 }






         
         
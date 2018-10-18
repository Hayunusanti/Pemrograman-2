public class DemoArray2 {

    public static void main(String args[]){
        //Contoh program pencarian

        String names[] = {"Adi", "Aji", "Hayun", "Abdul", "Hasif"};
        String searchName = "Hayun";
        boolean foundName = false;
        for( int i=0; i<names.length; i++ ){ //i<panjang array names
            if( names[i].equals( searchName )){ //jika nilai aray names ke i 
                        //pakai equals akan casesnsitive biar tidak pakai equalsIgnoreCase
                foundName = true;
                break;
            }
        }
        if( foundName ){ //jka foundname true maka akan output yang baris 16
            System.out.println( searchName + " found! " );
        }else{
            System.out.println( searchName + " not found. " );
        }
    }
}
package getFile;

import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.Scanner;

public class Application {
    public static void main(String []args ) {
//        for(int i = 0; i <= 3; i++){
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter Some Text");
//            String entered = input.nextLine();
//            System.out.println(" You enterd " + entered);
//        }
        try {
            File file = new File("getFile/myfile.txt");
            Scanner input = null;
            input = new Scanner(file);
            while(input.hasNextLine()){
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
//            e.printStackTrace();
        }

        try{
            myFileUtil myfile = new myFileUtil();
            System.out.println( myfile.subtract10FromLargNumber(7));
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}

package getFile;

import getFile.exceptions.fooRunTimeExceptions;

import java.util.concurrent.ExecutionException;

public class myFileUtil {

    public int subtract10FromLargNumber(int number) throws fooRunTimeExceptions.FooRuntimeExceptions {
     if (number < 10){
         throw new fooRunTimeExceptions.FooRuntimeExceptions("The Number is less than 10!!");
     }
        return number -10;
    }



}

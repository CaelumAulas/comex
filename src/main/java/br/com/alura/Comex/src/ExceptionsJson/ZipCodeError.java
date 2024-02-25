package org.example.OutraParte.src.ExceptionsJson;

public class ZipCodeError extends Exception{
    private String Message;

    public ZipCodeError(String message){

        this.Message = message;
    }


    @Override
    public String getMessage() {
        return Message;
    }
}

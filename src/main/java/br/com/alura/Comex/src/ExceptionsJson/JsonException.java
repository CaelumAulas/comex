package org.example.OutraParte.src.ExceptionsJson;

public class JsonException extends Exception {
    private String Message = "json passed incorrectly";
    public JsonException(){
        this.Message = "json passed incorrectly";

    }
    public JsonException(String message){
        this.Message = message;

    }

    @Override
    public String getMessage() {
        return Message;
    }
}

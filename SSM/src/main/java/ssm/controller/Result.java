package ssm.controller;

import lombok.Data;

@Data
public class Result {
    private Object data;
    private String message;
    private int code;
    
    public Result( int code, Object data, String message) {
        this.data = data;
        this.message = message;
        this.code = code;
    }
}

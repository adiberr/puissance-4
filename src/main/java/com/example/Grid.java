package com.example;

public class Grid {

    public int size() {
        return 42;
    }

    public boolean isEmpty() {
        return true;
    }

    public int insertTokenInColumn(char token, int column) throws  Exception {
        if(column > 6){
            throw new Exception("EXCEPTION");
        }
        return  0;
    }
}

package com.example;

public class Grid {

    private static final int LINES = 6;
    private static final int COLUMNS = 7;

    private String[][] surface;

    public Grid(){
        this.surface = new String[Grid.COLUMNS][Grid.LINES];
    }

    public int size() {
        return 42;
    }

    public boolean isEmpty() {
        return true;
    }

    public Integer insertTokenInColumn(String token, Integer column) throws  Exception {
        validateColumnNumber(column);
        return insertIntoNextAvailableLine(token, this.surface[column]);
    }

    private void validateColumnNumber(Integer column) throws Exception {
        if(column >= Grid.COLUMNS){
            throw new Exception("EXCEPTION");
        }
    }

    private Integer insertIntoNextAvailableLine(String token, String[] column) {
        for(int i = 0; i < column.length; i++){
            if(column[i] == null){
                column[i] = token;
                return i;
            }
        }
        return null;
    }
}

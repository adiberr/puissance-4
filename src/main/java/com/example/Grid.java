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

    public boolean isAlignedTokenOf(String token, int numerOfTokens) {

        for(int i=0; i<COLUMNS;i++){
            String[] column = this.surface[i];
            if (checkAlignedTokenInColumn(token, numerOfTokens, column)) return true;
        }
        return false;
    }

    private boolean checkAlignedTokenInColumn(String token, int numerOfTokens, String[] column) {
        int count = 0;
        for(int j=0; j<LINES;j++){
            if(token.equals(column[j])){
                count++;
            }else {
                count = 0;
            }
            if (count>=numerOfTokens)
                return true;
        }
        return false;
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

    private Integer insertIntoNextAvailableLine(String token, String[] column) throws Exception {
        for(int i = 0; i < column.length; i++){
            if(column[i] == null){
                column[i] = token;
                return i;
            }
        }
        throw new Exception("colonne remplie");
    }


}

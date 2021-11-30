package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        if( isValid(start, end) )
            return generateTable(start, end);
        return null;
    }

    public Boolean isValid(int start, int end) {
        return isStartNotBiggerThanEnd(start, end) && isInRange(start) && isInRange(end);
    }

    public Boolean isInRange(int number) {
        return 0<number && number<1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public String generateTable(int start, int end) {
        String table = "";

        for (int i=start; i<=end; i++){
            //table = table + generateLine(start, i) + "\r\n";
            if (i == end)
                table = table + generateLine(start, i);
            else
                table = table + generateLine(start, i) + "\r\n";
        }
        //return table.substring(0, table.length() - 2);
        return table;
    }

    public String generateLine(int start, int row) {
        String line = "";
        for (int i=start; i<= row; i++){
            //line = line + generateSingleExpression(i, row) + "  ";
            if (i == row)
                line = line + generateSingleExpression(i, row);
            else
                line = line + generateSingleExpression(i, row) + "  ";
        }
        //return line.substring(0, line.length() - 2);
        return line;

        // 2*2=4  2*3=6
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        String expression = multiplicand + "*" + multiplier + "=" + multiplicand*multiplier;
        return expression;
        // 2*2=4
    }
}

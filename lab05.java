public class Lab05{

    public static void printGrid(char symbol, int inRow, int lines){
        for (int i = 0; i < lines; i++) {
            for(int j = 0; j < inRow; j++){
                System.out.print(symbol);

            }
                System.out.println();
        }
    }
    public static void main (String[] args) {
        printGrid('*', 10, 4);
    }
}
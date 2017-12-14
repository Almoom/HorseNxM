package ASD;

public class Main {

    public static void main(String[] args) {
	int[][] field = new int[7][8];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = 0;
                System.out.print(field[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int y = 6;
        int x = 7;
        field[y][x] = 1;
        boolean check = true;
        while (check){
            if (y-1 >= 0 && x+2 < field[y].length && field[y-1][x+2] != 1){
                y = y-1;
                x = x+2;
                field[y][x] = 1;
            }else if (y+2 < field.length && x+1 < field[y].length && field[y+2][x+1] != 1){
                y = y+2;
                x = x+1;
                field[y][x] = 1;
            }else if (y-1 >= 0 && x-2 >= 0 && field[y-1][x-2] != 1){
                y = y-1;
                x = x-2;
                field[y][x] = 1;
            }else if (y+2 < field.length && x-1 >= 0 && field[y+2][x-1] != 1){
                y = y+2;
                x = x-1;
                field[y][x] = 1;
            }else if (y-2>=0 && x-1 >=0 && field[y-2][x-1] != 1){
                y = y-2;
                x = x-1;
                field[y][x] = 1;
            }else if(y+1 < field.length && x-2 >= 0 && field[y+1][x-2] != 1){
                y = y+1;
                x = x-2;
                field[y][x] = 1;
            }else if (y+1 < field.length && x+2 < field[y].length && field[y+1][x+2] != 1){
                y = y+1;
                x = x+2;
                field[y][x] = 1;
            }else if (y-2 >= 0 && x+1 < field[y].length && field[y-2][x+1] != 1){
                y = y-2;
                x = x+1;
                field[y][x] = 1;
            }else break;
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (field[i][j] == 0){
                        check = true;
                        break;
                    }
                    else {
                        check = false;
                        break;
                    }
                }
            }
        }
    }
}

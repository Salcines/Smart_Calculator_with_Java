class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {

        int first = 0;
        int last = twoDimArray.length - 1;

        System.out.println(twoDimArray[first][0] + " " + twoDimArray[first][twoDimArray[first].length - 1]);
        System.out.println(twoDimArray[last][0] + " " + twoDimArray[last][twoDimArray[last].length - 1]);
    }
}
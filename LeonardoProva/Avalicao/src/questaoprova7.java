public class questaoprova7 {

    public static class Main {
        public static void main(String[] args) {
            double[][] matrix = {{1, 2}, {3, 4}};
            double det = determinant(matrix);
            System.out.println("Matriz A = ");
            printMatrix(matrix);
            System.out.println("Determinante de A = " + det);
        }

        public static double determinant(double[][] matrix) {
            // Verifica se a matriz é de ordem 2
            if (matrix.length != 2 || matrix[0].length != 2) {
                throw new IllegalArgumentException("A matriz deve ser de ordem 2");
            }

            // Calcula o determinante
            return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        }

        public static void printMatrix(double[][] matrix) {
            for (double[] doubles : matrix) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(doubles[j] + " ");
                }
                System.out.println();
            }
        }
    }



}

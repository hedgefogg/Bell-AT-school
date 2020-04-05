package com.company;

import java.util.Arrays;

import static java.lang.Math.random;

public class TwoDemencialMatrix implements MatrixInterface {

    protected int[][] matrix;
    protected int matrix_length, matrix_height;

    public int[][] getMatrix() {
        return matrix;
    }

    public void snake_matrix() {
        int i, d = 0, k = 0, l = 0, n = matrix[0].length, m = matrix.length;
        int[] r = new int[m * n];
        if (matrix == null)
            System.out.println("Пусто!");
        ;
        while (k < m && l < n) {
            for (i = l; i < n; ++i)
                r[d++] = matrix[k][i];
            k++;
            for (i = k; i < m; ++i)
                r[d++] = matrix[i][n - 1];
            n--;
            if (k < m)
                for (i = n - 1; i >= l; --i)
                    r[d++] = matrix[m - 1][i];
            m--;
            if (l < n)
                for (i = m - 1; i >= k; --i)
                    r[d++] = matrix[i][l];
            l++;
        }
        System.out.println(Arrays.toString(r));
    }

    public void printMatrix() {
        for (int i = 0; i < matrix_height; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public void zero_cross() {
        if (matrix_height % 2 == 0) {
            for (int i = (matrix_height / 2) - 1; i <= (matrix_height / 2); i++)
                for (int j = 0; j < matrix_length; j++)
                    matrix[i][j] = 0;
            if (matrix_length % 2 == 0)
                for (int j = matrix_length / 2 - 1; j <= matrix_length / 2; j++)
                    for (int i = 0; i < matrix_height; i++)
                        matrix[i][j] = 0;
            else
                for (int i = 0; i < matrix_height; i++)
                    matrix[i][matrix_length / 2] = 0;


        } else {
            for (int j = 0; j < matrix_length; j++)
                matrix[matrix_height / 2][j] = 0;

            if (matrix_length % 2 == 0)
                for (int j = matrix_length / 2 - 1; j < matrix_length; j++)
                    for (int i = 0; i < matrix_height; i++)
                        matrix[i][j] = 0;
            else
                for (int i = 0; i < matrix_height; i++)
                    matrix[i][matrix_length / 2] = 0;
        }
        for (int i = 0; i < matrix_height; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public TwoDemencialMatrix() {
        matrix_length = 5;
        matrix_height = 5;
        matrix = new int[matrix_height][matrix_length];
        for (int i = 0; i < matrix_height; i++) {
            for (int j = 0; j < matrix_length; j++) {
                matrix[i][j] = (int) ((random() * 20) - 10);
            }
        }
    }

    public TwoDemencialMatrix(int matrix_length, int matrix_height) {
        this.matrix_length = matrix_length;
        this.matrix_height = matrix_height;
        matrix = new int[matrix_height][matrix_length];
        for (int i = 0; i < matrix_height; i++) {
            for (int j = 0; j < matrix_length; j++) {
                matrix[i][j] = (int) ((random() * 10) + 1);
            }
        }
    }

    @Override
    public int min() {
        int result = matrix[0][0];
        for (int i = 0; i < matrix_height; i++) {
            for (int j = 0; j < matrix_length; j++) {
                if (matrix[i][j] < result)
                    result = matrix[i][j];
            }
        }
        return result;
    }

    @Override
    public int max() {
        int result = matrix[0][0];
        for (int i = 0; i < matrix_height; i++) {
            for (int j = 0; j < matrix_length; j++) {
                if (matrix[i][j] > result)
                    result = matrix[i][j];
            }
        }
        return result;
    }
}

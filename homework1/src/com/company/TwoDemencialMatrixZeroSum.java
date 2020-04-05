package com.company;

import static java.lang.Math.random;

public class TwoDemencialMatrixZeroSum extends TwoDemencialMatrix {
    int matrix_sum;

    public TwoDemencialMatrixZeroSum() {
        matrix_length = 5;
        matrix_height = 5;
        matrix = new int[matrix_height][matrix_length];
        //Такое решение генерации матрицы с 0 суммой в корне не правильное, мне стыдно,
        //но ничего лучше не придумал и не нашел =(
        do {
            matrix_sum = 0;
            for (int i = 0; i < matrix_height; i++) {
                for (int j = 0; j < matrix_length; j++) {
                    matrix[i][j] = (int) ((random() * 20) - 10);
                    matrix_sum += matrix[i][j];
                }
            }
        }
        while (matrix_sum != 0);
    }

    public TwoDemencialMatrixZeroSum(int matrix_length, int matrix_height) {
        this.matrix_length = matrix_length;
        this.matrix_height = matrix_height;
        matrix = new int[matrix_height][matrix_length];
        //Такое решение генерации матрицы с 0 суммой в корне не правильное, мне стыдно,
        //но ничего лучше не придумал и не нашел =(
        do {
            matrix_sum = 0;
            for (int i = 0; i < matrix_height; i++) {
                for (int j = 0; j < matrix_length; j++) {
                    matrix[i][j] = (int) ((random() * 20) - 10);
                    matrix_sum += matrix[i][j];
                }
            }
        }
        while (matrix_sum != 0);
    }
}

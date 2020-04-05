package com.company;

public class Main {

    public static void main(String[] args) {

        TwoDemencialMatrix some_matrix = new TwoDemencialMatrix(6, 6);
        TwoDemencialMatrix some_matrix_static =new TwoDemencialMatrix();

        TwoDemencialMatrixZeroSum zero_matrix = new TwoDemencialMatrixZeroSum(6, 6);
        TwoDemencialMatrixZeroSum zero_matrix_static = new TwoDemencialMatrixZeroSum();

        //Динамическая матрица
        some_matrix.printMatrix();
        //Статика матрица 5х5
        some_matrix_static.printMatrix();

        //Динамическая матрица с суммой 0 (реализовано коряво)
        zero_matrix.printMatrix();
        //Статическая матрица с суммой 0 (реализовано коряво)
        zero_matrix_static.printMatrix();

        //Матрица в int[] змейкой (динамика)
        zero_matrix.snake_matrix();

        //Крест из нулей (динамика + сделал генерацию 1-9 для наглядности)
        some_matrix.zero_cross();
    }
}

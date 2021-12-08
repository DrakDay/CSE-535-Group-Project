package com.example.cse535groupproject;

public class MatrixValues {
    // 2 Randomly generated matrices of size 50X50, with values ranging from 1-100
    public static int[][] _matrix1 = {{1,1}, {2,2}};
    public static int[][] _matrix2 = {{3,3}, {4,4}};

    public static int[][] matrix1 = {{55, 42, 95, 17, 60, 11, 10, 61, 95, 91, 43, 54, 25, 38, 75, 85, 48, 40, 34, 90, 68, 91, 85, 1, 14, 88, 83, 72, 44, 73, 98, 35, 13, 42, 14, 11, 8, 5, 17, 44, 4, 23, 63, 13, 55, 8, 18, 78, 59, 98},
            {39, 14, 94, 75, 4, 31, 10, 61, 85, 84, 89, 89, 85, 9, 51, 60, 98, 6, 26, 16, 73, 66, 48, 86, 85, 19, 79, 65, 36, 7, 70, 85, 87, 65, 97, 43, 78, 7, 26, 49, 67, 80, 71, 88, 77, 74, 11, 85, 18, 66},
            {2, 25, 23, 4, 70, 54, 40, 94, 99, 4, 75, 53, 8, 61, 1, 67, 95, 38, 40, 48, 63, 62, 13, 36, 82, 24, 13, 74, 5, 28, 40, 87, 8, 27, 82, 69, 54, 82, 65, 36, 83, 62, 69, 4, 2, 90, 58, 49, 69, 44},
            {85, 11, 64, 85, 18, 44, 30, 68, 54, 25, 60, 63, 58, 70, 72, 31, 10, 42, 6, 10, 56, 36, 61, 70, 17, 55, 12, 63, 75, 5, 44, 34, 29, 83, 50, 42, 24, 29, 35, 81, 42, 82, 97, 41, 69, 29, 26, 52, 67, 31},
            {19, 9, 93, 42, 86, 80, 75, 75, 45, 46, 13, 25, 82, 27, 76, 77, 29, 69, 61, 93, 45, 78, 51, 13, 95, 61, 89, 98, 18, 62, 42, 56, 12, 60, 60, 66, 58, 41, 84, 20, 41, 94, 75, 12, 69, 27, 91, 65, 36, 78},
            {58, 10, 56, 40, 84, 60, 43, 21, 57, 16, 20, 98, 38, 32, 22, 56, 44, 88, 29, 44, 18, 69, 85, 58, 83, 62, 67, 71, 45, 51, 64, 5, 63, 35, 28, 33, 98, 57, 24, 55, 58, 55, 76, 71, 51, 8, 20, 55, 78, 4},
            {71, 74, 80, 15, 29, 7, 71, 39, 58, 87, 95, 98, 56, 41, 75, 8, 86, 60, 88, 49, 95, 57, 1, 47, 90, 25, 61, 15, 44, 74, 38, 79, 24, 18, 31, 81, 16, 78, 37, 7, 84, 77, 59, 39, 48, 88, 83, 93, 92, 79},
            {82, 55, 88, 57, 31, 41, 6, 13, 37, 63, 2, 45, 68, 80, 49, 40, 17, 76, 95, 45, 49, 66, 55, 72, 59, 85, 73, 56, 92, 46, 67, 94, 76, 88, 57, 64, 3, 99, 16, 7, 30, 93, 87, 32, 99, 79, 20, 65, 53, 36},
            {37, 89, 57, 37, 50, 33, 66, 69, 7, 35, 19, 60, 31, 25, 51, 64, 69, 22, 72, 99, 24, 34, 24, 56, 14, 35, 12, 76, 62, 20, 91, 61, 2, 54, 7, 99, 56, 50, 65, 99, 85, 3, 51, 69, 89, 45, 34, 14, 58, 31},
            {9, 52, 87, 98, 76, 58, 72, 90, 16, 91, 52, 90, 71, 70, 52, 24, 24, 80, 99, 19, 18, 83, 68, 17, 74, 51, 79, 94, 49, 11, 88, 75, 79, 30, 87, 27, 49, 4, 89, 24, 52, 80, 28, 26, 50, 24, 12, 78, 88, 4},
            {70, 74, 95, 68, 55, 85, 46, 45, 82, 6, 20, 67, 40, 73, 98, 25, 29, 90, 55, 65, 28, 87, 71, 28, 35, 29, 47, 86, 37, 22, 27, 35, 5, 2, 8, 6, 59, 67, 49, 31, 43, 79, 48, 5, 90, 39, 97, 1, 77, 11},
            {38, 14, 38, 37, 55, 98, 90, 25, 87, 37, 65, 51, 4, 25, 36, 56, 11, 79, 40, 15, 95, 62, 32, 93, 28, 14, 65, 51, 61, 30, 72, 44, 43, 23, 74, 36, 77, 18, 47, 17, 56, 9, 24, 20, 25, 19, 2, 6, 10, 45},
            {33, 37, 10, 4, 91, 75, 88, 65, 2, 91, 87, 33, 16, 0, 9, 99, 84, 98, 77, 80, 68, 30, 92, 1, 51, 18, 92, 4, 17, 76, 72, 97, 94, 9, 0, 47, 58, 61, 73, 76, 68, 93, 12, 85, 54, 68, 32, 47, 78, 40},
            {27, 60, 79, 95, 3, 63, 33, 38, 73, 19, 32, 88, 54, 62, 36, 87, 18, 5, 27, 60, 6, 9, 0, 10, 3, 42, 91, 6, 93, 19, 85, 18, 3, 14, 22, 1, 63, 76, 23, 54, 62, 14, 99, 33, 86, 33, 34, 94, 56, 48},
            {44, 63, 71, 36, 41, 87, 31, 80, 49, 30, 67, 83, 64, 60, 56, 91, 59, 54, 38, 59, 33, 91, 17, 8, 98, 36, 26, 50, 21, 56, 82, 67, 79, 99, 44, 58, 52, 6, 39, 95, 74, 95, 98, 82, 40, 6, 31, 69, 64, 9},
            {39, 22, 98, 5, 35, 10, 97, 71, 50, 32, 9, 83, 67, 27, 95, 39, 14, 91, 20, 36, 12, 75, 60, 5, 6, 20, 56, 60, 28, 70, 24, 83, 46, 46, 10, 56, 44, 22, 32, 62, 76, 88, 81, 80, 89, 94, 19, 52, 92, 47},
            {46, 1, 30, 33, 33, 1, 4, 91, 37, 34, 42, 73, 54, 19, 32, 66, 83, 36, 4, 82, 27, 68, 82, 34, 86, 96, 38, 9, 93, 48, 66, 73, 81, 68, 24, 52, 64, 26, 87, 5, 86, 40, 63, 30, 60, 18, 88, 19, 38, 49},
            {99, 5, 22, 77, 47, 37, 35, 45, 50, 41, 64, 94, 41, 66, 66, 79, 24, 51, 24, 16, 11, 86, 33, 13, 57, 25, 89, 23, 90, 5, 57, 90, 56, 35, 49, 26, 84, 26, 52, 16, 75, 9, 84, 35, 20, 29, 60, 73, 92, 64},
            {83, 88, 17, 24, 42, 7, 89, 27, 65, 18, 6, 99, 76, 73, 56, 4, 61, 18, 47, 21, 91, 17, 99, 73, 24, 9, 35, 76, 44, 93, 13, 87, 27, 77, 52, 64, 26, 44, 39, 46, 59, 40, 1, 98, 74, 20, 7, 68, 12, 33},
            {98, 25, 29, 95, 36, 5, 46, 36, 54, 28, 74, 85, 22, 26, 54, 84, 48, 81, 33, 1, 18, 68, 1, 96, 2, 58, 72, 29, 20, 91, 43, 84, 64, 43, 61, 36, 68, 65, 33, 43, 98, 88, 5, 35, 77, 34, 15, 76, 73, 33},
            {22, 10, 56, 68, 34, 90, 22, 2, 69, 22, 97, 26, 62, 94, 42, 15, 40, 67, 15, 82, 61, 22, 26, 66, 13, 40, 68, 92, 78, 37, 12, 33, 9, 23, 55, 34, 30, 19, 15, 35, 30, 20, 20, 48, 38, 48, 59, 8, 89, 7},
            {59, 87, 62, 50, 30, 7, 52, 76, 36, 59, 6, 32, 60, 25, 71, 4, 28, 66, 81, 19, 71, 37, 82, 83, 50, 0, 73, 53, 47, 95, 2, 90, 22, 83, 60, 82, 59, 26, 87, 39, 25, 7, 57, 57, 5, 16, 68, 37, 50, 93},
            {55, 69, 73, 39, 86, 47, 27, 88, 64, 66, 46, 39, 3, 74, 85, 32, 91, 26, 91, 76, 80, 53, 75, 84, 26, 66, 3, 63, 99, 54, 59, 17, 24, 29, 34, 90, 90, 52, 42, 64, 24, 97, 17, 98, 73, 32, 32, 89, 59, 31},
            {93, 81, 43, 78, 69, 26, 73, 41, 59, 62, 41, 83, 45, 84, 68, 51, 88, 17, 49, 94, 36, 82, 39, 13, 27, 45, 59, 36, 82, 15, 80, 0, 70, 1, 43, 90, 16, 22, 66, 6, 48, 48, 45, 15, 1, 53, 95, 40, 17, 14},
            {63, 53, 41, 95, 2, 24, 36, 63, 62, 42, 41, 32, 42, 30, 60, 23, 37, 32, 32, 34, 57, 64, 94, 2, 20, 92, 31, 64, 25, 92, 45, 59, 57, 36, 1, 56, 26, 18, 92, 58, 14, 50, 75, 90, 69, 24, 61, 20, 88, 62},
            {17, 48, 26, 79, 78, 59, 49, 20, 74, 53, 10, 6, 82, 96, 15, 77, 4, 28, 17, 43, 48, 75, 62, 56, 49, 51, 9, 15, 12, 35, 25, 23, 67, 83, 77, 8, 15, 16, 17, 37, 36, 16, 62, 22, 22, 78, 48, 62, 37, 83},
            {53, 68, 67, 62, 62, 20, 43, 69, 90, 38, 46, 97, 91, 78, 33, 59, 58, 46, 1, 13, 63, 9, 99, 13, 54, 32, 36, 49, 84, 88, 26, 17, 17, 37, 58, 66, 24, 34, 88, 39, 45, 37, 9, 54, 15, 12, 40, 44, 93, 66},
            {93, 6, 84, 9, 56, 17, 44, 97, 89, 33, 80, 48, 93, 62, 52, 28, 55, 28, 65, 61, 30, 57, 24, 93, 44, 29, 29, 85, 72, 2, 70, 23, 97, 90, 27, 93, 34, 23, 73, 25, 79, 37, 60, 28, 22, 99, 28, 87, 72, 27},
            {15, 11, 75, 68, 88, 73, 79, 7, 76, 5, 72, 70, 17, 53, 83, 6, 81, 5, 11, 79, 69, 11, 68, 54, 27, 57, 71, 78, 35, 18, 0, 0, 22, 38, 88, 54, 89, 93, 19, 48, 88, 72, 34, 30, 3, 81, 35, 61, 50, 9},
            {45, 97, 41, 87, 24, 47, 90, 95, 54, 89, 55, 48, 76, 83, 77, 96, 64, 57, 72, 34, 87, 59, 66, 22, 72, 72, 46, 82, 39, 0, 73, 77, 1, 25, 27, 30, 53, 73, 32, 42, 20, 75, 63, 53, 54, 11, 25, 43, 97, 20},
            {83, 88, 63, 61, 45, 43, 55, 95, 55, 1, 93, 43, 98, 12, 67, 43, 76, 35, 65, 44, 34, 77, 37, 68, 43, 10, 0, 42, 1, 0, 33, 79, 75, 13, 8, 70, 27, 55, 27, 3, 98, 9, 88, 5, 26, 28, 91, 80, 85, 90},
            {95, 28, 79, 66, 41, 64, 2, 50, 70, 97, 98, 95, 49, 34, 41, 36, 24, 41, 73, 98, 11, 81, 84, 42, 5, 8, 69, 55, 40, 11, 76, 28, 79, 68, 88, 8, 35, 0, 90, 94, 74, 27, 15, 64, 53, 1, 31, 6, 25, 67},
            {69, 39, 77, 15, 11, 17, 39, 53, 30, 67, 43, 4, 23, 60, 90, 21, 13, 34, 97, 34, 14, 93, 38, 82, 37, 67, 76, 49, 3, 81, 63, 68, 35, 88, 35, 67, 64, 73, 50, 51, 98, 14, 52, 23, 64, 55, 19, 54, 69, 22},
            {93, 96, 2, 91, 73, 59, 84, 55, 47, 16, 3, 84, 84, 79, 54, 27, 34, 12, 8, 99, 26, 0, 64, 5, 75, 8, 85, 0, 2, 48, 84, 34, 95, 49, 38, 5, 56, 69, 63, 98, 19, 24, 41, 84, 50, 1, 63, 13, 98, 41},
            {53, 26, 23, 32, 49, 24, 47, 67, 56, 88, 28, 15, 15, 87, 17, 57, 22, 22, 81, 69, 18, 23, 5, 12, 79, 52, 12, 29, 5, 78, 14, 37, 29, 70, 34, 49, 4, 91, 14, 69, 59, 5, 16, 82, 5, 45, 29, 8, 54, 3},
            {46, 7, 94, 93, 92, 52, 15, 81, 11, 57, 37, 54, 55, 97, 30, 36, 62, 73, 66, 90, 98, 0, 20, 46, 22, 86, 43, 36, 68, 18, 54, 19, 27, 94, 99, 73, 95, 68, 60, 86, 93, 2, 54, 13, 49, 46, 14, 59, 84, 65},
            {54, 45, 31, 18, 33, 53, 82, 23, 17, 4, 22, 27, 94, 91, 38, 95, 24, 16, 1, 16, 65, 32, 40, 3, 77, 55, 0, 97, 31, 24, 26, 64, 65, 0, 83, 54, 21, 22, 25, 73, 22, 21, 31, 4, 30, 49, 73, 26, 69, 48},
            {51, 13, 28, 17, 64, 54, 89, 80, 40, 24, 3, 14, 66, 79, 82, 95, 29, 40, 4, 1, 14, 63, 63, 39, 2, 88, 78, 24, 75, 82, 68, 10, 49, 38, 88, 56, 67, 48, 3, 60, 84, 17, 72, 29, 56, 90, 74, 13, 36, 20},
            {61, 23, 25, 77, 59, 17, 73, 7, 50, 21, 13, 76, 26, 70, 78, 34, 81, 46, 71, 5, 71, 30, 29, 87, 60, 6, 62, 40, 33, 56, 85, 67, 74, 71, 38, 49, 39, 13, 78, 77, 94, 50, 13, 0, 9, 20, 84, 71, 66, 9},
            {59, 20, 8, 88, 95, 34, 6, 92, 82, 14, 53, 38, 3, 83, 94, 78, 82, 25, 46, 9, 34, 18, 26, 39, 97, 97, 37, 4, 61, 17, 49, 5, 35, 34, 98, 60, 50, 3, 41, 64, 43, 27, 21, 88, 80, 10, 65, 23, 72, 41},
            {37, 23, 20, 63, 23, 39, 48, 20, 29, 33, 14, 66, 65, 97, 96, 86, 30, 40, 1, 76, 11, 21, 49, 25, 51, 46, 10, 27, 43, 91, 60, 15, 71, 73, 26, 26, 3, 30, 3, 76, 66, 73, 78, 31, 18, 37, 81, 33, 16, 18},
            {10, 47, 83, 56, 25, 30, 36, 96, 10, 94, 99, 1, 47, 41, 69, 84, 82, 69, 83, 93, 1, 31, 84, 79, 91, 89, 84, 70, 10, 47, 59, 95, 59, 55, 37, 60, 10, 50, 55, 94, 48, 99, 35, 77, 68, 7, 90, 72, 37, 75},
            {64, 71, 34, 87, 53, 90, 51, 87, 19, 47, 32, 35, 43, 7, 16, 84, 61, 97, 96, 42, 56, 12, 80, 95, 86, 0, 71, 14, 43, 93, 94, 68, 76, 8, 66, 68, 40, 43, 3, 13, 27, 52, 34, 87, 29, 98, 83, 82, 10, 68},
            {16, 78, 12, 90, 17, 32, 56, 49, 56, 66, 11, 27, 3, 40, 32, 49, 14, 95, 23, 63, 31, 55, 76, 98, 16, 92, 57, 28, 95, 41, 46, 0, 77, 70, 75, 68, 61, 0, 81, 77, 20, 15, 55, 34, 10, 79, 73, 10, 69, 52},
            {86, 48, 23, 9, 86, 88, 2, 89, 58, 24, 19, 29, 8, 13, 91, 93, 72, 41, 30, 42, 1, 71, 38, 20, 95, 34, 0, 6, 69, 9, 59, 47, 38, 35, 70, 92, 73, 31, 29, 28, 1, 64, 28, 27, 88, 68, 46, 84, 44, 67},
            {40, 86, 1, 43, 18, 22, 98, 26, 81, 43, 22, 32, 36, 59, 55, 88, 77, 18, 85, 30, 44, 14, 9, 3, 45, 74, 38, 89, 47, 19, 78, 64, 89, 68, 95, 70, 5, 21, 64, 8, 77, 68, 22, 83, 57, 93, 76, 75, 32, 37},
            {70, 50, 23, 86, 83, 32, 56, 77, 54, 70, 17, 17, 71, 62, 67, 92, 44, 51, 70, 32, 14, 2, 23, 40, 59, 37, 37, 20, 45, 27, 83, 16, 32, 54, 2, 41, 98, 41, 79, 67, 80, 13, 32, 87, 66, 91, 63, 98, 32, 19},
            {29, 32, 72, 78, 76, 47, 15, 22, 5, 54, 71, 90, 89, 11, 7, 62, 34, 15, 31, 48, 31, 1, 20, 42, 76, 92, 88, 16, 21, 23, 87, 13, 50, 80, 93, 78, 72, 41, 96, 67, 75, 28, 22, 27, 76, 6, 92, 83, 42, 63},
            {46, 82, 36, 20, 6, 36, 18, 5, 57, 13, 37, 94, 29, 17, 62, 62, 46, 99, 99, 99, 20, 51, 17, 73, 5, 89, 10, 45, 81, 28, 7, 90, 42, 3, 10, 37, 99, 59, 5, 34, 24, 2, 26, 51, 43, 8, 24, 63, 94, 57},
            {17, 4, 5, 35, 50, 63, 17, 2, 28, 9, 15, 25, 59, 68, 51, 59, 20, 50, 37, 8, 81, 90, 17, 7, 66, 22, 71, 5, 44, 38, 26, 80, 41, 11, 14, 62, 35, 95, 77, 76, 81, 0, 83, 87, 48, 20, 66, 66, 16, 37}};


    public static int[][] matrix2 = {{57, 50, 35, 31, 53, 80, 63, 87, 66, 85, 3, 21, 69, 28, 84, 90, 83, 56, 30, 60, 98, 24, 55, 84, 83, 22, 5, 95, 15, 16, 64, 33, 83, 14, 58, 74, 72, 52, 46, 10, 89, 67, 84, 5, 80, 25, 94, 92, 83, 58},
            {57, 59, 71, 30, 24, 8, 48, 36, 7, 45, 1, 21, 64, 6, 11, 95, 34, 66, 89, 89, 86, 24, 38, 40, 91, 37, 10, 38, 51, 97, 56, 59, 36, 72, 1, 74, 1, 96, 15, 56, 69, 45, 48, 96, 82, 20, 38, 13, 95, 5},
            {56, 89, 93, 20, 47, 15, 48, 18, 28, 69, 90, 86, 61, 20, 41, 95, 47, 32, 78, 89, 70, 67, 79, 20, 29, 91, 4, 92, 22, 17, 54, 12, 54, 82, 77, 70, 6, 32, 72, 12, 41, 72, 48, 45, 22, 44, 86, 59, 22, 48},
            {30, 5, 87, 83, 33, 70, 68, 84, 47, 24, 88, 50, 2, 26, 87, 6, 47, 58, 89, 76, 18, 31, 22, 57, 45, 40, 43, 67, 90, 40, 90, 10, 3, 6, 76, 32, 99, 86, 92, 61, 55, 54, 17, 57, 83, 80, 58, 50, 82, 56},
            {82, 58, 22, 18, 63, 2, 49, 30, 36, 70, 66, 76, 74, 34, 27, 62, 7, 64, 30, 37, 66, 20, 8, 13, 27, 25, 50, 10, 48, 74, 72, 80, 91, 46, 45, 2, 50, 8, 72, 43, 1, 56, 28, 61, 66, 51, 39, 99, 10, 46},
            {13, 26, 9, 78, 41, 45, 4, 86, 66, 87, 80, 38, 39, 71, 66, 29, 77, 54, 86, 27, 49, 95, 61, 42, 38, 40, 99, 59, 66, 24, 19, 11, 17, 71, 2, 63, 48, 62, 46, 65, 63, 52, 31, 10, 28, 35, 45, 54, 36, 15},
            {41, 55, 41, 22, 38, 67, 32, 96, 9, 68, 78, 34, 89, 85, 13, 70, 24, 43, 87, 85, 79, 1, 37, 41, 80, 34, 87, 74, 71, 70, 22, 33, 24, 12, 28, 53, 96, 67, 84, 34, 11, 31, 45, 71, 3, 4, 65, 27, 88, 38},
            {26, 28, 77, 91, 97, 89, 4, 34, 52, 75, 83, 88, 85, 7, 90, 46, 30, 50, 17, 71, 60, 2, 89, 36, 4, 44, 59, 66, 73, 15, 45, 32, 35, 21, 58, 26, 62, 25, 10, 13, 22, 62, 11, 33, 31, 2, 51, 9, 58, 31},
            {98, 62, 99, 55, 24, 59, 15, 2, 92, 62, 49, 54, 48, 68, 60, 27, 93, 95, 44, 69, 23, 5, 54, 43, 26, 88, 36, 14, 40, 61, 2, 67, 87, 45, 74, 74, 84, 80, 33, 64, 77, 9, 54, 64, 69, 76, 19, 90, 9, 72},
            {0, 4, 95, 4, 88, 59, 7, 57, 74, 62, 9, 97, 40, 18, 76, 47, 3, 54, 20, 31, 48, 74, 60, 81, 27, 4, 91, 46, 97, 82, 40, 88, 45, 79, 25, 60, 80, 8, 96, 89, 35, 75, 89, 19, 88, 20, 41, 21, 84, 17},
            {21, 92, 82, 92, 40, 50, 29, 67, 46, 44, 45, 35, 13, 16, 63, 42, 61, 55, 42, 96, 4, 7, 46, 57, 97, 97, 84, 38, 94, 74, 64, 89, 58, 47, 48, 70, 9, 87, 94, 64, 35, 48, 58, 74, 15, 59, 58, 56, 60, 74},
            {69, 10, 43, 47, 63, 51, 88, 92, 82, 6, 72, 58, 96, 86, 60, 92, 81, 1, 47, 72, 4, 80, 82, 51, 3, 62, 64, 86, 7, 34, 6, 81, 82, 98, 93, 22, 91, 70, 51, 32, 68, 78, 93, 34, 31, 94, 10, 66, 27, 20},
            {82, 86, 31, 95, 66, 74, 97, 18, 7, 35, 57, 84, 14, 72, 1, 36, 14, 68, 29, 2, 22, 81, 52, 81, 50, 37, 41, 35, 33, 66, 28, 22, 50, 56, 21, 93, 71, 31, 68, 60, 16, 9, 72, 93, 45, 47, 38, 65, 6, 76},
            {53, 42, 15, 15, 50, 71, 68, 27, 30, 21, 5, 89, 5, 33, 23, 98, 44, 81, 26, 87, 19, 39, 63, 77, 76, 30, 74, 54, 28, 35, 65, 78, 15, 87, 41, 94, 52, 84, 53, 97, 31, 29, 40, 65, 66, 36, 81, 21, 99, 51},
            {27, 93, 32, 0, 47, 34, 42, 54, 1, 93, 64, 44, 75, 86, 84, 89, 34, 90, 0, 56, 54, 90, 79, 27, 25, 67, 55, 8, 64, 44, 90, 97, 1, 27, 61, 65, 50, 13, 25, 19, 12, 51, 90, 19, 64, 49, 99, 15, 10, 63},
            {75, 24, 68, 51, 78, 31, 6, 51, 3, 31, 0, 56, 18, 69, 1, 92, 83, 28, 39, 49, 5, 94, 48, 98, 18, 96, 36, 63, 64, 90, 6, 36, 89, 95, 97, 31, 52, 32, 35, 93, 79, 31, 25, 88, 86, 40, 42, 87, 30, 43},
            {98, 98, 11, 86, 28, 64, 84, 3, 63, 51, 20, 65, 22, 31, 34, 68, 7, 63, 22, 75, 65, 81, 35, 10, 83, 49, 34, 69, 65, 50, 65, 20, 63, 21, 50, 13, 45, 71, 19, 24, 13, 93, 34, 94, 57, 90, 37, 45, 0, 46},
            {75, 87, 8, 63, 31, 6, 6, 6, 7, 61, 57, 87, 66, 94, 82, 89, 82, 88, 66, 45, 96, 79, 82, 25, 30, 66, 11, 59, 75, 13, 22, 68, 20, 29, 91, 75, 39, 90, 86, 15, 31, 72, 23, 48, 83, 33, 31, 46, 44, 14},
            {21, 95, 51, 25, 15, 0, 40, 20, 10, 72, 36, 57, 76, 18, 15, 13, 19, 80, 58, 42, 16, 1, 73, 25, 31, 31, 9, 6, 95, 17, 18, 25, 30, 13, 40, 37, 14, 90, 37, 42, 99, 78, 0, 99, 93, 35, 98, 51, 47, 24},
            {49, 19, 26, 23, 26, 17, 16, 37, 79, 11, 16, 18, 50, 78, 38, 39, 54, 47, 20, 26, 96, 45, 28, 85, 19, 69, 63, 64, 88, 42, 48, 85, 12, 47, 1, 1, 19, 24, 34, 54, 79, 74, 55, 87, 60, 72, 68, 57, 26, 59},
            {66, 28, 25, 13, 85, 77, 0, 45, 37, 24, 22, 19, 97, 92, 94, 8, 18, 44, 81, 61, 50, 86, 23, 10, 16, 47, 98, 5, 41, 38, 96, 1, 18, 53, 97, 81, 25, 18, 56, 33, 58, 59, 38, 69, 99, 46, 57, 45, 39, 52},
            {72, 97, 8, 61, 12, 51, 43, 39, 14, 86, 17, 84, 72, 65, 49, 52, 79, 65, 9, 76, 3, 4, 96, 46, 26, 17, 81, 89, 51, 70, 17, 95, 38, 96, 91, 34, 2, 41, 61, 49, 3, 66, 3, 18, 94, 56, 16, 97, 63, 23},
            {25, 66, 13, 39, 62, 8, 74, 83, 84, 54, 57, 43, 45, 24, 25, 37, 11, 91, 84, 80, 4, 57, 62, 58, 68, 43, 89, 33, 57, 93, 69, 37, 75, 34, 81, 12, 40, 18, 48, 94, 7, 97, 91, 32, 89, 28, 60, 9, 1, 58},
            {48, 17, 45, 53, 78, 30, 95, 49, 50, 31, 86, 31, 26, 20, 94, 7, 48, 49, 21, 95, 54, 88, 63, 98, 12, 21, 43, 97, 47, 76, 73, 33, 60, 62, 97, 8, 91, 37, 76, 46, 77, 21, 61, 80, 69, 59, 84, 12, 22, 12},
            {27, 43, 35, 62, 87, 68, 70, 43, 33, 31, 35, 21, 70, 90, 1, 65, 10, 51, 21, 24, 9, 7, 62, 0, 76, 47, 90, 43, 81, 98, 11, 59, 61, 23, 8, 7, 48, 25, 67, 37, 41, 40, 91, 9, 65, 22, 34, 9, 65, 88},
            {20, 71, 59, 60, 33, 57, 69, 45, 45, 52, 86, 45, 67, 45, 19, 78, 67, 89, 66, 91, 96, 11, 69, 3, 95, 84, 77, 74, 45, 6, 51, 91, 1, 2, 1, 1, 81, 60, 62, 81, 55, 30, 75, 90, 69, 18, 49, 49, 54, 80},
            {28, 48, 24, 73, 31, 9, 11, 73, 87, 64, 28, 92, 26, 74, 75, 96, 76, 26, 15, 98, 1, 87, 11, 8, 31, 83, 98, 42, 31, 11, 25, 26, 78, 50, 49, 95, 34, 24, 48, 89, 82, 1, 20, 88, 76, 48, 31, 13, 95, 47},
            {83, 74, 88, 76, 98, 14, 10, 77, 66, 94, 13, 92, 86, 45, 37, 35, 73, 21, 89, 16, 13, 79, 51, 25, 33, 24, 12, 94, 67, 59, 99, 8, 80, 84, 70, 51, 46, 62, 5, 31, 9, 85, 11, 85, 35, 57, 49, 61, 69, 52},
            {54, 63, 14, 84, 33, 43, 70, 86, 45, 34, 61, 12, 43, 28, 20, 56, 50, 28, 17, 18, 64, 95, 86, 22, 5, 97, 67, 60, 13, 73, 37, 67, 56, 92, 40, 28, 1, 69, 93, 73, 25, 12, 53, 72, 85, 29, 33, 70, 30, 16},
            {58, 38, 54, 76, 71, 79, 80, 53, 79, 80, 86, 63, 48, 69, 58, 68, 41, 19, 75, 18, 28, 17, 86, 15, 45, 93, 57, 1, 8, 87, 53, 15, 42, 0, 80, 9, 78, 11, 18, 16, 45, 1, 87, 99, 72, 84, 50, 33, 92, 8},
            {74, 77, 76, 22, 14, 19, 91, 73, 96, 22, 25, 65, 39, 51, 92, 58, 37, 48, 11, 87, 16, 34, 99, 57, 93, 89, 47, 28, 75, 95, 10, 76, 18, 84, 97, 16, 24, 73, 42, 20, 94, 66, 51, 82, 72, 18, 56, 56, 82, 19},
            {4, 53, 18, 44, 68, 26, 63, 88, 86, 3, 33, 49, 45, 38, 84, 61, 66, 68, 51, 44, 23, 47, 10, 66, 28, 37, 23, 24, 10, 52, 86, 67, 23, 75, 80, 94, 33, 72, 94, 22, 17, 54, 28, 79, 76, 87, 92, 89, 48, 72},
            {69, 8, 68, 50, 12, 6, 10, 22, 34, 88, 26, 12, 90, 25, 82, 3, 75, 30, 25, 80, 45, 53, 67, 26, 92, 66, 87, 99, 21, 4, 83, 90, 37, 66, 55, 9, 69, 22, 14, 69, 72, 30, 33, 48, 73, 43, 58, 75, 37, 14},
            {8, 26, 69, 31, 33, 78, 45, 85, 2, 14, 31, 46, 95, 25, 67, 34, 27, 27, 85, 90, 47, 2, 9, 79, 51, 42, 44, 66, 62, 26, 87, 38, 90, 46, 81, 10, 31, 22, 31, 12, 26, 91, 0, 99, 32, 37, 95, 58, 65, 57},
            {63, 54, 11, 90, 73, 34, 42, 60, 6, 26, 17, 4, 30, 13, 36, 47, 6, 71, 45, 42, 94, 60, 22, 59, 1, 3, 53, 90, 17, 32, 68, 35, 80, 70, 24, 88, 60, 92, 68, 90, 52, 58, 94, 90, 24, 27, 85, 22, 64, 55},
            {63, 62, 38, 92, 87, 45, 36, 18, 99, 61, 1, 16, 60, 24, 43, 65, 91, 72, 82, 76, 36, 41, 70, 48, 62, 2, 43, 29, 85, 27, 62, 40, 36, 34, 11, 49, 51, 34, 17, 79, 34, 16, 43, 49, 65, 65, 93, 69, 16, 85},
            {63, 42, 22, 53, 87, 3, 73, 90, 37, 94, 44, 41, 52, 47, 49, 3, 33, 50, 96, 2, 27, 28, 38, 37, 11, 31, 56, 69, 41, 64, 62, 66, 36, 75, 67, 10, 31, 98, 31, 77, 4, 11, 63, 41, 31, 88, 98, 32, 0, 28},
            {25, 60, 79, 36, 47, 39, 33, 7, 84, 93, 60, 7, 35, 28, 27, 62, 53, 87, 11, 55, 43, 71, 14, 27, 13, 34, 3, 18, 95, 33, 24, 22, 15, 1, 45, 74, 28, 22, 65, 96, 61, 85, 61, 75, 33, 32, 93, 64, 75, 25},
            {75, 28, 42, 12, 13, 2, 43, 21, 43, 15, 64, 6, 53, 48, 29, 37, 31, 15, 58, 70, 51, 79, 87, 25, 61, 58, 77, 67, 46, 60, 46, 64, 98, 98, 8, 76, 19, 65, 27, 66, 16, 86, 72, 83, 28, 55, 87, 39, 92, 27},
            {89, 88, 31, 47, 31, 80, 55, 65, 66, 4, 30, 82, 92, 79, 77, 9, 57, 91, 74, 79, 35, 1, 53, 10, 8, 40, 19, 34, 17, 80, 22, 94, 13, 70, 85, 88, 40, 99, 8, 0, 62, 31, 94, 39, 20, 47, 75, 1, 64, 42},
            {85, 88, 42, 29, 30, 72, 24, 10, 99, 61, 4, 24, 29, 48, 17, 22, 93, 99, 26, 97, 16, 95, 87, 88, 0, 71, 6, 55, 9, 14, 75, 36, 91, 69, 37, 55, 57, 57, 4, 7, 93, 9, 71, 62, 22, 13, 30, 10, 35, 35},
            {22, 47, 78, 45, 10, 51, 45, 84, 22, 84, 86, 64, 88, 69, 10, 54, 90, 94, 51, 51, 27, 61, 23, 46, 70, 11, 45, 5, 24, 72, 20, 64, 47, 81, 54, 68, 99, 8, 54, 88, 89, 46, 95, 51, 24, 97, 93, 22, 75, 27},
            {11, 55, 54, 11, 66, 26, 33, 35, 81, 72, 47, 28, 50, 39, 17, 87, 65, 27, 57, 36, 45, 99, 50, 45, 91, 91, 86, 0, 84, 97, 72, 94, 31, 45, 25, 53, 23, 88, 1, 45, 62, 6, 51, 28, 10, 60, 8, 76, 79, 93},
            {70, 22, 72, 92, 34, 84, 35, 15, 76, 14, 86, 35, 39, 90, 79, 53, 20, 0, 40, 1, 1, 82, 5, 10, 27, 57, 28, 90, 53, 48, 51, 44, 48, 25, 65, 75, 91, 95, 14, 65, 20, 56, 13, 49, 50, 96, 0, 91, 22, 2},
            {35, 99, 13, 2, 86, 46, 72, 96, 61, 45, 99, 5, 50, 22, 72, 99, 17, 73, 59, 32, 41, 43, 7, 44, 12, 71, 32, 56, 73, 95, 17, 73, 46, 78, 78, 16, 40, 24, 46, 60, 31, 5, 58, 37, 27, 72, 86, 92, 85, 61},
            {98, 13, 72, 50, 73, 96, 15, 68, 66, 45, 87, 16, 79, 75, 75, 20, 39, 17, 28, 73, 41, 93, 32, 16, 47, 49, 75, 38, 93, 62, 44, 15, 70, 95, 38, 99, 94, 43, 74, 44, 46, 45, 66, 76, 85, 14, 92, 92, 92, 21},
            {89, 13, 20, 35, 58, 11, 85, 0, 37, 40, 50, 66, 81, 36, 89, 81, 79, 96, 45, 81, 17, 79, 2, 29, 85, 25, 39, 49, 99, 15, 1, 99, 36, 52, 24, 50, 27, 64, 36, 99, 98, 10, 10, 29, 10, 51, 90, 28, 64, 58},
            {51, 7, 20, 62, 82, 84, 68, 13, 4, 40, 54, 3, 31, 60, 44, 30, 5, 18, 41, 78, 88, 54, 77, 12, 18, 66, 89, 69, 49, 28, 69, 1, 56, 51, 31, 77, 80, 40, 16, 6, 1, 88, 95, 84, 97, 83, 46, 51, 11, 44},
            {90, 90, 98, 20, 7, 10, 61, 41, 76, 97, 99, 80, 53, 0, 44, 87, 98, 3, 98, 57, 61, 77, 78, 47, 41, 84, 27, 50, 1, 47, 66, 79, 92, 71, 65, 74, 15, 35, 57, 94, 98, 68, 15, 53, 24, 93, 62, 66, 33, 92},
            {43, 13, 98, 90, 19, 79, 16, 90, 98, 26, 74, 90, 85, 62, 17, 89, 17, 16, 18, 93, 4, 81, 39, 33, 81, 79, 16, 31, 63, 67, 4, 9, 56, 14, 4, 93, 44, 83, 75, 79, 21, 42, 65, 83, 93, 27, 16, 17, 23, 1}};

}

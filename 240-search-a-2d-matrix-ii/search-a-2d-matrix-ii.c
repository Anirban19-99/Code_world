
bool searchMatrix(int** matrix, int matrixSize, int* matrixColSize, int target){
    int m=*matrixColSize;
    int n=matrixSize;

   int row = 0, col = m - 1;
    while (row < n && col >= 0) {
        if (matrix[row][col] == target) return true;
        else if (matrix[row][col] < target) row++;
        else col--;
    }
    return false;


}
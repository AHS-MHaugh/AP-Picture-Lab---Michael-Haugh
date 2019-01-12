/**
 * Michael Haugh 
 * AP Picture Lab 
 * Programming III - AP CS 
 * 1-10-19
 */

public class IntArrayWorker
{
  /** two dimensional matrix */
  private int[][] matrix = null;
  
  /** set the matrix to the passed one
    * @param theMatrix the one to use
    */
  public void setMatrix(int[][] theMatrix)
  {
    matrix = theMatrix;
  }
  
  /**
   * Method to return the total 
   * @return the total of the values in the array
   */
  public int getTotal()
  {
    int total = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        total = total + matrix[row][col];
      }
    }
    return total;
  }
  
  /**
   * Method to return the total using a nested for-each loop
   * @return the total of the values in the array
   */
  public int getTotalNested()
  {
    int total = 0;
    for (int[] rowArray : matrix)
    {
      for (int item : rowArray)
      {
        total = total + item;
      }
    }
    return total;
  }
  
  /**
   * Method to fill with an increasing count
   */
  public void fillCount()
  {
    int numCols = matrix[0].length;
    int count = 1;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < numCols; col++)
      {
        matrix[row][col] = count;
        count++;
      }
    }
  }
  
  /**
   * print the values in the array in rows and columns
   */
  public void print()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        System.out.print( matrix[row][col] + " " );
      }
      System.out.println();
    }
    System.out.println();
  }
  
  
  /** 
   * fill the array with a pattern
   */
  public void fillPattern1()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; 
           col++)
      {
        if (row < col)
          matrix[row][col] = 1;
        else if (row == col)
          matrix[row][col] = 2;
        else
          matrix[row][col] = 3;
      }
    }
  }
  
//THIS METHOD WILL RETURN THE NUMER OF OCCURENCES OF A SPECIFIED NUMBER VALUE
    public int getCount(int number) {
        
        //Declare the count variable
        int count = 0;
        
        //Iterate through each row and column of the 2D array
        for(int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                //Count is increased if the specified nunber value is found in the array
                if(number == matrix[row][col]){
                    //Increase count
                    count++;
                }
            }
        }
        return count;
    }
    
//THIS METHOD WILL RETURN THE LARGEST NUMBER VALUE IN THE MATRIX
    public int getLargest() {

        //Declare the largest variable
        int largest = 0;
        
        //Iterate through each row and column of the 2D array
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                
                //Determine a new largest if the int is greater than the rest of the 2D array
                if (matrix[row][col] > largest) {
                    largest = matrix[row][col];}
            }
        }
     
        return largest;
    }

//THIS METHOD WILL RETURN THE TOTAL OF EACH SPECIFIED COLUMN IN THE MATRIX    
    public int getColTotal(int col) {
        //Declare the colTotal variable
        int colTotal = 0;
        
        //Iterate through each row of the 2D array
        for (int row = 0; row < matrix.length; row++) {
            //Sum the rows of each column
            colTotal += matrix[row][col];
        }

        return colTotal;
    }

}

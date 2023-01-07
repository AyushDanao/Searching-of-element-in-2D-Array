import java.util.Scanner;

public class element_search {
    static void printmatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void search(int[][] matrix,int x)
    {
        for(int i=0;i< matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==x)
                {
                    System.out.println("row="+i);
                    System.out.println("column="+j);
                }
                else {
                    System.out.println("-1");
                    return;
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("enter value of x ");
        int x = sc.nextInt();
        System.out.println("enter values in matrix");
        int[][] matrix=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        printmatrix(matrix);
        search(matrix,x);

    }
}

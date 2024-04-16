import java.util.Scanner;
import java.util.*;
public class restrictsudoku {
 public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		char [][]maze=new char[n][m];
		for(int i=0;i<m;i++)
		{
			String s=sc.next();
			for(int j=0;j<n;j++)
			{
				char ch=s.charAt(j);
				maze[i][j]=ch;

			}
		}
        int ans[][]=new int[n][m];
        rat_maze(maze,0,0,m,n,ans);
    }    
    public static void rat_maze(char [][]maze,int row,int col,int m,int n,int [][] ans)
    {
        if(row<0||col<0||row>=m||col>=n||maze[row][col]=='X')
        {
            return;
        }
        if(row==m-1&&col==n-1){
            ans[row][col]=1;
            print(ans,m,n);
            return;
        }
        maze[row][col]='X';
        ans[row][col]=1;
        rat_maze(maze,row-1,col,m,n,ans);
        rat_maze(maze,row+1,col,m,n,ans);
        rat_maze(maze,row,col-1,m,n,ans);
        rat_maze(maze,row,col+1,m,n,ans);
        maze[row][col]='O';
        ans[row][col]=0;
    }
    public static void print(int ans[][],int m,int n)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)                                                   
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}

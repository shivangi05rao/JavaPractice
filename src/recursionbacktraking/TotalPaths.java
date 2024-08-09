package recursionbacktraking;

public class TotalPaths {
    //count total paths in a maze to move from (0,0) to (n,m)
    public static  int countPaths(int i, int j, int n, int m){
        if (i==n || j==m){
            return 0;
        }
        if (i==n-1 && j==m-1){
            return 1;
        }
        //move right
        int rightPaths = countPaths(i+1, j, n, m);
        //move downwards
        int downPaths = countPaths(i, j+1, n, m);
        return downPaths + rightPaths;
    }
    public static void main(String[] args) {
        int totalPaths = countPaths(0, 0, 3, 3);
        System.out.println(totalPaths);
    }
}

//Multidimantional Array
class MD
{
    public static void main(String args[])
    {
        int[][][] a={{ {2,3} , {6,1}, {9,8} }};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                for(int z=0;z<a[i].length;z++)
                {
                System.out.println(a[i][j][z]);
                }
            }
        }
    }
}
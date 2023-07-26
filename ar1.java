class ar1                                                      // 34  67  90    1
{                                                               //99  124  67   2 
    public static void main()                                   //20   70 120   3 
    {
        int a[][]={{34,67,90},{99,124,67},{20,70,120}};
        int r=a.length;
        int c=a[0].length;
           
        for (int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
    
class OneDimArray {
    public static void main(String[] args) {
        int a[]=new int[5];
        a[0]=10;
        a[1]=12;
        a[2]=98;
        a[3]=87;
        a[4]=76;
        
        System.out.println("Elements of array:");
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);

    }
}
class MultiDimArray{
    public static void main(String []args){
        int arr[][]={{1,2,3},{4,5,6,},{7,8,9}};
        System.out.println("The Element of  2D array");
        for( int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.println(arr[i][j]+" ");
            }
        System.out.println();
        }

    }
}
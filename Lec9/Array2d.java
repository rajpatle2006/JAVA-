package Lec9;


class Array{
    int Sum (int arr[][]){
        int data=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                data+=arr[i][j];

            }
        }
        return data;

    }
}
public class Array2d {
    public static void main(String[] args) {
        int arr[][]={{1,2},{3,4}};
        Array obj=new Array();
       int val=obj.Sum(arr);
       System.out.println(val);
    }
    
}

class Rotate2{
    public static void main(String[] args) {
        int arr1[] = {10,20,30,40,50,60,70,80};
        int n = 2;
        int m = 3;
        for (int j = 0; j< n; j++){
            int last =  arr1[arr1.length-1-m];
            for(int i = arr1.length-1-m; i > 0 ; i--){
                arr1[i] = arr1[i-1];
            }
            arr1[0] = last;
        }
        for (int num : arr1){
            System.out.print(num+ " " );
        }
    }
}
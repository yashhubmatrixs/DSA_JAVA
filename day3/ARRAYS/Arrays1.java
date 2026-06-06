public class Arrays1 {
    public static void main(String[]args){
        int []arr={3,5,9,1,2,7};
        int max=arr[0];
        int secondmax=arr[0];
        int min = Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        int tmin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){
                secondmax=max;
        
                max=arr[i];

                
            }
            else if(arr[i]>secondmax){
                secondmax=arr[i];
            }

            if (arr[i]<min) {
                tmin=smin;
                smin=min;
                min=arr[i];
            }
            else if(arr[i]<smin){
                tmin=smin;
                smin=arr[i];
            }
            else if(arr[i]<tmin){
                tmin=arr[i];

            }

        }
        System.out.println("Second largest is : "+secondmax);
        System.out.println("Third smallest values is : "+tmin);
}
}

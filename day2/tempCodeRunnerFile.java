import java.util.Scanner;
class TravelAgencies{
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    public TravelAgencies( int regNo,
     String agencyName,
     String packageType,
     int price,
     boolean flightFacility) {
        this.regNo=regNo;
        this.agencyName=agencyName;
        this.packageType=packageType;
        this.price=price;
        this.flightFacility=flightFacility;
        
    }


    int getregNo(){
        return this.regNo;
    }
    void setregNo(int r){
        this.regNo=r;
    }

    String getagencyName(){
        return this.agencyName;
    }
    void setagencyName(String an){
        this.agencyName=an;
    }

    String getpackageType(){
        return this.packageType;
    }
    void setpakageType(String pt){
        this.agencyName=pt;
    }

    int getprice(){
        return this.price;
    }
    void setprice(int p){
        this.price=p;
    }

    boolean  getflightFacility(){
        return this.flightFacility;
    }
    void setflightFacility(boolean ff){
        this.flightFacility=ff;
    }


}


public class Travel {
    static int findAgencyWithHighestPackagePrice(TravelAgencies[] arr){
        int max=0;
        for(TravelAgencies agency : arr){
            if(agency.getprice()>max){
                max = agency.getprice();
            }
        }
        return max;

    }

    static TravelAgencies agencyDetailsforGivenIdAndType(TravelAgencies []arr,int regno,String packageType){
        for(TravelAgencies agency : arr){
            if(agency.getflightFacility()==true && agency.getregNo()==regno && agency.getpackageType().equalsIgnoreCase(packageType)){
                return agency;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        TravelAgencies[]arr=new TravelAgencies[n];
        for(int i=0;i<n;i++){
            int regno=sc.nextInt();
            sc.nextLine();
            String agencyName=sc.nextLine();
            String packageType=sc.nextLine();
            int price=sc.nextInt();
            boolean flightfacility=sc.nextBoolean();
            
            TravelAgencies agency=new TravelAgencies(regno, agencyName, packageType, price, flightfacility);
            arr[i]=agency;

        }
        int regno=sc.nextInt();
        String packageType=sc.nextLine();
        int max=findAgencyWithHighestPackagePrice(arr);
        TravelAgencies agency= agencyDetailsforGivenIdAndType(arr, regno, packageType);
        System.out.println(max);
        if(agency!=null)
        System.out.print(agency.getagencyName()+":"+agency.getprice());
        
    }
}

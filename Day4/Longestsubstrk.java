// import java.util.HashMap;

// public class Longestsubstrk {
//     public static void main(String[] args) {
//         String s="aabcbadad";
//         int k=2;
//         int max=0;
//         int l=0;
//         HashMap<Character,Integer>map=new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             char curr=s.charAt(i);
//             map.put(curr,map.getOrDefault(curr, 0)+1);

//         }
//         if(map.size()<=k){
//             int i = 0;
//             max=max<(i-l+1)?i-1+1:max; 
//         }
//         while(map.size()>k){
//             if(map.get(s.charAt(1))==1){
//                 map.remove(s.charAt(1));
//             }
//             else{
//                 map.put(s.charAt(1),map.get(s.charAt(1))-1);
//             }
//         }

//     }
// }




import java.util.HashMap;

public class Longestsubstrk {
    public static void main(String[] args) {

        String s = "aabcbadad";
        int k = 2;

        int max = 0;
        int l = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char curr = s.charAt(i);
            map.put(curr, map.getOrDefault(curr, 0) + 1);

            while (map.size() > k) {

                char leftChar = s.charAt(l);

                if (map.get(leftChar) == 1) {
                    map.remove(leftChar);
                } else {
                    map.put(leftChar, map.get(leftChar) - 1);
                }

                l++;
            }

            max = Math.max(max, i - l + 1);
        }

        System.out.println("Longest Length = " + max);
    }
}
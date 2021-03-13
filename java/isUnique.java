// "static void main" must be defined in a public class.
public class Main {
    
    
    // 1.Brute Force 
    public static boolean hasAllUnique(String str){
        // " " = Empty
        if(str.length()==0) return true;
        // "A" = Single
        if(str.length()==1) return true;
        // "A..." = More than two
        
        for(int i=0; i<str.length()-1; i++){
           for(int j=i+1; j<str.length(); j++){
               if(str.charAt(i)== str.charAt(j)) return false;
           }
        }
        
        return true;

    }
    
    // 2. Sorting
    public static boolean isUnique(String str){
        
        char[] chArray = str.toCharArray();
        
        Arrays.sort(chArray);
        
        for(int i=0; i<chArray.length-1; i++){
            if(chArray[i]==chArray[i+1]) return false;
        }
        
        return true;
    }
    
    // 3. Use Extra Space
    public static boolean isUniqueETS(String str){
        
        //Generally if you count all characters the count is 256;
        int MAX_COUNT = 256;
        
        boolean[] map = new boolean[MAX_COUNT];
        Arrays.fill(map, false);
        
        for(int i=0; i<str.length(); i++){
            int index = (int)str.charAt(i);
            
            if(map[index]) return false;
            
            map[index]= true;
            
        }
        
        return true;
        
    }

    
    public static void main(String[] args) {
        System.out.println(isUniqueETS("BQWERTYU"));
    }
}

// Implement an algorithm to determine if a string has all unique characters.
// What if you cannot use additional data structures.



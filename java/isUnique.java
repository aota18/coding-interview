// "static void main" must be defined in a public class.
Last login: Sat Mar 13 12:11:02 on ttys000
(base) ➜  ~ ls
AndroidStudioProjects Fonts                 Public
Applications          Library               Untitled 2.key
Desktop               Movies                Untitled.key
// "static void main" must be defined in a public class.
public class Main {

    public static boolean hasAllUnique(String str){
        // " " = Empty
        if(str.length()==0) return true;
        // "A" = Single
        if(str.length()==1) return true;
        // "A..." = More than two

        for(int i=0; i<str.length(); i++){
           for(int j=0; j<str.length(); j++){
               if(i!=j && str.charAt(i)== str.charAt(j)) return false;
           }
        }

        return true;

    }


    public static void main(String[] args) {
        System.out.println(hasAllUnique("BQWERTYU"));
    }
}

// Implement an algorithm to determine if a string has all unique characters.
// What if you cannot use additional data structures.


~
~
~
~
~
~
~
~
~
"isUnique.java" 30L, 774C

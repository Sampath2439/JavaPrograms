package Pragrams;
class main{
    public static void main(String[] args){
        String[] strings = {"madam","racecar","hello","world","level"};

        for(String s:strings){
            System.out.println(s + " is " + (ispalindrome(s) ?  " is a palindrome" : "not a palindrome"));
        }
    }
    public static boolean ispalindrome(String str){
        int left = 0, right = str.length() -1;
        while(left < right){
            if(str.charAt(left++) != str.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}

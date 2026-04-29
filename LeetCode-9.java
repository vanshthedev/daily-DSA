class Solution {
    public boolean isPalindrome(int x) {

//negative no palindrome nahi ho sakte so x<0 is false!
        if (x<0) return false;

        int original = x; //saving orgnal no
        int reverse = 0;

        //palindrome karne ke liye number ko reverse karna padega, so while loop se hoga

        while (x!=0) {
            int digit = x%10;  //isse LAST DIGIT niklegi
            reverse = reverse * 10 + digit; //isse REVERSE bnega
            x= x/10; //isse LAST digit hat jaegi

        }

        //ab check karna hai
        return original == reverse;

    }
}

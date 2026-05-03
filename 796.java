class Solution {
    public boolean rotateString(String s, String goal) {
        //checking the length
        if (s.length() != goal.length()) {
            return false;
        }

        //concatenate (ek string ko dubara usi string se jodna) s with itself
        String doubled = s+s;

        //check karenge ki humara goal koi substring hai ya nahi
        return doubled.contains(goal);
    }
}

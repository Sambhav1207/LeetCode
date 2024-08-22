class Solution {
    public int findComplement(int num) {
        String str = Integer.toBinaryString(num);
        String complement = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '0'){
                complement += "1";
            }else{
                complement += "0";
            }
        }
        return Integer.parseInt(complement, 2);
    }
}
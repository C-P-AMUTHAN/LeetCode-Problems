class Solution6 {
    public String reverseVowels(String s) {
        int l=0,r=s.length()-1;
        StringBuffer sb=new StringBuffer(s);
        while(l<r){
            if("aeiouAEIOU".indexOf(s.charAt(l))!=-1){
                if("aeiouAEIOU".indexOf(s.charAt(r))!=-1){
                    char temp=sb.charAt(l);
                    sb.setCharAt(l,sb.charAt(r));
                    sb.setCharAt(r,temp);
                    l++;r--;
                }
                else{
                    r--;
                }
            }
            else{
                l++;
            }
        }
        return sb.toString();
    }
}

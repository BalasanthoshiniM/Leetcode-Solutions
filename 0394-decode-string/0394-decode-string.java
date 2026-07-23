class Solution {
    public String decodeString(String s) {
        Stack <Character> stack=new Stack<>();
        String k="";
        String str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=']'){
                stack.push(s.charAt(i));
            }
            else{
                str="";
                while(stack.peek()!='['){
                    str=stack.pop()+str;
                }
                stack.pop();
                k="";
                while(!stack.isEmpty()&& Character.isDigit(stack.peek())){
                    k=stack.pop()+k;
                }
                int n=Integer.parseInt(k);
                String res="";
                for(int j=1;j<=n;j++){
                res+=str;
                }
                for(char c: res.toString().toCharArray()){
                    stack.push(c);
                }
            }
        }
        String result="";
        while(!stack.isEmpty()){
            result=stack.pop()+result;
        }
        return result;
    }
}
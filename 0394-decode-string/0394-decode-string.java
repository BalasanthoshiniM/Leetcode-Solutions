class Solution {
    public String decodeString(String s) {
        Stack <Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=']'){
                stack.push(s.charAt(i));
            }
            else{
                String str="";
                String res="";
                String num="";
                while(!stack.isEmpty() && stack.peek()>='a' && stack.peek()<='z'){
                    str=stack.pop()+str;
                }
                if(stack.peek()=='[' ){
                    stack.pop();
                }
                while(!stack.isEmpty() && stack.peek() >='0' && stack.peek()<='9'){
                    num=stack.pop()+num;
                }
                int times=0;
                if(!num.isEmpty()){
                    times=Integer.parseInt(num);
                }
                for(int k=1;k<=times;k++){
                    res=str+res;
                }
                for(int k=0;k<res.length();k++){
                    stack.push(res.charAt(k));
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
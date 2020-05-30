import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        Solution solution =new Solution();
        String s = "(ed(et(oc))el)";
        solution.reverseParentheses(s);
    }
    public String reverseParentheses(String s) {
        ArrayList<String> str1 = new ArrayList<String>();
        ArrayList<String> str2 = new ArrayList<String>();
        int i = 0;
        String temp = new String();
        StringTokenizer st = new StringTokenizer(s, "(");

        while (st.hasMoreElements())
        {
            str1.add(st.nextElement().toString());
        }
        temp = str1.get(str1.size()-1);
        StringTokenizer st2 = new StringTokenizer(temp, ")");
        while (st2.hasMoreElements())
        {
            str2.add(st2.nextElement().toString());
        }


//        输出ArrayList中的数据
//        while (i < str1.size())
//        {
//            System.out.println(str1.get(i));
//            i++;
//        }
//        i = 0;
//        while (i < str2.size())
//        {
//            System.out.println(str2.get(i));
//            i++;
//        }
        return s;
    }
}

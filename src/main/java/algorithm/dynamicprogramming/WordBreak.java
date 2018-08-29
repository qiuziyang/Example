package algorithm.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author qiuziyang_i
 * @Date 18/8/2 下午5:04
 */
public class WordBreak {
    public static boolean wordbreak(String s, List<String> dict) {
        int len = s.length();
        boolean dp[] = new boolean[len + 1];
        dp[0] = true;
        for (int i = 1; i < len + 1; i++) {
            for (int j = 0; j < i; j++) {
                String tmp = s.substring(j, i);
                if (dp[j] && dict.contains(tmp)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[len];
    }
    public static void main(String[] args){
        String s = "leetcode1";
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("code1");
        arrayList.add("leet");
        System.out.println(wordbreak(s,arrayList));
    }
}

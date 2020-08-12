/*
    Problem : 1432
    Title : Max Difference You Can Get From Changing an Integer
    Link : https://leetcode.com/contest/weekly-contest-187
*/
class Solution {
    public int maxDiff(int num) {
        
        // change leftmost digit that isn't a 9 to a 9
        char[] hi = Integer.toString(num).toCharArray();
        for (int i = 0; i < hi.length; i++) {
            if (hi[i] != '9') {
                char x = hi[i];
                for (int j = i; j < hi.length; j++) {
                    if (hi[j] == x) hi[j] = '9';
                }
                break;
            }
        }
        
        // if first digit is 1, change first leftmost digit
        // that isn't 0 or 1 to 0. otherwise change first
        // digit to 1
        char[] lo = Integer.toString(num).toCharArray();
        if (lo[0] == '1') {
            for (int i = 1; i < lo.length; i++) {
                if (lo[i] != '0' && lo[i] != '1') {
                    char x = lo[i];
                    for (int j = i; j < lo.length; j++) {
                        if (lo[j] == x) lo[j] = '0';
                    }
                    break;
                }
            }
        } else {
            char x = lo[0];
            for (int j = 0; j < lo.length; j++) {
                if (lo[j] == x) lo[j] = '1';
            }
        }
        int a = Integer.parseInt(new String(hi));
        int b = Integer.parseInt(new String(lo));
        return a - b;

    }
}
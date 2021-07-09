package string;

public class ReverseString2 {

    public void reverseWords(char[] s) {

        int start = 0;
        int end = s.length - 1;

        char temp;
        while (start <= end) {
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }

        int sidx = 0;
        int eidx = 0;

        for (int i = 0; i < s.length; i++) {

            if (s[i] == ' ') {
                eidx = i - 1;
                while (sidx <= eidx) {
                    temp = s[eidx];
                    s[eidx] = s[sidx];
                    s[sidx] = temp;

                    sidx++;
                    eidx--;
                }
                sidx = i + 1;
            }

            if (i == s.length - 1) {
                eidx = s.length - 1;
                while (sidx <= eidx) {
                    temp = s[eidx];
                    s[eidx] = s[sidx];
                    s[sidx] = temp;

                    sidx++;
                    eidx--;
                }
            }
        }
    }
}

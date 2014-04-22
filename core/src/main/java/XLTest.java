import org.xwiki.text.XWikiToStringBuilder;

//假如有字符串“6sabcsssfsfs33” ，用最有快速的方法去掉字符“ab3”，不能用java内置字符串方法（indeOf,substring,replaceAll等）？
public class XLTest {
    public static void main(String[] args) {
        String str1 = "6sabcsssfsfs33";
        String str2 = "ab3";
        String str = new XLTest().deleteChars(str1, str2);
        System.out.println(str);

        String src = new XLTest().toString();
        System.out.println(src);
    }

    public XLTest(){

    }

    @Override
    public String toString() {
        String[] str = new String[]{"sdfs","s123","a344"};
        int[] abc = {1,2,3};


        return new XWikiToStringBuilder(this).append("type","class").append("name", "hello").append("params",abc).toString();
    }

    String deleteChars(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int len1 = chars1.length;
        int len2 = chars2.length;
        boolean[] flag = new boolean[len1];
        for (int i = 0; i < len1; i++) {
            flag[i] = false;
        }
        for (int i = 0; i < len2; i++) {
            for (int j = 0; j < len1; j++) {
                if (chars2[i] == chars1[j]) {
                    flag[j] = true;
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < len1; i++) {
            if (flag[i] == false) {
                sb.append(chars1[i]);
            }
        }
        return sb.toString();
    }
}
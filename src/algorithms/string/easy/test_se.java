package algorithms.string.easy;

import algorithms.string.easy.binaryCompute;
import algorithms.string.easy.longestCP;
import algorithms.string.easy.validCharacter;

public class test_se {
    public static void main(String[] args) {
//        longestCP longestCP = new longestCP();
//        String[] s = new String[]{"flower","flow","flight"};
//        System.out.println(longestCP.longestCommonPrefix(s));

//        validCharacter validCharacter = new validCharacter();
//        String s = "(){]}[";
//        System.out.println(validCharacter.isValid(s));
//        System.out.println("".toCharArray()[0]);
//        binaryCompute binaryCompute = new binaryCompute();
//        String a = "1010";
//        String b = "1011";
//        System.out.println(binaryCompute.addBinary(a,b));
//        reverseVo reverseVo = new reverseVo();
//        String s = "hello";
//        System.out.println(reverseVo.reverseVowels(s));
//        System.out.println('2'+'5');
//        System.out.println(103/3+" "+103%3);
        compressStr compressStr = new compressStr();
        char[] s = new char[]{'a','a','b','b','c','c','c'};
        System.out.println(compressStr.compress(s));

    }
}

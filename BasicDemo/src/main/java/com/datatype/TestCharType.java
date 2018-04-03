package com.datatype;

/**
 * char字符是两个字节
 * String类，其实是字符序列
 * Boolean在内存中占的是一位，而不是一个字节
 *
 */
public class TestCharType {

	public static void main(String[] args) {
		char c1 = 'a';
        char c2 = '尚';   //unicode  2: 0-65535
        char c3 = '\n';
        System.out.print(c1);
        System.out.print(c3);//\n是换行
        System.out.println(c2);
        System.out.println('a'+'b');//195
        System.out.println(""+'a'+'b');//ab
	}
}

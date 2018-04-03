package com.datatype;

/**
 * （备注:1个字节8位）
 * 
 * 类型 	     占用存储空间       表数范围
 * byte		1个字节            -128~127
 * Short    2个字节            -32768~32767    正负3万
 * int      4个字节		-2147483648~2147483647   约21亿
 * long     8个字节
 */
public class TestDataType {

	  //Java语言的整型常数默认为int型，声明long型常量可以后加‘ l ’或‘ L ’
	  public static void main(String[] args){
		   long a = 55555555;  //不出错，在Int表示的范围内(21亿内)。
		 //long b = 55555555555;//不加L出错，已经超过int表示的范围。报错：
		   short b1 =30000;
		 //short b2 =40000;//超出short表示的范围报错
		   
		   int a1 = 15;
		   int a2 = 015;//以0开头的是八进制
		   int a3 = 0x15;//以0x开头的是十六进制
		   System.out.println(a1);
		   System.out.println(a2);
		   System.out.println(a3);
	  }
}

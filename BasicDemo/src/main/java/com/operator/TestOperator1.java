package com.operator;

/**
 * 整数运算：
 * 		如果两个操作数有一个为Long, 则结果也为long
 * 		没有long时，结果为int。即使操作数全为shot,byte，结果也是int.
 * 浮点运算：
 * 		如果两个操作数有一个为double, 则结果为double.
 * 		只有两个操作数都是float, 则结果才为float.
 * 取模运算:
 * 		运算结果的符号和左边的数一致
 * 		负数%负数＝负数； 
 * 		负数%正数＝负数； 
 * 		正数%负数＝正数；
 * 
 * 位运算符:
 * 	~ 取反   
 *  & 按位与      
 *  | 按位
 *  ^ 按位异或  
 *  << 左移运算符  左移一位相当于乘2。
 *  >> 右移运算符  右移一位相当于除2取商
 *  >>>无符号移位运算符
 */
public class TestOperator1 {

	public static void main(String[] args) {
		 int a = 3;
	     int b = a++;   //执行完后,b=3。先给b赋值，再自增。
	     int c = ++a;   //执行完后,c=5。先自增,再给b赋值
	     System.out.println("a:"+a);
	     System.out.println("b:"+b);
	     System.out.println("c:"+c);
	     
	     int a1 = 3*2*2;
	     int b1 = 3<<2;  //相当于：3*2*2;
	     int a2 = 12/2/2;
	     int b2 = 12>>2; //相当于: 12/2/2
	     System.out.println("a1："+a1);
	     System.out.println("b1："+b1);
	     System.out.println("a2："+a2);
	     System.out.println("b2："+b2);

	}
}

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
 *  
 *  
 *  
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

	     //x ? y : z
	     //其中 x 为 boolean 类型表达式，先计算 x 的值，
	     //若为true，则整个三目运算的结果为表达式 y 的值，否则整个运算结果为表达式 z 的值。
	     int score = 80; int x = -100;
	     String type = score < 60 ? "不及格" : "及格";
	     int flag = x > 0 ? 1 : (x == 0 ? 0 : -1);
	     System.out.println("type= " + type);
	     System.out.println("flag= "+ flag);

	}
}

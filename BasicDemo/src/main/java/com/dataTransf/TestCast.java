package com.dataTransf;
/**
 * 自动类型转换：容量小的数据类型可以自动转换为容量大的数据类型。
 * 特例: 可以将整型常量直接赋值给byte, short, char等类型变量，而不需要进行强制类型转换，只要不超出其表数范围
 *      Short  b = 12;         //合法
 *      short  b = 1234567;    //非法
 * long类型的可以转换位float或double，因为float或double表示范围比long大
 */
public class TestCast {

	public static void main(String[] args) {
		long a = 1231231L;
		float b = a;
		double c = a;
		
		int money = 1000000000;  //10亿
	    int years = 20;
	    int total = money*years;   //返回的是负数
	    long total1 = money*years;  //返回的仍然是负数。默认是int，因此结果会转成int值，再转成long。但是已经发生了数据丢失
	    long total2 = money*((long)years);   //先将一个因子变成long，整个表达式发生提升。全部用long来计算
	    System.out.println("total:"+total);//-1474836480
	    System.out.println("total1:"+total1);//-1474836480
	    System.out.println("total2:"+total2);//20000000000
	}
}

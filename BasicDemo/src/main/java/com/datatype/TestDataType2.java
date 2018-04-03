package com.datatype;

import java.math.BigDecimal;

/**
 * 浮点数使用总结：
	1.默认是double
	2.浮点数存在舍入误差，很多数字不能精确表示。
	    如果需要进行不产生舍入误差的精确数字计算，需要使用BigDecimal类。
	3.避免比较中使用浮点数
 *
 */
public class TestDataType2 {

	public static void main(String[] args) {
		//double d = 3.14;   //浮点数常量默认类型是double。
        //float f = 6.28F;
        double d2 = 314e-2;   //采用科学计数法的写法
        System.out.println(d2);
        
        System.out.println("===================浮点不精确不要用于比较=====================");
        float f = 0.1f;
        double d = 1.0/10;
        System.out.println(f==d);   //false
        
        float f1 = 423432423f;
        float f2 = f1+1;
        System.out.println(f1==f2);//居然是true，float不精确一定不要用于比较
        
        System.out.println("==================使用BigDecimal======================");
        
        BigDecimal bd = BigDecimal.valueOf(1);
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        System.out.println(bd);//0.5
        System.out.println(1-0.1-0.1-0.1-0.1-0.1);//0.5000000000000001
        
        BigDecimal bd1 = BigDecimal.valueOf(0.1);
        BigDecimal bd2 = BigDecimal.valueOf(1.0/10);
        System.out.println(bd1.equals(bd2));

        
        
	}
}

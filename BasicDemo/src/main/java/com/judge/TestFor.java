package com.judge;

public class TestFor {

	//99乘法表
	public static void main(String[] args) {
		//写嵌套循环时，先写一行或一列
        for(int n=1;n<=9;n++){
        	for(int m=1;m<=n;m++){
   	   		 System.out.print(m+"*"+n+"="+m*n+"\t");
   	   	 	}
        	System.out.println();
        }
	}
}

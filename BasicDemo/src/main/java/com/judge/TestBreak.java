package com.judge;

public class TestBreak {

	//当你需要从内循环跳到外循环时，使用带标签的break或continue
	//控制嵌套循环跳转(打印101-150之间所有的质数)
	public static void main(String[] args) {
		  outer: for (int i = 101; i < 150; i++) {
	            for (int j = 2; j < i / 2; j++) {
	                if (i % j == 0){
	                    continue outer;
	                }
	            }
	            System.out.print(i + "  ");
	        }
	}
}

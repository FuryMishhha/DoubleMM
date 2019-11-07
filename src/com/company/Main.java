package com.company;

public class Main {

    public static void main(String[] args) {
	int []a=new int[10];
	for(int i=0;i<10;i++){
	    a[i]=i*(i+1);
	    System.out.print(a[i]+ " ");
    }
	for (int i=0;i<10;i++){
		a[i]+=a[i]*2;
	}


    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	int []a=new int[10];
	for(int i=0;i<10;i++){
	    a[i]=i*(i+1);

    }
	for (int i=0;i<10;i++){
		a[i]+=a[i]*2;
	}
for(int i=0;i<5;i++){
	System.out.print(a[i]+3+" ");
}
		for(int i=5;i<10;i++){
			System.out.print(a[i]-3+ " ");
		}

    }
}

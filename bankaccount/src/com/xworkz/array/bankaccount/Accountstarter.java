package com.xworkz.array.bankaccount;

public class Accountstarter {

	public static void main(String[] args) {
		//bank account details
		long hdfc=501002644672020L;
		long sbi=37900291946L;
		long paytm=919108222564L;
		long phonepe=910822256491L;
		long razorpay=6360901879L;
		
		long[] accountdetails= {hdfc,sbi,paytm,phonepe,razorpay,232113448L,987654L,123456789L,321654987L};
		
		System.out.println(hdfc);
		System.out.println(sbi);
		System.out.println(phonepe);
		System.out.println(paytm);
		System.out.println(razorpay);
		long index1=accountdetails[5];
		System.out.println(index1);
		long index2=accountdetails[6];
		System.out.println(index2);
		long index3=accountdetails[7]; //account details
		System.out.println(index3);
		long index4=accountdetails[8];
		System.out.println(index4);
		
		
	}
}

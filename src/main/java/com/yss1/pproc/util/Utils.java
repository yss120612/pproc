package com.yss1.pproc.util;

public class Utils {
	public static boolean checkSNILS(String sn)
	{
		sn=sn.replaceAll("[\\-\\s]", "");
		if (sn.length()!=11) return false;
		return Integer.parseInt(sn.substring(9))==calcSNILS(sn);
	}

	public static int calcSNILS(String sn) {
		sn=sn.replaceAll("[\\-\\s]", "").substring(0,9);
		int otvet=0; 
		for (int i=8;i>=0;i--)
		{
			otvet=otvet+Integer.parseInt(sn.charAt(i)+"")*(9-i);
		}
		if (otvet>101) {
		otvet=otvet%101;
		}else if(otvet>99) {
			otvet=0;
		}
		return otvet;
	}
}
package cc.longApril;
/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class mexstr
{
    static void countCombo(String str, ArrayList<Integer> al){
		int count = 1;
		int n = str.length();
		char pvs = str.charAt(0);
		for (int i = 1; i<n; i++){
			if (str.charAt(i)==pvs){
				count++;
			}
			else {
				pvs = str.charAt(i);
				al.add(count);
				count=1;
			}
		}
		al.add(count);
	}

    static String getBinary(String str){
        ArrayList<Integer> al = new ArrayList<>();
		countCombo(str, al);
		if (al.size()==1){
			return ((str.charAt(0)=='0')?"1":"0");
		}
		int i = (str.charAt(0)=='0')?1:0;
		boolean skip = true;
		String res = "";
		char pvs = '0';
		int n = al.size();
		for (; i<n;i++){
			if (skip){
				if (al.get(i)>1){
					skip=true;
				}
				else {
					skip=false;
				}
				res = res + ((pvs=='0')?'1':'0');
				if (i==n-1&&al.get(i)==1){
					pvs = '0';
				}
				
			}
			else
			{
				if (al.get(i)>1){//||i==n-1
					skip = true;
				}
				else  {
					int count = 0;
					int index = i;
					while (index<n&&al.get(index)==1){
						index++;
						count++;
					}
					if (index<n){
						if ((count&1)==0){
							for (int j = 0; j<count/2; j++){
								res+=pvs;
							}
							
						}
						else {
							if (pvs=='0'&&index==n-1){
								pvs =  (pvs=='0')?'1':'0';
							}
							for (int j = 0; j<count/2+1; j++){
								res+=(pvs=='0')?'1':'0';
							}
							pvs = (pvs=='0')?'1':'0';
						}
						i = index; //might be +1
						skip = true;
					}
					else  {
						if ((count&1)==0){
							for (int j = 0; j<count/2; j++){
								res+='0';
							}

							break;
						}
						else  {
							for (int j = 0; j<count/2; j++){
								res+=pvs;
							}

						}
						i=index;
					}
				}
			}
			pvs = (pvs=='0')?'1':'0';
		}
		res = res + ((pvs=='0')?'1':'0');
		return res;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int testCase = s.nextInt();
		while (testCase-->0){
			String str = s.next();
			String res = getBinary(str);
			System.out.println(res);
		}
	}
}

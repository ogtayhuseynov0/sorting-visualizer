import javax.swing.JTextPane;

public class merging {
	static Swap S;
	JTextPane[] tt =Selection.chartArr;
	public merging(){
		
	}
	
	public static int [] mergesort(int[] b,	JTextPane[] tt){
		if(b.length <=1){
			return b;
		}

		int midpoint = b.length/2;
		int[] left = new int[midpoint];
		int[] right;
		if(b.length%2==0){
			right = new int[midpoint];
		}else{
			right = new int[midpoint+1];
		}
		int[] result = new int[b.length];
		for (int i = 0; i < midpoint; i++) {
			left[i]=b[i];
		}
		int x=0;
		for (int j = midpoint; j < b.length; j++) {
			if(x<right.length){
			right[x]=b[j];
			x++;
			}
		}
		left = mergesort(left,tt);
		right = mergesort(right,tt);
		
		result=merge(left,right,tt);
		
		return result;
	}
	
	public static int[] merge (int[] left, int[] right, JTextPane[] tt)
	{
		int lengRes =left.length+right.length;
		int[] result = new int[lengRes];
		int indexL=0;
		int indexR=0;
		int indexRes=0;
		
		while(indexL<left.length || indexR<right.length){
			if(indexL<left.length && indexR<right.length){
				if(left[indexL]<=right[indexR]){
					result[indexRes]=left[indexL];
					S=new Swap(tt[indexL],tt[indexRes]);
					tt[indexL] = tt[indexRes];
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					indexL++;
					indexRes++;
				}else{
					result[indexRes]=right[indexR];
					S=new Swap(tt[indexR],tt[indexRes]);
					tt[indexR] = tt[indexRes];;
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					indexR++;
					indexRes++;
				}
			}else if(indexL<left.length){
				result[indexRes]=left[indexL];
				indexL++;
				indexRes++;
			}
			else if(indexR<right.length){
				result[indexRes]=right[indexR];
				indexR++;
				indexRes++;
			}
		}
		return result;
		
	}
	
	
	
}

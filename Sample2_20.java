import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Sample2_20 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("請輸入5個人的分數");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[]test=new int[5];
		for(int i=0;i<test.length;i++) {
			String str=br.readLine();
			test[i]=Integer.parseInt(str);
		}
		for(int s=0;s<test.length;s++) {
			for(int t=s+1;t<test.length;t++) {
				if(test[s]<test[t]) {
					int temp=test[t];
					test[t]=test[s];
					test[s]=temp;
				}
			}
		}
		for(int i=0;i<test.length;i++) {
			System.out.println("第"+(i+1)+"名的分數是"+test[i]);
		}
	}

}

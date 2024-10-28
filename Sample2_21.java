import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.io.IOException;
public class Sample2_21 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("請輸入5個人的分數");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Integer test[]=new Integer[5];
		for(int i=0;i<test.length;i++) {
			String str=br.readLine();
			test[i]=Integer.parseInt(str);
		}
		Arrays.sort(test,Collections.reverseOrder());
		for(int i=0;i<test.length;i++) {
			System.out.println("第"+(i+1)+"個人的分數是"+test[i]);
			
		}
	}

}

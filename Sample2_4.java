import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Sample2_4 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("請輸入一個整數");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		if(num==1) {
			System.out.println("輸入的是1");
		}
		else if(num==2) {
			System.out.println("輸入的是2");
		}
		else {
			System.out.println("請輸1或2");
		}
	}

}

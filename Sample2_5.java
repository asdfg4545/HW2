import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Sample2_5 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("請輸入一個整數");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		switch(num){
		case 1:{
			System.out.println("輸入的是1");
			break;
		}
		case 2:{
			System.out.println("輸入的是2");
			break;
		}
		default:{
			System.out.print("請輸入1或2");
			break;
		}
		}
	}

}

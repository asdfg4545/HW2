import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Sample2_7 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("你是男生嘛?");
		System.out.println("請輸入Y或N?");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		char letter=str.charAt(0);
		if(letter=='Y'||letter=='y') {
			System.out.println("你是男生阿!");
		}
		else if(letter=='N'||letter=='n') {
			System.out.println("你是女生阿!");
		}
		else {
			System.out.println("請輸入Y或N!");
		}
	}

}

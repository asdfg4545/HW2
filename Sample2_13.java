import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Sample2_13 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("請輸入何時結束迴圈?(1~10)");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int res=Integer.parseInt(str);
		for(int i=1;i<=10;i++) {
			System.out.println("第"+i+"次迴圈");
			if(i==res) {
				break;
			}
		}
	}

}

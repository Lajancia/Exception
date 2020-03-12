import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
		try{
		System.out.print(">> ");
		String input = br.readLine();
		String a=input.trim().split(" ")[0];
		String b=input.trim().split(" ")[1];
		
		int c=Integer.parseInt(a);
		int d=Integer.parseInt(b);
		
		System.out.println(c+"x"+d+"="+c*d);
			
		break;
		}catch(IllegalArgumentException e){
				System.out.println("정수만 입력하세요.");
		}
		}
		
	}
}
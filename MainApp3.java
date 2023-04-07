package basic.dev;

import java.util.Scanner;
import java.util.Stack;

public class MainApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//2
		Stack<Integer> s = new Stack<>();
		System.out.println("Nhap vao phan tu muon in va xoa");
		int n = sc.nextInt();
		s.push(5);
		s.push(1);
		s.push(3);
		s.push(2);
		s.push(4);
		//a
		int sSoPhanTu = s.size();
		System.out.println("So phan tu cua stack la: " + sSoPhanTu);
		//b
		if (n <= s.size()) {
			int print = s.get(n - 1);
			System.out.println("Noi dung cua phan tu n la: " + print);
		}
		//c
		System.out.print("Stack s: ");
		for (int i = 0; i < s.size(); i++) {
			System.out.print(s.get(i) + " ");
		}
		//d
		System.out.println();
		s.remove(n - 1);
		System.out.print("Stack s sau khi xoa phan tu n: ");
		for (int i = 0; i < s.size(); i++) {
			System.out.print(s.get(i) + " ");
		}
	}

}
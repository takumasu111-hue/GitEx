package ex7_2;

import java.util.Scanner;

public class Report7_2 {
	// ビット演算を使って2つの整数の乗算を行うメソッド
	public static int multiply(int a, int b) {
		int result = 0;

		 // b の最下位ビットが 1（奇数）の場合、現在の a を result に加算
		while(b > 0) {
			if((b & 1) != 0) {
			   result = result + a;
		    }
			// b を右シフト（1/2、切り捨て）
		    a = a << 1;
			// b を右シフト（1/2、切り捨て）
		    b = b >> 1;
	}
	
	return result;
}

// 新しく追加した関数：x が 2 の累乗かどうか判定する
public static boolean isPowerOfTwo(int x) {
    // x が 0 以下なら false
     if (x <= 0) return false;

     // 2の累乗なら x & (x - 1) が 0 になる
     return (x & (x - 1)) == 0;
}

public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	System.out.println("2整数の乗算を行います。\n1つ目の整数:");
	int a = stdIn.nextInt();
	System.out.println("2つ目の整数:");
	int b = stdIn.nextInt();
	int result = multiply(a,b);
	System.out.println("答えは" + result + "です。");

	// 新しい関数の動作確認
	System.out.println(a + " は2の累乗ですか？ → " + isPowerOfTwo(a));
    System.out.println(b + " は2の累乗ですか？ → " + isPowerOfTwo(b));
}
}


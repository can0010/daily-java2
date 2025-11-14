//追加問題

//パッケージ名 day02
//クラス名 Lesson3.java

//3つの任意の整数をコンソールから入力し、税込み金額（消費税は8％計算）の合計を出しなさい。
//また、平均金額を求めなさい。
//キャストしてすべて整数値で求めること。
//【出力例】
//金額①を入力してください>>210
//金額②を入力してください>>300
//金額③を入力してください>>350
//①から③の合計は税込み928円
//①から③の平均は税込み309円

package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Lesson3 {

	public static void main(String[] args) throws IOException {

		//int sum = 0;// 合計金額
		//int average = 0;// 平均金額
		//int inputCount = 0;//入力した回数

		/*ここから記入*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("金額①を入力してください");
		String str = reader.readLine();
		
		System.out.println("金額②を入力してください");
		String str1 = reader.readLine();
		
		System.out.println("金額③を入力してください");
		String str2 = reader.readLine();
		
		int num = Integer.parseInt(str);
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		//消費税の定義
		float f =1.08f;
		
		//合計金額の算出
		int sum = (int)((num+num1+num2)*f);
		
		
		System.out.println("①から③の合計金額は税込み" + sum + "円");
		
		//平均金額の算出
		int average = (int)(((num*f)+(num1*f)+(num2*f)) / 3 );
		System.out.println("①から③の平均は税込み" + average + "円");
		

	}

}

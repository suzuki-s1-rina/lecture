package main.lecture;

import java.util.ArrayList;
import java.util.List;

public class HamsterMain {
	public static void main(String[] args) {

		/*
		 * ArrayListとは？
		 * Listを継承しているクラスのひとつ
		 * ArrayListの特徴は・順番通りに並べて格納する
		 *                  ・重複OK！
		 *                  ・nullOK!
		 */

		/*
		 * 配列との違い
		 * ・要素の数
		 *   List⇒要素の大きさは可変
		 *   配列⇒一度大きさを決めると、それ以降変更はできない
		 *
		 * ・宣言
		 *   List⇒基本データ型(プリミティブ型)は作成できない
		 *   配列⇒基本データ型(プリミティブ型)でも作成できる
		 *
		 */

		/*
		 * 宣言について
		 *
		 * 一般的にはList<型名> 変数名 = new ArrayList<>();で宣言する
		 *
		 * 注意・intのような基本データ型はListにできない（インスタンスを作れるものでないとListにできない）
		 *       intのListを作りたい場合は代替可能なクラスIntegerなどを使用する。
		 */
		// StringクラスのList
		List<String> names = new ArrayList<>();
		// ↑↓も同じ！java7以降では省略可能になった
		// List<String> names = new ArrayList<String>();

		// HamsterクラスのList
		List<Hamster> hams = new ArrayList<>();

		/*
		 * メソッドが使えるのはなんで？⇒ArrayList自体がクラスで、そこにメソッドが定義されているから！
		 */

		/*
		 * addについて
		 * list.add(要素)
		 * 要素の一番最後に挿入される
		 */
		// Stringのadd
		names.add("ハム太郎");
		String hamName = "浩志君";
		names.add(hamName);
		names.add("タイショーくん");

		// Hamsterのadd
		Hamster ham1 = new Hamster("マフラーちゃん", 4);
		hams.add(ham1);

		Hamster ham2 = new Hamster("ちびハムちゃん", 5);
		hams.add(ham2);

		hams.add(new Hamster("まいどくん", 3));

		// ↓はNG 理由：hamsインスタンスの方はList<Hamster>のため、Stringは入れられない。
		// hams.add("りぼんちゃん");

		/*
		 * getについて
		 * list.get(要素番号)
		 * 要素番号にある要素を取り出す
		 */
		// Stringの取り出し
		System.out.println(names.get(0));
		// Hamsterの取り出し
		System.out.println(hams.get(0));


		System.out.println(hams.get(0).getName());
		//hams.add();

		System.out.println(names.get(1));

		/*
		 * removeについて
		 * list.remove(要素番号)
		 * 要素番号にある要素を削除する
		 * 消した以降の要素を前に詰めてコピーする
		 */
		hams.remove(1);

		/*
		 * sizeについて
		 * sizeは要素数を取り出すArrayListのメソッド
		 */
		System.out.println(hams.size());
		hams.add(new Hamster("とらはむちゃん", 4));
		System.out.println(hams.size());

		/*
		 * for文について
		 */
		// List<String>のループ
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		// List<Hamster>のループ
		for (int i = 0; i < hams.size(); i+=2) {
			System.out.println(hams.get(i).getName());
		}

		/*
		 * 拡張for文について
		 */
		// List<String>のループ
		for (String name : names) {
			System.out.println(name);
		}

		// List<Hamster>のループ
		for (Hamster ham : hams) {
			System.out.println(ham.getName());
		}

	}
}

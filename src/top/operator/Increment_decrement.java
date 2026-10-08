package top.operator;

public class Increment_decrement {

	public static void main(String args[]) {

		int i = 60;

		i--; // 59
		i++; // 60
		--i; // 59

		System.out.println(--i+5); // 63

		++i; // 59
		--i; // 58
		System.out.println(i-- +6);// 64

		++i; // 58
		i--; // 57
		System.out.println(i++ -2);// 55

		i--; // 57
		i++; // 58
        ++i; //59
        --i; //58
		System.out.println(++i -2);// 57

	}

}

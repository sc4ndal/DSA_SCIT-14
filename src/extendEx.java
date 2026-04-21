class Animal {
	int num = 19;
}

class Po extends Animal {
	public Po() {
		num++;
	}
}

class Tiger extends Po {
	public Tiger() {
		num++;
	}
}

public class extendEx {
	public static void main(String[] args) {
		Po po = new Po();
		System.out.println(po.num);
		
		System.out.println("tiger");
		Tiger ti = new Tiger();
		System.out.println(ti.num);
	}

}

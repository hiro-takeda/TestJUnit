package test;

public class Car {
	//車種名
	String carName;
	//燃料
	int fuel;

	//給油
	void oiling() {
		this.fuel = 80;
		System.out.println(this.carName + "は、ガソリンスタンドで給油した。");
	}

	//走行距離
	void distance(int km) {

		//1kmで消費する燃料
		int num = km / 10;

		//給油した燃料から消費した燃料を算出
		this.fuel -= num;
		System.out.printf("%dkm走って、%dLのガソリンを消費した。\r\n", km, num);
		System.out.printf("残りの燃料は%dLです。\r\n", this.fuel);
	}
}

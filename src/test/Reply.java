package test;

/**
 * 東京実習中においしかった日付を聞いて、
 * その内容を返す。
 * @author H.Takeda
 */
public class Reply {
	//何日目(1~3)の昼食がおいしかったか聞く
	int lunchDay;
	//何日目(1~3)の夕食がおいしかったか聞く
	int dinnerDay;

	//食事内容
	String[] lunch = {"豚骨ラーメン","サンドイッチ","山食カレー"};
	String[] dinner = {"唐揚げカツ","寿司","マック？"};

	void favorite() {
		if(lunchDay <4 || dinnerDay <4) {
			System.out.println("東京には３日しか行ってないよ！！");
		}else {
			System.out.printf("あなたが好きだった昼食は%sでした！\n", lunch[lunchDay-1]);
			System.out.printf("あなたの好きだった夕食は%sでした？\n", dinner[dinnerDay-1]);
		}
	}

}

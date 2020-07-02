public class TestD {
	
	public static boolean isStraightLine(float [] ... point) {
		if(point.length <= 1) {
			common.Assert(point.length > 1, "test D 파일 , isStraightLine 함수 Assert 점이 1개 이하 일땐 비교할 수 없다.");
			return false; // 점이 1개일땐 비교할 수 없다.
		}
		float[] slope = new float[point.length];
		float [] temp = {};
		boolean result = false;
		
		for (int i = 0; i < point.length; i++) {
			temp = point[i]; // 값을 꺼내기 위해 잠시 temp 에 저장
			slope[i] = temp[0] / temp[1]; // 기울기 구하기
			if (i == 0) continue; // 처음엔 비교할수 없다.
			result = (slope[i]==slope[i-1]); // 점과 점을 이었을때 기울기가 같으면 직선상에 위치해있다고 볼수 있다.
			if(!result) return false; // 하나라도 false 나오면 false를 리턴한다.
		}
		return true;
	}

	public static void main(String[] args) {
		float[] array = {1,2}; 
		float[] array2 = {2,4};
		float[] array3 = {3,6}; 
		float[] array4 = {47,8}; 
		System.out.println(isStraightLine(array,array2,array3,array4));
	}
}


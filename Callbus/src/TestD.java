public class TestD {
	
	public static boolean isStraightLine(float [] ... point) {
		if(point.length <= 1) {
			common.Assert(point.length > 1, "test D ���� , isStraightLine �Լ� Assert ���� 1�� ���� �϶� ���� �� ����.");
			return false; // ���� 1���϶� ���� �� ����.
		}
		float[] slope = new float[point.length];
		float [] temp = {};
		boolean result = false;
		
		for (int i = 0; i < point.length; i++) {
			temp = point[i]; // ���� ������ ���� ��� temp �� ����
			slope[i] = temp[0] / temp[1]; // ���� ���ϱ�
			if (i == 0) continue; // ó���� ���Ҽ� ����.
			result = (slope[i]==slope[i-1]); // ���� ���� �̾����� ���Ⱑ ������ ������ ��ġ���ִٰ� ���� �ִ�.
			if(!result) return false; // �ϳ��� false ������ false�� �����Ѵ�.
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


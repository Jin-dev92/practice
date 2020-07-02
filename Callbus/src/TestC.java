public class TestC {
	final static int numberLimit = 9; // ���� �ٲ�� �ٲ�� �����Ƿ�
	final static int[] eachlength = {2,2,1,4}; //���� ��ȣ �ڸ��� ����
	public static boolean isRightCarNumFormat(String carNum) {
		if (carNum.length() != numberLimit) {
			common.Assert(carNum.length() == numberLimit, "TestC ���� , isRightCarNumFormat �Լ�  Assert :: �ùٸ��� ���� �� ��ȣ�Դϴ�.");
			return false; // 
		}
		String first = carNum.substring(0,eachlength[0]); // ���� 2�ڸ�������
		String second = carNum.substring(eachlength[0], eachlength[0] + eachlength[1]); //���� 2�ڸ�������
		String third = carNum.substring(eachlength[0] + eachlength[1], eachlength[0] + eachlength[1] + eachlength[2]); // ���� 1�ڸ�������
		String forth = carNum.substring(eachlength[0] + eachlength[1] + eachlength[2], eachlength[0] + eachlength[1] + eachlength[2] + eachlength[3]); //���� 4�ڸ������� �ٵ��� �ʿ䰡�ִ�.
		return (!isInteger(first) && isInteger(second) && !isInteger(third)  && isInteger(forth));
	}
	
	public static boolean isInteger(String target) { //
		try {
			Integer.parseInt(target);
			return true;
		} catch (NumberFormatException e){		
			return false;
		}		
	}
	


	public static void main(String[] args) {
		String aa = "����12��8427";
		System.out.println(isRightCarNumFormat(aa));
	}
}

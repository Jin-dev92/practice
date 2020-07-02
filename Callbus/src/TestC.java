public class TestC {
	final static int numberLimit = 9; // 법이 바뀌면 바뀔수 있으므로
	final static int[] eachlength = {2,2,1,4}; //차량 번호 자르는 단위
	public static boolean isRightCarNumFormat(String carNum) {
		if (carNum.length() != numberLimit) {
			common.Assert(carNum.length() == numberLimit, "TestC 파일 , isRightCarNumFormat 함수  Assert :: 올바르지 않은 차 번호입니다.");
			return false; // 
		}
		String first = carNum.substring(0,eachlength[0]); // 문자 2자리여야함
		String second = carNum.substring(eachlength[0], eachlength[0] + eachlength[1]); //숫자 2자리여야함
		String third = carNum.substring(eachlength[0] + eachlength[1], eachlength[0] + eachlength[1] + eachlength[2]); // 문자 1자리여야함
		String forth = carNum.substring(eachlength[0] + eachlength[1] + eachlength[2], eachlength[0] + eachlength[1] + eachlength[2] + eachlength[3]); //숫자 4자리여야함 다듬을 필요가있다.
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
		String aa = "서울12가8427";
		System.out.println(isRightCarNumFormat(aa));
	}
}

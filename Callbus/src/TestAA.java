import java.util.stream.IntStream;

public class TestAA {
	final static int[] dayList = {0,1,2,3,4,5}; // ����, �Ͽ����� ������ ���� ����ȴ�.
	final static int[][] timeList = {
			{0,1,2,3,23},
			{0,1,2,3,23},
			{0,1,2,3,22,23},
			{0,1,2,3,23},
			{0,1,2,3,23},
			}; //���Ϻ� ����ð�
	
	public static boolean isServiceTime(int day, int hourOfDay) {
		boolean dayContains = IntStream.of(dayList).anyMatch(x -> x == day); // day�� daylist�� �ִ���..?
		if(dayContains == false) {
			common.Assert(dayContains, "�ùٸ��� ���� �����̰ų� �������� ���� ���Դϴ�.");
			return false;
		}
		boolean hourContains = IntStream.of(timeList[day]).anyMatch(x -> x == hourOfDay); // day�� timeList�� �ִ���..?
		return hourContains;
    }

    
    public static void main(String[] args) {
    	System.out.println(isServiceTime(2,22));
	}
    
}

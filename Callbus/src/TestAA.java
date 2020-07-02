import java.util.stream.IntStream;

public class TestAA {
	final static int[] dayList = {0,1,2,3,4,5}; // 요일, 일요일을 제외한 매일 운행된다.
	final static int[][] timeList = {
			{0,1,2,3,23},
			{0,1,2,3,23},
			{0,1,2,3,22,23},
			{0,1,2,3,23},
			{0,1,2,3,23},
			}; //요일별 운행시간
	
	public static boolean isServiceTime(int day, int hourOfDay) {
		boolean dayContains = IntStream.of(dayList).anyMatch(x -> x == day); // day가 daylist에 있는지..?
		if(dayContains == false) {
			common.Assert(dayContains, "올바르지 않은 요일이거나 운행하지 않은 날입니다.");
			return false;
		}
		boolean hourContains = IntStream.of(timeList[day]).anyMatch(x -> x == hourOfDay); // day가 timeList에 있는지..?
		return hourContains;
    }

    
    public static void main(String[] args) {
    	System.out.println(isServiceTime(2,22));
	}
    
}

package spring.aop.entity;

public class NewlecExam implements Exam {
	
	// ctrl + shift + o 쓰지않는 패키지 임포트 삭제
	private int kor ;
	private int eng ;
	private int math;
	private int com;
	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public NewlecExam(int kor, int eng, int math, int com) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}

	public NewlecExam() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NewlecExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
//		long start = System.currentTimeMillis();
		int result = kor + eng + math + com;
		if (kor > 100) {
			throw new IllegalArgumentException("점수가 100점은 넘을수 없지");
		}
//		try {
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		long end = System.currentTimeMillis(); // 현재 시간 불러오는 메소드
//		String message = (end - start) + " ms 시간 걸렸습니다.";
//		System.out.println(message);
		return result;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		float result = total() / 4.0f;
		return result;
	}

}

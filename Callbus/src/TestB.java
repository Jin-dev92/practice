public class TestB {
	public static String compress(String any) {
        String result = "";
        int number = 0;
        String[] temp = any.split("");
        
        for (int i = 0; i < temp.length-1; i++) {
        	number++;
			if (!temp[i].equals(temp[i+1])) {
				result = result + number + temp[i];
				number = 0;
			}
		}
        return result;
	}
	
	public static String decompress(String compressed) {
		String result = "";
		String[] temp = compressed.split("");
		String[] numberic = new String[temp.length];
		boolean continuity = false;
		
		for (int i = 0; i < temp.length; i++) {
			if (Character.isDigit(temp[i].charAt(0))) { //숫자이면
				continuity = Character.isDigit(temp[i+1].charAt(0))? true : false; // 숫자가 연속된다면 continuity를 true로 준다
				if (continuity == false) {
					
				}else { // 숫자가 연속되었을때 이전 숫자(String) 뒤에 연속된 숫자를 붙힌다.
					numberic[i-1] = numberic[i-1] + temp[i];
				}	
			}else { // 문자열이면 numberic에 저장된 숫자만큼 알파벳을 뿌린다. 미완성..
//				stringArray[i] = temp[i];
				System.out.println(numberic[i]);

//			}
		}
		}
		return result;
	}
	public static void main(String[] args) {
		String any = "ZZZAAAAAAAAAABBCCQAA";
		String compressed = "3Z10A2B2C185A";
//		System.out.println(compress(any));
		System.out.println(decompress(compressed));


		
	}
}
	
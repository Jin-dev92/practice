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
			if (Character.isDigit(temp[i].charAt(0))) { //�����̸�
				continuity = Character.isDigit(temp[i+1].charAt(0))? true : false; // ���ڰ� ���ӵȴٸ� continuity�� true�� �ش�
				if (continuity == false) {
					
				}else { // ���ڰ� ���ӵǾ����� ���� ����(String) �ڿ� ���ӵ� ���ڸ� ������.
					numberic[i-1] = numberic[i-1] + temp[i];
				}	
			}else { // ���ڿ��̸� numberic�� ����� ���ڸ�ŭ ���ĺ��� �Ѹ���. �̿ϼ�..
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
	
# 텍스트 데이터 - 사람이 쉽게 읽을 수 있는 형식의 데이터 * 용량이 큼
# 바이너리 데이터 - 사람이 쉽게 읽을 수 없는 형식의 데이터 * 용량이 적습니다.
# 텍스트 데이터의 종류 - ASCII , UTF-8, UTF-16 , EUC-KR , Shift-JIS
# 바이너리 데이터의 종류 - JPEG, PNG , GIF

# 인코딩 (encoding) - A 라는 형식을 B라는 형식으로 변환하는 것
# 디코딩 (decoding) - 인코딩의 반대


# 인터넷으로 이미지 저장하기
# 파일을 열 때 뒤에 b를 붙혀주면 된다. rb - 파일을 읽음 wb - 파일을 써줌

# http://hanbit.co.kr/images/common/logo_hanbit.png

from urllib import request

#urlopen 함수로 구글의 메인 페이지 읽기
target = request.urlopen("http://hanbit.co.kr/images/common/logo_hanbit.png")
output = target.read()
# print(output)
file = open("output.png","wb")
file.write(output)
file.close()
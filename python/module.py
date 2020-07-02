#   모듈 사용법
#   import 모듈 이름
#   모듈의 종류
#       1. import math 수학 공식에 관련된 함수를 가져와 사용 가능
#       2. import random 랜덤
#       3. import sys 시스템
#       4. import os  운영 체재
#       5. import  datetime 시간 불러오는 거
#       6. import time time.sleep(초) 코드진행을 '초' 만큼 멈춤

#   from 구문 - 여러번 쓸거같은 함수들 편하게 쓰기 위해 만든 명령어
#   from 모듈 이름 import 가져오고 싶은 변수 또는 함수
#   from 모듈 as 사용하고 싶은 식별자 - 모듈 이름이 길어질 때 사용한다.

#EX)
# from math import sin,cos,tan,floor
# from math import * : 모두 가져오기 식별자 충돌 조심!

# print(sin(1))
# print(floor(10.123123))

#rand EX)
# random() = 0.0 ~ 1.0사이 랜덤
# uniform(x,y) x,y 사이 랜덤
# randrange(x) 0 ~ x 사이 랜덤
# randrange(min , max) min ~ max 랜덤
# choice(list) 리스트 내부에 있는 요소 랜덤 선택
# shuffle(list) 리스트의 요소들을 랜덤하게 섞습니다.
# sample(list,k=<숫자>): 리스트의 요소 중에 k개를 뽑습니다
# sample ex) random.sample([1,2,3,4,5],k=2)

# sys EX)

# import sys

# print("sys.argv : " , sys.argv)

# # 컴퓨터 환경과 관련된 정보 출력
# print("getwindowsversion: ", sys.getwindowsversion())

# os EX)
# import os

# # 운영 체재 기본 정보
# print("현재 운영 체재 : " , os.name)
# print("현재 폴더 :", os.getcwd())
# print("현재 폴더 내부의 요소 : ", os.listdir())

# # 폴더를 만들고 제거합니다.[폴더가 비어있을 때만 사용 가능]
# os.mkdir("hello") # 만들기
# os.rmdir("hello") # 제거하기

# # 파일 생성하고 + 파일 이름을 변경합니다.
# with open("original.txt","w") as file:
#     file.write("hello")
# os.rename("original.txt","new.txt") # 파일 이름 변경

# # 파일을 제거합니다.
# os.remove("new.txt")
# #os.unlink("new.txt")

# #시스템 명령어 실행
# os.system("dir")

# dat EX)

# import datetime
# now = datetime.datetime.now()

# # 특정 시간 이후의 시간 구하기
# print("#datatime.timedelta 로 시간 더하기")
# after = now+datetime.timedelta(
#     weeks=1,
#     days=1,
#     hours=1,
#     minutes=1,
#     seconds=1)

# print(after.strftime("%Y{} %m{} %D{} %H{} %M{} %S{}").format(*"년월일시분초"))
# print()

# print("#now.replace()로 1년 더하기")
# output = now.replace(year=(now.year + 1))
# print(output.strftime("%Y{} %m{} %D{} %H{} %M{} %S{}").format(*"년월일시분초"))


# 350p 모듈 만들기

# 별 다를 거 없이 그냥 파이선 파일에 함수 잔뜩 만들어주면 된다.
# test_module.py 모듈 예제 참조

# import test_module as test

# radius = test.number_input()

# print(test.get_circumference(radius))
# print(test.get_circle_area(radius))

# print(__name__)
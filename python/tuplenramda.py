# tuple_test = 10,20,30,40
# print("tuple_test : ",tuple_test)
# print("tuple_test 타입 : ",type(tuple_test))

#괄호가 없는 튜플 활용
# a,b,c = 10,20,30

# 튜플 교환
# a,b = 10 ,20 
# print("교환 전 " ,a,b)
# a,b = b,a
# print("교환 후 " ,a,b)

# 람다

# def call_10_times(func): # 매개변수로 함수를 전달
    # for i in range(10):
        # func()

# def print_hello():
    # print("안녕하세요")

# call_10_times(print_hello)    

# filter(), map() 함수
# map(함수, 리스트) , filter(함수,리스트)
# lamda 매개변수 : 리턴값

# power = lambda x : x**2
# under_3 = lambda x : x < 3

# list_input = [1,2,3,4,5]

# map_a = map(power,list_input) # 함수를 적용하여 리스트 재구성
# filter_a = filter(under_3,list_input) # 필터 작용 , true인 것들로 리스트 재구성


# 파일 처리
# 파일 객체 = open(문자열: 파일 경로, 문자열 : 읽기 모드) # 읽기 모드 w(write 모드),a(append 모드), r (read 모드)
# 파일 객체.close() 파일 닫기

# file = open("basic.txt","w")
# file.write("hello python programming!")

#파일을 닫습니다.
# file.close()

# with 키워드 - 파일을 열고 닫지 않는 실수때문에 생긴 키워드 
# with open (문자열: 파일 경료, 문자열: 모드) as 파일 객체 : 문장

# 파일을 엽니다
# with open("basic.txt","r") as file: 
    # 파일에 택스트를 씁니다.
    # content = file.read()
    # print(content)

# 텍스트 한줄 씩 읽기 (CSV , XML , JSON)
# import random

# # 간단한 한글 리스트 만들기
# hanguls = list("가나다라마바사아자차카타파하")
# # 파일을 쓰기 모드로 엽니다.
# with open("info.txt","w") as file:
#     for i in range(1000):
#         # 랜덤값으로 변수를 생성
#         name = random.choice(hanguls)+ random.choice(hanguls)
#         weight = random.randrange(40,100)
#         height = random.randrange(140,200)
#         # 텍스트를 씁니다.
#         file.write("{},{},{}\n".format(name,weight,height))


#268p 연습문제
# 1.
# numbers = [1,2,3,4,5,6]

# print("::".join(str(numbers)))
# print("::".join(map(str,numbers)))


#2. 
numbers = list(range(1,10 + 1))

print("#홀수만 추출하기")
print(list(filter(lambda x: x%2==1 , numbers)))
print()

print("#3 이상, 7 미만 추출하기")
print(list(filter(lambda x: 3<=x<7 , numbers)))
print()

print("# 제곱해서 50 미만 추출하기")
print(list(filter(lambda x: x**2 < 50 , numbers)))
print()


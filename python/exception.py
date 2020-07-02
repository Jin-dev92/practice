## 1. 문장 오류 (syntax error) 단순 오타
## 2. 프로그램 실행 중 나타나는 오류 - 런타임 오류 or 예외

## 예외 처리
## -- 조건문을 사용하는 방법
## -- try 구문을 사용하는 방법

# 조건문으로 예외 처리하기

# user_input_a = input("정수입력> ")

# 사용자 입력이 숫자로만 구성되어 있을 때
# if user_input_a.isdigit():
#     number_input_a = int(user_input_a)
#     # 출력합니다.
#     print("원의 반지름 : ",number_input_a)
#     print("원의 둘레 : ", 2 * 3.14 * number_input_a)
#     print("원의 넓이 : ", 3.14 * number_input_a * number_input_a)
# else:
#     print("정수로만 입력해주세요")


# try:
    # number_input_a = int(input("정수 입력 > ")) # 예외가 발생할수도 있는 구문

# except :
    # print("뭔가 잘못되었습니다.")
    # pass

# 예제 2
# list_input_a = ["52","4252","23","134","dasd"]

# list_number = []

# for item in list_input_a:
#     #숫자로 변환해서 리스트에 추가.
#     try:
#         float(item)
#         list_number.append(item)
#     except :
#         pass

# print("{}".format(list_number))

# try except else 구문

# try:
#     예외가 발생할 가능성이 있는 코드
# except :
#     예외가 발생했을 때 실행할 코드
# else:
#     예외가 발생하지 않았을 때 실행할 코드

#--------------------------------------------
# try:
#     예외가 발생할 가능성이 있는 코드
# except :
#     예외가 발생했을 때 실행할 코드
# else:
#     예외가 발생하지 않았을 때 실행할 코드
# finally:
#     무조건 실행할 코드

# 예제 3
# try:
#     #파일을 엽니다.
#     file = open("info.txt","w")
#     #여러 가지 처리를 수행합니다.
#     #파일을 닫습니다.
#     file.close()
# except Exception as e:
#     print(e)

# print("#파일이 제대로 닫혔는지 확인하기")

# print("file.closed: ",file.closed)

# 예제 4 try 구문 내부에서 return 키워드를 사용하는 경우
def test(filename,txt):
    print("test() 처음")

    try:
        print("try 구문이 실행 되었습니다")
        file = open(filename,"w")
        return
        print("return 뒤")
        file.write(txt)
    except Exception as e:
        print(e)
    finally:
        print("finally 구문")
        file.close()
    # print("test( 마지막)")
    test("test.txt","안녕하세요")

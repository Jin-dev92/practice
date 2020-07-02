# 데코레이터의 종류
#   - 함수 데코레이터
#   - 클래스 데코레이터

# # 데코레이터의 기본
# def test(func):
#     def wrapper():
#         print("인사가 시작되었습니다.")
#         func()
#         print("인사가 종료되었습니다.")
#     return wrapper

# # 데코레이터를 붙혀 함수를 만듭니다.
# @test
# def hello():
#     print("hello")

# # 함수 호출
# hello()    


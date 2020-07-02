# 피보나치 수열 - 재귀함수 조심해서 사용할것

# counter = 0 

# def finobonachi(n):
#     print("fibonachi({}) 를 구합니다. ".format(n))
#     global counter
#     counter += 1
    
#     if n == 1:
#         return 1
#     elif n == 2:
#         return 1
#     else:
#         return finobonachi(n - 1) + finobonachi(n - 2)

# finobonachi(10)        

# print("-----")
# print("피보나치 10에 계산에 사용되는 횟수는 {}번".format(counter))

# 메모화 (재귀 함수 사용할 때 꼭 사용해줌 처리속도가 매우 빨라진다.)
memo = {
    1:1,
    2:2
}
def fibonacchi(n):
    if n in memo:
        return memo[n]
    else:
        output = fibonacchi(n-1) + fibonacchi(n-2)
        memo[n] = output ## 메모에 함수값을 저장해둔다. ## 메모화
        return output

print(fibonacchi(50))

# 확인 문제 
# 1. 
# def flatten(data):
#     if data == None :
#         return        
#     for i in data:
#         # data_type = type(i)
#         # print(type(i))
#         if type(i) == list:
#             for j in i:
#                 if type(j) == list:
#                     i.remove(j) # 기존 리스트에서 변환 된 부분(중복) 삭제
#                     data.append(j) # 변환된 부분 기존 데이터에 삽입
#     return data                    

# example = [[1,2,3],[4,[5,6]],7,[8,9]]
# # print("원본 : ", example)
# print("변환 : ", flatten(example))


# 확인 문제 2 

# MIN = 2 # 앉힐수있는 최소 사람 수
# MAX = 10 # 앉힐수있는 최대 사람 수
# PERSON = 100 # 사람 수 

# memo = {}

# def method(left , setted):
#     key = str([left, setted])
#     if key in memo:
#         return memo[key]
#     if left < 0:
#         return 0
#     if left == 0:
#         return 1
#     # 재귀 처리
#     count = 0 
#     for i in range(setted , MAX + 1):
#         count += method(left - i ,i)
#     memo[key] = count


# print(method(PERSON,MIN))


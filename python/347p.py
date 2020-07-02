# 연습문제 1.
# python prime module
# - primePy



# print(primes.between(100,1000)) # m 과 n 사이 모든 소수 리턴
from primePy import primes
prime_list = primes.between(100,1000) # m 과 n 사이 모든 소수 리턴
count = 0
for prime in prime_list:
    count = count + 1

print(count)
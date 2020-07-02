max = 0 
number = 100
a= 0
b= 0
for i in range(0,number):
    mul = i * (number - i)
    if max < mul:
        max = mul
        a = i
        b = number - i

print("{}와 {}의 곱일 때 최대값 {}가 나옵니다".format(a,b,max))

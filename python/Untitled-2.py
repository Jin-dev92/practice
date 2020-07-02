#188p-3

sum = 0
a = 0
limit = 10000

while sum < limit:
    sum = sum + a
    a = a + 1
    if sum > limit:
        print("{}를 더할 떄 {}을 넘으며 그떄의 값은 {}입니다.".format(a,limit,sum))
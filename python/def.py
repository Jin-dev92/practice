def test(a,b=10,c=100):
    print(a)
    print(b)
    print(c)

# test(10,20,30)   
# test(10)
# test(c=10,b=59)

# def f(x) :
    # return 2*x + 1
# def f(x):
    # return x**2 + 2*x + 1 
# print(f(10))

def mul(*value):
    total = 1
    # print(type(value)) class tuple
    for number in value:
        # print(number)
        total = total * number        
    return total

print(mul(5,7,9,10))


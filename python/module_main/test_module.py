PI = 3.141592

def number_input():
    output = input("숫자 입력 >")
    return float(output)

def get_circumference(radius):
    return 2 * PI * radius

def get_circle_area(radius):
    return PI * radius  *   radius
# print("모듈의 name 출력")
# print(__name__)

# __name__ 사용의 예
if __name__ == "__main__":
    print("get_circumference(10) : ", get_circumference(10))
    print("get_circle_area(10) : ", get_circle_area(10))
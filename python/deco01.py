import math

# 클래스를 선언합니다

class Circle:
    # 게터와 세터를 선언
    @property
    def radius(self):
        return self.__radius # 외부에서 접근하지 못하게 하기 위해선 변수 앞에 __를 붙힌다.
    @radius.setter # 클래스에서 생성된 private 변수를 외부에서 사용하기 위해 setter 와 getter를 사용한다.
    def radius(self,value):
        if value <= 0:
            raise TypeError("길이는 양수여야만합니다.")
            self.__radius = value

print("데코레이터를 사용한 Getter 와 Setter ")
circle = Circle(10)

print("원래 원의 반지름 :" , circle.radius)
circle.radius = 2
print("변경된 원의 반지름 : ", circle.radius)
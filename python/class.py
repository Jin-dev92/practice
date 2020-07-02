## 클래스
##  클래스 선언 - class 클래스명:

## 예시
# class Student : ## 클래스명 은 카멜 케이스로
    # pass

# 학생을 선언
# student = Student()


# students = [
#     Student(),
#     Student(),
#     Student(),
# ]

## 생성자 - 클래스 이름과 같은 함수
# class 클래스이름 : - 객체를 생성할 때 처리할 내용을 작성할 수 있다.
    # def __init__(self,추가적인 매개변수)

# class Student :
#     def __init__(self,name,korean,math,english,science):
#         self.name   = name
#         self.korean =   korean
#         self.math   =   math
#         self.english    = english
#         self.science    = science

# students= [
#     Student("윤인성",93,21,34,65),
#     Student("윤2성",93,21,34,65),
#     Student("윤3성",93,21,34,65),
#     Student("윤4성",93,21,34,65),
# ]            

# 소멸자 - 생성자의 반대 인스턴스가 소멸될 때 호출되는 함수
# class Test:
#     def __init__(self,name):
#         self.name = name
#         print("{} -생성".format(self.name))
#     def __del__(self):
#         print("{} -파괴".format(self.name))

# test = Test("a")

# 클래스 - 객체를 쉽고 편리하게 생성하기 위해 만들어진 구문
# 인스턴스 - 클래스를 사용하여 생성한 객체
# 생성자 - 클래스 이름과 같은 인스턴스를 생성할 때 만드는 함수
# 메소드 - 클래스가 갖고 있는 함수


# isinstance() 의 활용
# 학생 클래스를 선언합니다
# class Student:
#     def study(self):
#         print("공부를 합니다.")
#         pass
#     pass

# class Teacher():
#     def teach(self):
#         print("학생을 가르칩니다.")
#         pass
#     pass

# # 교실 내부의 객체 리스트를 생성합니다.
# classroom = [Student(),Student(),Teacher(),Student(),Student()]

# for person in classroom:
#     if isinstance(person,Student):
#         person.study()
#         pass
#     elif isinstance(person,Teacher):
#         person.teach()
#         pass
#     pass

# 클래스 변수와 메소드
# class 클래스 이름 :
#     클래스 변수 = 값

# 클래스 변수에 접근하기
#     클래스 이름.변수 이름

## 외부에서 클래스 변수에 접근할 때 Student.count 이런식으로 접근.
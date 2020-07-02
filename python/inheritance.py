# 상속 
class Parent:
    def __init__(self):
        self.value = "테스트"
        print("parent 의 init 실행")
        pass
    def test(self):
        print("parent 의 test( 메소드")
        pass

class Child(Parent): ## 상속받음.
    def __init__(self):
        Parent.__init__(self)
        print("Child 클래스의 __init()__ 메소드 호출")
    pass

child = Child()
child.test()
print(child.value)
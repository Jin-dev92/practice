import os

# 현재 폴더의 파일/폴더를 출력합니다.

# root = os.listdir(".")
# # print(root)

# # 현재 폴더의 파일/폴더를 구분합니다.
# for path in root:
#     if os.path.isdir(path):
#         print("폴더: ",path)
#     else:
#         print("파일: ",path)
def read_folder(path):
    # 폴더의 요소 읽어 들이기
    output = os.listdir(path)
    #폴더의 요소 구분하기
    for item in output:
        if os.path.isdir(item): ## 폴더라면 계속 읽기
            read_folder(item)
        else: ## 파일이라면 출력하기
            print("파일 :", item)

read_folder(".")            
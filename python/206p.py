# 206p 2번
# output = []

# for i in range(1,100):
#     binary_output = "{:b}".format(i) # 2진법으로 변환
#     print("{} : {}".format(i,binary_output))
#     # print(type(binary_output.count("0")))
#     if binary_output.count("0") == 1:
#         # binary_output = output
#         output.append(binary_output)
#     #  print(output)
#     # print("합계 : " , sum(output))
output = [i for i in range(1,100 + 1) if "{:b}".format(i).count("0") == 1]

for i in output:
        print("{} : {}".format(i,"{:b}".format(i)))
print("합계 : " , sum(output))
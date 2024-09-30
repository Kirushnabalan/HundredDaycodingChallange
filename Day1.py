list=[33,45,4,55,78]
list2=[]
for i in range(len(list)-1):
    if(list[i+1]>list[i]):
        list2.append(list[i+1])
    else:
        continue
print(list2[-1])

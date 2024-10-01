my_list = [33, 45, 4, 55, 78]

# Bubble Sort algorithm
for i in range(len(my_list) - 1):
    for j in range(len(my_list) - 1 - i):
        if my_list[j] > my_list[j + 1]:
            # Swap the elements
            temp = my_list[j]
            my_list[j] = my_list[j + 1]
            my_list[j + 1] = temp

print(my_list)

#Summ of list

list = [33, 45, 4, 55, 78]
def summ():
    count=0
    for i in range(len(list)-1):
        count+=list[i]
    print(count)
summ()


def large():
    for i in range(len(list)-1):
        for j in range(len(list)-1-i):
            if(list[j]>list[j+1]):
                temp=list[j]
                list[j]=list[j+1]
                list[j+1]=temp
    print(list)
large()
spaces=40
stars=1
buf="*"

for i in range(1,11):
    for j in range(0,spaces):
        print(" ",end=' ')
    for j in range(0,stars):
        if (j==0 or j==stars-1 or i<=10):
            buf="*"
        else:
            print(buf,end=" ")

    print()
    spaces=spaces-1
    stars=stars+2


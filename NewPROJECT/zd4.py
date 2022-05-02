f = open("zd4.txt")
a = f.readlines()
for i in range(len(a)) :
    if not a[i].find("0") :
        print(a)
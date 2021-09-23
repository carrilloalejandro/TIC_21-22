def tabla_2():
    x=input("Que tabla no te sabes?: ")
    print("Tabla del "+str(x))
    for cont in range (0,11):
        print(str(x))+("x")+(str(cont))+("=")+(str(x*cont))
    print("Aprende  a multiplicar :D")
tabla_2()

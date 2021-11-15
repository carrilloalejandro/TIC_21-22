def comparador(cont,mayor,num):
    for cont in range(1,11):
        num=input("Dame un numero: ")
        if(num>mayor):
            mayor=num
        cont=cont+num
    print("Mayor = "+str(mayor))
    
def devolver_el_mayor_2():
    cont=0
    num=input("Dame un numero: ")
    mayor=num
    cont=cont+num
    return (comparador(cont,mayor,num))
devolver_el_mayor_2()

def mayor(num1,num2,num3):
        if (num1>num2):
            if(num1>num3):
                mayor=num1
        if (num2>num1):
            if(num2>num3):
                mayor=num2
        if (num3>num1):
            if(num3>num2):
                mayor=num3
        print(mayor)
def devolver_el_mayor():
    num1=input("Introduce el primer numero: ")
    num2=input("Introduce el segundo numero: ")
    num3=input("Introduce el tercer numero: ")
    
    return(mayor(num1,num2,num3))
devolver_el_mayor()

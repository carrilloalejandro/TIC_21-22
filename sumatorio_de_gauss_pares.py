def sumatorio_de_gauss_impares():
    x=input("Hasta que numero de cosas: ")
    acum=0
    resto=0
    for cont in range (0,x+1):
        resto = cont %2
        if(resto==0):
            acum=acum+cont
        print(str(cont) +"acum =" +str(acum) )
sumatorio_de_gauss_impares()

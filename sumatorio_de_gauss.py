def sumatorio_de_gauss():
    x=input("Hasta que numero de cosas: ")
    acum=0
    for cont in range (0,x+1):
        acum=acum+cont
        print(str(cont) +"acum =" +str(acum) )
sumatorio_de_gauss()

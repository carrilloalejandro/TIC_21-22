def piramide():
    fila_completa=" "
    n1=input("Dame un numero: ")
    for fil in range (n1,0,-1):
        for cont in range (1,fil+1):
            fila_completa=fila_completa+str(fil)
        print(fila_completa)
        fila_completa=" "
        
piramide()

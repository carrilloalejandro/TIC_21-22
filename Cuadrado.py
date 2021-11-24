def cuadrado():
    linea=" "
    n1=input("Dame un numero: ")
    for fil in range(1,n1+1):
        linea=""
        #if (fil == 1 or n1):
            #letra="1"
        #else:
        if (fil%2==1):
            letra="1"
        else:
            letra="0"
        
        for col in range(1,n1+1):
            linea=linea + letra
        print(linea)
    #fila_completa=" "   
       
cuadrado()

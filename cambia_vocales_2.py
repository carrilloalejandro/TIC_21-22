def cambia_vocales_2():
    palabra= raw_input("Dime una palabra: ")
    x = raw_input("Por que letra quieres que cambien las vocales: ")
    cont=0
    while(cont<len(palabra)):
        if(palabra[cont]=="a"):
            print(x)
        else:
           if(palabra[cont]=="e"):
               print(x)
           else:
               if(palabra[cont]=="i"):
                   print(x)
               else:
                   if(palabra[cont]=="o"):
                       print(x)
                   else:
                       print(palabra[cont])
           
        cont=cont+1
    print("Palabra transformada "+palabra)
cambia_vocales_2()

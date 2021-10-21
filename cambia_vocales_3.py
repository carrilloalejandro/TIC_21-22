def cambia_vocales_3():
    palabra= raw_input("Dime una palabra: ")
    x = raw_input("Por que letra quieres que cambien las vocales: ")
    new=" "
    cont=0
    while(cont<len(palabra)):
        if(palabra[cont]=="a"):
            
            new=new+(x)
        else:
           if(palabra[cont]=="e"):
               
               new=new+(x)
           else:
               if(palabra[cont]=="i"):
                   
                   new=new+(x)
               else:
                   if(palabra[cont]=="o"):
                       
                       new=new+(x)
                   else:
                       new=new+(palabra[cont])
           
        cont=cont+1
    print("Palabra transformada "+new)
cambia_vocales_3()

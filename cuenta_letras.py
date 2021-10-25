def cuenta_letras ():
    palabra = raw_input("Introduce una palabra: ")
    letras=0
    vocales=0
    consonantes=0
    cont=0
    while(cont<len(palabra)):
        if(palabra[cont]in"aeiou"):
            vocales=vocales+1
        else:
            consonantes=consonantes+1
        cont=cont+1
        letras=letras+1
    print("Tu palabra contiene "+str(letras)+" letras, "+str(vocales)+" vocales, "+str(consonantes)+" consonantes ")
cuenta_letras()

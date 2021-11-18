import random
def dados():
    cont = 1
    cont2 = 1
    dado1 = 0
    dado2 = 0
    persona_1 = 0
    persona_2 = 0

    while (cont <= 3):
        dado1 = random.randint(1, 6)
        print("Resultado de la primera persona: "+str(dado1))
        persona_1 = persona_1 + dado1
        cont = cont+1
    print("La suma de los 3 dados de la primera persona es: "+str(persona_1))
    
    while (cont2 <= 3):
        dado2 = random.randint(1, 6)
        print("Resultado de la segunda persona: "+str(dado2))
        persona_2 = persona_2 + dado2
        cont2 = cont2+1
    print("La suma de los 3 dados de la segunda persona es: "+str(persona_2))

    if (persona_2>persona_1):
        print("Ha ganado la segunda persona")
    else:
        print("Ha ganado la primera persona")
dados()     

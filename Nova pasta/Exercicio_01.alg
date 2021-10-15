algoritmo "semnome"
// Função :
// Autor :
// Data : 16/09/2021
// Seção de Declarações 
var
numPares, numImpar, numNegat, numPosit, I, N: Inteiro
inicio
numPares <- 0
numImpar <- 0
numNegat <- 0
numPosit <- 0

Para I de 1 ate 5 faca
    Escreva ("Digite um número: ")
    Leia (N)
    Se (N%2 = 0)entao
       numPares <- numPares + 1
    senao
       numImpar <- numImpar + 1
    FimSe
    Se (N < 0) entao
       numNegat <- numNegat + 1
    senao
       numPosit <- numPosit + 1
    FimSe
FimPara
    EscrevaL ("----------------------------------")
    EscrevaL ("Há ",numPares," números pares")
    EscrevaL ("Há ",numImpar," números ímpares")
    EscrevaL ("Há ",numPosit," números positivos")
    EscrevaL ("Há ",numNegat," números negativos")
fimalgoritmo

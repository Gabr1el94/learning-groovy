
def calculo(a,b,operador) {
    switch(operador) {
        case '+':
           return a + b
        break
        case '-':
           return a - b
        break
        case '*':
           return a * b        
        break
        case '/':
           return a / b 
        break
        default:
            println('Operador inválido!')
        break
    } 
}

def valor1 = 10
def valor2 = 5

def resultadoSoma = calculo(valor1, valor2, '+') 
def resultadoSubtracao = calculo(valor1, valor2, '-') 
def resultadoMultiplicacao = calculo(valor1, valor2, '*') 
def resultadoDivisao = calculo(valor1, valor2, '/')
def resultadoError = calculo(valor1, valor2, '**')

println "Resultado da soma: ${resultadoSoma}"
println "Resultado da subtração: ${resultadoSubtracao}"
println "Resultado da multiplicação: ${resultadoMultiplicacao}"
println "Resultado da divisão: ${resultadoDivisao}"
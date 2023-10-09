

try {

int i = 1/0;

}catch(ArithmeticException exp1){
    println "Falha ao realizar calculo aritmética"   
}
catch(Exception ex){
    println "Exceção lançada após falha cálculo"
    println  exp.getCause()
    println  exp.getMessage()
}finally{
    println "Tratamento finalizado"
}
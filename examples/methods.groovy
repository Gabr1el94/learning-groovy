
def printHello(){
    println("Hello World in Method")
}

def methodName(s1='sas'){
    return "My name is ${s1}"
}

printHello();
println(methodName('Gabriel Soares'))

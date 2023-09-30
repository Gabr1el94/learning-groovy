// For
soma = 0;
for(int i=0; i<=10; i++){
    if(i%2 == 0){
        soma+=i
    }
}
println "For default"
println "A soma total pares foi ${soma}"
println "--------------------------------"
//For in
somaIn=0
for(a in 1..5){
    somaIn +=a;
}
println "--------------------------------"
println "For in"
println "A soma total acumulado ${somaIn}"

//upto
println "--------------------------------"
println "For upto"
1.upto(5){
    println "$it"
}

//times
println "--------------------------------"
println "For times"
5.times {
    println "$it"
}

//step
println "--------------------------------"
println "For step"
1.step(10,2) {
    println "$it"
}

//map
println "--------------------------------"
def map = ['abc':1, 'def':2, 'xyz':3]
int x = 0;
for(e in map) {
    x+= e.value;
}
println "For map"
println x;

//while
int i=1;
while(i<5){
    i+=1
}
println "For while"
println i
// For
soma = 0;
for(int i=0; i<=10; i++){
    if(i%2 == 0){
        soma+=i
    }
}
println "A soma total pares foi {$soma}"

//For in
somaIn=0
for(a in 1..5){
    soma +=i;
}
println "A soma total acumulado ${somaIn}"

//upto
1.upto(5){
    println "$it"
}

//times
5.times {
    println "$it"
}

//step
1.step(10,2) {
    println "$it"
}

//map
def map = ['abc':1, 'def':2, 'xyz':3]
int x = 0;
for(e in map) {
    x+= e.value;
}
println x;

//while
int i=1;
while(i<5){
    i+=1
}
println i
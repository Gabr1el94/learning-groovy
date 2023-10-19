//simple

def range = 1..10
println range
println range.size()
println range.getFrom() // initial
println range.getTo() // end

println range.get(3)//index position(or form range[3])
println range.contains(6)//contains value
println range.isReverse()//boolean range is reverse

def range2 = range.subList(3, 7)//get values on range by position
println range.getFrom()
println range.getTo()

//iterate on a range
//1º OPTION
for (i in 1..10){
    println i
}

//2º OPTION
(1..10).each{
    i -> println "Value = $i"
}

//check if variable is type object List from Java
println range instanceof java.util.List
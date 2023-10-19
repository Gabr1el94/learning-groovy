println "Enter your name:"
def name = System.console().readLine()

println "Hello $name"

//insert number
println "Enter your age:"
def age = System.console().readLine().toInteger()

println "Your age is $age years old!"

salary = 230.908

printf "%s | %d | %.2f \n",[name,age,salary]
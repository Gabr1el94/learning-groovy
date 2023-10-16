
def str = "Hello"

//simple closure
def myClosure1 = {
    name -> println "$str World! I'm $name"
}

myClosure1.call("Gabriel Soares")

//closure with parameters
def myMethod(clos){
    clos.call("Call Method...")
}

myMethod(myClosure1)

// return value
def myClosure2 = {
    a,b,c -> return (a+b+c)
}

def res = myClosure2(10,50,20)
println res

// with list
def myList = ["Apple","Orange","Grapes"]
println myList.each{ it }
println myList.find{ item -> item == "Orange" }
println myList.any{ item -> item == "Banana"} //or every


//with map
def myMap = [
    'subject':'groovy',
    'topic':'closures'
]
println myMap.each{ it }
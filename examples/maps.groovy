def employee = [
    'name': 'Gabriel',
     'age': 28
]

//show variable in map
println employee;
println employee.name;//['name'] or .get('name') or getAt('name')
println employee.age;

println employee.size(); // quantity map

//add map
employee.put('city':'São Paulo')
println employee

//booleand containsKey and Value
println employee.containsKey('city')
println employee.containsValue('Rio de Janeiro')

//clone object map
def emp2 = employee.clone()
println emp2

//map loop
employee.each { key,value ->
    println "$key: $value"
}

employee.eachWithIndex{ key,value,i ->
    println "$i | $key: $value"
}
//single quoted '...'
def a = 'Gabriel'
print 'hello'+a

// double quoted "..."

def name = "Raghav"
println "Meu nome é ${name}"// pode ser feito concatenação: '+' ou .concat(name)

// triple single quoted  '''...'''

def s1t = '''Essa é a aula sobre 
linguagem groovy'''

println s1

// triple double quoted """..."""

def s1 = """Essa é a aula sobre 
linguagem groovy"""

println s1

//slashy /.../

def s1as = /a green sky $name/
println s1as

//dollar slashy $/.../$

def s1b = $/a blue tree $name/$
println s1b
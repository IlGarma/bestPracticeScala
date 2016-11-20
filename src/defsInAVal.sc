//It is not a good idea to change
//the value of a function defined to class or object level
//since other piece of code could rely on this function
var f: String => String = x =>x.toLowerCase

def function(x: String): String = {
  if (x.length %2==0) {
    f = x => x.toUpperCase
  }
  f(x)
}


//Better to encapsulate the function in the method
//so everything is local to the method
def function2(x:String): String = {
  var f: String=>String = x=>x.toLowerCase
  if (x.length%2 ==0) f=x=>x.toUpperCase
  f(x)
}


//Another good may is to define to method or function
//with the logic toLowercase and uppercase
//This way is good to perform the unit test since we can verify
//the function to lowercase and to uppercase without
//passing through the function function3
val fl: String=>String = x=>x.toLowerCase
val fu: String=>String = x=>x.toUpperCase


f= fl
def function3(x:String): String = {
  if (x.length%2==0) f=fu
  f(x)
}

function("game")
function2("game")
function3("game")
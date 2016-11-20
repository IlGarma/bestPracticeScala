//We use counter as an accumulator
//In this case is a good practice to add the type

var counter: Int = 0
val vowels = List('a', 'e', 'i', 'o', 'u')

def function (text: String): Int = {
  val count = text.count(c=> vowels.contains(c))
  counter = counter + count
  count
}

function("game of thrones")
counter

function("jon snow")
counter


//When create a new class, you can use var
//Using val, is ok for the concurrency but remember not
//complicated the app. Using a val changing a property
//means to create a new copy of the object with this new value
class Person(val name: String, val surname: String)

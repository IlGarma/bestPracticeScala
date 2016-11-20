//We have to create a function having in input a string and in
//output a new string without the vowels and with the size

//This is the worst way, we execute the filtering twice
def function (text: String) = {
  text.filter(c=> !List('a', 'e', 'i', 'o', 'u').contains(c)) +
  "(" + text.filter(c=> !List('a', 'e', 'i', 'o', 'u').contains(c)).size +
  ")"
}

function("game of thrones")


//THis is a better way, size we create a val so that we call just
//one time the filter function
def function2 (text: String) = {
val consonant = text.filter(c=> !List('a', 'e', 'i', 'o', 'u').contains(c))
   consonant + "(" + consonant.size + ")"
}

function2("game of thrones")


//This is the best way
//Having defined the val outside the function
//this list is created just one time and used in the function
val vowels = List('a', 'e', 'i', 'o', 'u')


def function3 (text: String) = {
  val consonant = text.filter(c=> !vowels.contains(c))
  consonant + "(" + consonant.size + ")"
}

function3("game of thrones")
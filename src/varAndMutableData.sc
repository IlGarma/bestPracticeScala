//If you have data highly variable mayb is better to use
//a mutable data structure
///EVen if is better for concurrency problem use an immutable
//data structure, however also in this case you
//need a syncronization because if 2 thread remove an element
//from the list, the latest thread will override the variable
//to point to another list losing the modification of the first thread
//so you need to syncro the variable immutable
import scala.collection.mutable

val mutableData = mutable.ListBuffer[String]()
var immutable = List[String]()

def append1(text: String): Unit ={
  mutableData += text
}

def append2(text: String): Unit ={
  immutable :+= text
}

def remove1(text: String): Unit ={
  mutableData -= text
}

def remove2(text: String): Unit ={
  immutable = immutable.filterNot(_==text)
}

append1("game")
append1("of")
append1("thrones")
mutableData

append2("game")
append2("of")
append2("thrones")
immutable

remove1("of")
mutableData
remove2("of")
immutable
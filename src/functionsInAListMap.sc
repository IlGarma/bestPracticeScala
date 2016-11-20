//Given a list of functions, I want to filter out from a List
//of string all the elements not matching all these functions

//The idea to create a list of anonymous functions is not a great idea
//IT is not a good idea idea because is difficult to unit test all these
//functions
val filters: List[String=>Boolean] = List(
  _.contains("a"),
  _.contains("b"),
  _.length %2==0
)

def applyFilters(x:List[String]): List[String] = {
  filters.foldLeft(x)((i,f)=>i.filterNot(f))
}

val list = List("jon", "snow", "game")
applyFilters(list)


//The other way to precede is to create different
//functions in the usual way and add to a List of functions
//in this way you can test these functions normally
def containsA(x:String):Boolean = x.contains("a")
def containsB(x:String): Boolean = x.contains("b")
def evenLength(x:String): Boolean = x.length%2==0

val filters2:List[String=>Boolean] = List(
  containsA,
  containsB,
  evenLength
)

def applyFilters2(x:List[String]): List[String] = {
  filters2.foldLeft(x)((i,f)=> i.filterNot(f))
}

applyFilters2(list)




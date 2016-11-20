//Immutability is a key concept in functional programming
//Using an inner function to create a List give the ability
//to use only var in fact when we recursively call _function
//we are not using a var but inline building returning a count -1
//and new list with appended a new element


def function(count:Int, text: String): List[String] = {

  def _function(count:Int, list: List[String]) :List[String] = {
    if (count==0) list
    else {
      _function(count-1, s"$count: $text" :: list)
    }
  }

  _function(count, List.empty)
}

function(10, "Game of Thrones")
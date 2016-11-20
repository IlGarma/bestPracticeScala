//Pattern matching is very important in all function programming but avoid to over use

//Not use in the following example
//Remember you can always use if
def function(text: String): Boolean = text match {
  case "foo"|"" => true
  case _ => false
}

def function2(text: String): Int = text.isEmpty match {
  case true => 0
  case false => text.size
}

function("game")
function("foo")
function2("game")
function2("")
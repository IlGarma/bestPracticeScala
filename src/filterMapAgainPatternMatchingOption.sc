def function1 (input: Option[String]): Option[Int] = input match {
  case Some(s) if s.trim.nonEmpty => Some(s.length)
  case _ => None
}

function1(Some("Hello"))
function1(Some(""))
function1(None)

//In this case is better to use a filter/map
//Option is like a String and map return Some only if an element
//exists instead in case of no value map return none
//IN this case you can avoid to wrap again the result in an Option
//as you do with pattern matching
def function2(input:Option[String]): Option[Int] =
  input.filter(_.trim.nonEmpty).map(_.length)

function2(Some("Hello"))
function2(Some(""))
function2(None)

//Also filter return an Option
def function3(input: Option[String]): Option[String] = input.filter(_.nonEmpty)
function3(Some("Hello"))
function3(Some(""))
function3(None)

def function4(input: Option[String]): Boolean = input.contains(3)
function4(Some("Hello"))
function4(Some(""))
function4(None)


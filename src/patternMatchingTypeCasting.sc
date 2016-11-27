//When you have to perform a cast, then use pattern matching
//since it's more powerful
def function1(x: Any): Option[String] =
if (x.isInstanceOf[String]) Some(x.asInstanceOf[String])
else None

//Much better using pattern matching
def function2(x:Any): Option[String] = x match {
  case s: String => Some(s)
  case _ => None
}

function1("test")
function1(2)

function2("test")
function2(2)


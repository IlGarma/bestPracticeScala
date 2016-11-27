//Sometimes you don't need case class
//Be in mind that case classes are used when you have to do pattern
//matching but not always you need to use

case class Foo(name:String)

def function (input: Foo): String = input match {
  case Foo(s) => s
  case _ => "Undefined"
}

function(Foo("test"))

//But you can simply create a class a extract the value

class Foo2(val name:String)
println(new Foo2("test").name)
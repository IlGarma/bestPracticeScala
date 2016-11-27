//In scala you have to pay attentuon to create trait
//For example in this case you may use another way
//instead to create a nee traits
trait Foo {
  def execute(text:String): String
}

def function1(foo:Foo) :String = foo.execute("bAR")

println(function1(new Foo {
  override def execute(text:String) = text.toLowerCase
}))


//Instead you can simply use a function accepting another
//function in input
def function1(f: String=> String) = f("bAR")

println(function1(x=>x.toLowerCase()))

//Also if your traits is very specific you don't need
//You have to use a trait if you have something to abstract
trait Foo2{
  def foo : String
  def bar: String
}

class Foo2Impl (fooValue: String, barValue: String) extends Foo2 {
  override def foo = fooValue.toLowerCase

  override def bar= barValue.toLowerCase
}
val foo2V = new Foo2Impl("eXAmple", "TesT")
foo2V.foo
foo2V.bar
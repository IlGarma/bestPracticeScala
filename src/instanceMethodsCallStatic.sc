//The idea of call from an instance method a static methods
// could or could be not a good idea

//In this case could be a good option since we could test
//convert just creating the singleton Foo
//without to create all the class
class Foo (private val fooVal: String) {
  def fooTrasform(foo:Foo) = Foo.convert(foo)
}

object Foo {
  def convert(foo:Foo) = foo.fooVal.toLowerCase
}

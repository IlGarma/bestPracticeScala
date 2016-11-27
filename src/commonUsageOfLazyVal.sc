//IN case of lazy val only when the variable is used is instantiated
//in fact when you declare a new Foo, you will not
//execute the body of the lazy val length but only the body of the val uppercase

class Foo(x: String) {
    lazy val length = {
      println("In length lazy val " + System.currentTimeMillis())
      Thread.sleep(1000)
      x.length
    }
    println("In length after lazy val" + System.currentTimeMillis())

    val uppercase = {
      println("In uppercase val " + System.currentTimeMillis())
      Thread.sleep(1000)
      x.toUpperCase
    }
  println("In uppercase after val" + System.currentTimeMillis())

  var separator = "&"
  lazy val test = "test" + separator + "!"
  separator = "|"
  test
}

val foo = new Foo("test")

//When you declare a lazy val you can change the value of lazy val
//changing the value after declaration before it's instantiated
//IN this case I'm changing the separator from "&" to "|" after the declaration
foo.test
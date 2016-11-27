//WHen you use a lazy val variable, that variable is instantiated only
//the first time that you need
//If you see even if we call variable two times, the second time
//you have not yo wait a 1000s, but when is ready you receive the value
//and unless you don't use that variable you don't wait 1000s
def myfunction() = {
  lazy val variable = {
    Thread.sleep(1000)
    "Hi"
  }

  println(System.currentTimeMillis())
  println(variable)
  println(System.currentTimeMillis())
  println(variable)
  println(System.currentTimeMillis())
}

//THis is cost is more evident here, where there are two thread
//The second thread wait until the variable is instantiated in the first thread
//when is ready, you can use in the second thread, in fact
//the second thread doesn't wait 1000 but less
//Pay attention to this, in fact if you need that all threads
//have to wait the same amount of time, lazy val is not
//a good option

def myfunction2() = {
  lazy val variable = {
    Thread.sleep(1000)
    "Hi"
  }

  new Thread() {
    override def run(): Unit = {
      println("Current Thread" + Thread.currentThread().getName +  ";" + System.currentTimeMillis())
      println("Current Thread" + Thread.currentThread().getName +  ";" + variable)
      println("Current Thread" + Thread.currentThread().getName +  ";" + System.currentTimeMillis())
    }
  }.start()
  println("Current Thread" + Thread.currentThread().getName +  ";" + System.currentTimeMillis())
  println("Current Thread" + Thread.currentThread().getName +  ";" + variable)
  println("Current Thread" + Thread.currentThread().getName +  ";" + System.currentTimeMillis())

}

myfunction()
println("-----------------THREAD---------------")
myfunction2()
case class Person (name: String, age:Int)

def test(input:Person): Boolean = input match {
  case Person(f1,f2) if f1 =="Jon" && f2 ==10 => true
  case _ => false
}
test(Person("Jon", 10))
test(Person("Jon", 12))

//IN this case prefer the value matching against the guard
def test2(input: Person): Boolean = input match {
  case Person("Jon", 10) => true
  case _ => false
}

test2(Person("Jon", 10))
test2(Person("Jon", 12))

//Patter matching can also handle different value in value matching
def test3(input: Person) : Boolean = input match {
  case Person("Jon", 10|11) => true
  case _ => false
}

test3(Person("Jon", 10))
test3(Person("Jon", 12))

//If the number of different value that can be used are high
//better to use the guard
val acceptableAges = List(10,11,12,17,90)
def test4(input:Person) : Boolean = input match {
  case Person("Jon", f2) if acceptableAges.contains(f2) => true
  case _ => false
}
test4(Person("Jon", 90))
test4(Person("Jon", 13))

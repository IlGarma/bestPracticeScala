def createList(x:String, count:Int, f:Int=>Boolean): List[String] = {
  (0 to count).map(i=> {
    if (f(i)) x.toLowerCase
    else x.toUpperCase
  }).toList
}

createList("test", 10, i=>i%2==0)

def createList2(x:String, count:Int, f:Int=>Boolean=i=>i%2==0): List[String] = {
  (0 to count).map(i=> {
    if (f(i)) x.toLowerCase
    else x.toUpperCase
  }).toList
}
createList2("test", 10)
createList2("test", 10, i=>i%3==0)

implicit val function: Int=>Boolean = i=>i%2==0

def createList3(x:String, count:Int)(implicit function:Int=>Boolean): List[String] = {
  (0 to count).map(i=> {
    if (function(i)) x.toLowerCase
    else x.toUpperCase
  }).toList
}

createList3("test", 10)
createList3("test", 10) (i=>i%3==0)
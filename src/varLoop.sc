//In general you don't need to create a var to call from a loop
//List and collections have map, filter and other api
//so that you can use these functions and move away from
//var and loop

val list = List(1,2,3,4,5,6,7,8,9,10)

def function(list: List[Int]): Int ={
  var sum: Int=0
  for (i<-list) {
    if (i%2==0) sum+=i
  }
  sum
}

def function2(list:List[Int]): Int ={
  list.filter(_%2==0).sum
}

function(list)
function2(list)
//IN the application driven by configuration you can use
//lazy val factory patter
//In detail you create a van where you can set the variable
//and define a new factory that starting from the define variable
//can return an updated value so that you have the flexibility to
//change the value and once you call the lazy val you have a constant
//since now the value is fixed
var name: Option[()=>String] = None
lazy val nameFactory: ()=>String = name.getOrElse(()=>"test")

name=Some(()=>"test2")
nameFactory()

var surname : Option[()=>String] = None
lazy val surnameFactory: ()=>String = surname.getOrElse(()=>"test surname")

//Since here you call before this lazy factory, also changing
// the value of the var surname now you have the old value
surnameFactory()
surname =Some(()=>"new value")
surnameFactory()
//When use pattern matching is a good idea always catch
//the general case with _ otherwise you could receive
//a matching exception

def function(text: Option[String]): String = text match  {
  case Some(s) => s
  case None => "None"
}

function(Some("example"))
function(None)

//But we forgot to catch the case when the parameter is null
try {
  function(null)
} catch {
  case e: Throwable => e.printStackTrace()
}

//So define a new function were we catch all the other cases
//adding a general match

def function2(text: Option[String]): String = text match {
  case Some(s) => s
  case None => "None"
  case _ => "Null"
}
function2(Some("example"))
function2(None)
function2(null)
package ae.mohd874

import scala.collection.mutable.Map

object Actions {

  
}

case class Actions(val acts: Map[String, Props => Any]) {
  
  override def toString = {
    acts mkString(", ")
  }
}
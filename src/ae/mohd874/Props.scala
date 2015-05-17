package ae.mohd874

import scala.collection.mutable.Map

object Props {

  
}

case class Props(val props: Map[String, Any]) {
  
  override def toString = {
    props mkString(", ")
  }
}
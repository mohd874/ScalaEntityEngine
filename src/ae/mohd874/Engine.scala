package ae.mohd874;

import scala.collection.mutable.{MutableList => MList}
object Engine {

  val entities = MList[(Props, Actions)]()

  def findEntitiesByProp(prop: String) = {
    for {
      (p,a) <- entities
      (k,v) <- p.props if k == prop
    } yield (p,a)
  }
  
  def findEntitiesByAction(action: String) = {
    for {
      (p,a) <- entities
      (k,v) <- a.acts if k == action
    } yield (p,a)
  }
  
  def update = {
    for{
      (p,a) <- entities
      (k,v) <- a.acts
    } v(p)
  }
  
}



package ae.mohd874

import scala.collection.mutable.Map

object Test {

  def test = {
    
    def move(props: Props) = {
      val (x: Int, y: Int) = props.props("pos")
      val (vx: Int, vy: Int) = props.props("vel")
      
      props.props += (("pos", (x + vx, y + vy)))
    }
    
    val props1 = Props(Map("pos" -> (1,3), "vel" -> (0,2)))
    val acts1 = Actions(Map("move" -> move _))
    
    val props2 = Props(Map("pos" -> (0,-9), "vel" -> (2,-1)))
    val acts2 = Actions(Map("move" -> move _))
    
    val engine = Engine
    engine.entities += ((props1, acts1), (props2, acts2))
  }
}
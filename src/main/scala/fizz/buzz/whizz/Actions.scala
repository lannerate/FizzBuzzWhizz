package fizz.buzz.whizz

/**
  * Created by apple on 9/18/16.
  */
object Actions {
  type Action = Int => String

  def to(str: String): Action = _ => str

  def nop: Action = _.toString
}

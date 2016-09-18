import _root_.Actions.Action
import _root_.Matchers.Matcher

/**
  * Created by apple on 9/18/16.
  */
object Rules {
  type Rule = Int => String

  def atom(matcher : => Matcher, action : => Action ): Rule =
    n => if( matcher(n) ) action(n) else ""

  def allof(rules: Rule*): Rule =
    n => rules.map(_(n)).filterNot(_.isEmpty).headOption.getOrElse("")

  def anyof(rules: Rule*): Rule =
    n => rules.foldLeft(""){ _ + _(n) }

}

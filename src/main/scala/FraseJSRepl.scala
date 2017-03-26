import it.vigtig.lambda.interpreter.{DefaultInterpreter, DefaultLetTransformer, Interpreter}
import it.vigtig.lambda.semantic.DefaultKeywords
import it.vigtig.lambda.syntax.{DefaultLexer, DefaultParser}

import scala.scalajs.js.JSApp

object FraseJSRepl extends JSApp {

  val defaultKeywords          = DefaultKeywords()
  val lexer                    = DefaultLexer()
  val parser                   = DefaultParser(lexer)
  val letTransformer           = DefaultLetTransformer(defaultKeywords)
  val interpreter: Interpreter = DefaultInterpreter(parser, letTransformer, defaultKeywords)

  def main(): Unit = {
    val program =
      """|+ 1 2
      """.stripMargin

    println(interpreter.interpret(program))
  }

}

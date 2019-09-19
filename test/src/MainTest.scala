package core

import probably._

object MainTest extends TestApp {
  override def tests(): Unit = {
    test("Sample passing test") {
      val result = 1.0 + 1.0
      result
    }.assert(_ == 2.0)
    test("Sample failing test") {
      val result = 1.0 + 0.0
      result
    }.assert(_ == 2.0)
  }
}  

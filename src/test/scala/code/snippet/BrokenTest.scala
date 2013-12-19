package code
package snippet

import net.liftweb._
import util._
import mockweb.WebSpec


object BrokenTestSpecs extends WebSpec {
  "BrokenTestSpecs" should {
    "not throw 'java.lang.IncompatibleClassChangeError: Implementing class'" in {
      1 === 1
    }
  }

}
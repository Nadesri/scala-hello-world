// Declare this Scala file as a unit of a package on the top line, if desired.
package helloWorld

// Import statements can grab either single or multiple units.
import helloWorldUtils.StringHolder

// Objects ("Classes" as you might know them) are declared using the object keyword.
object HelloWorld {
  def main(args: Array[String]) {
    println(StringHolder.getHelloWorldString)
  }
}

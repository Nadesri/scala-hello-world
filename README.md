New to Scala? Perhaps this starter project can help.

# Scala: Hello World Example

This is a "Hello, World!" example, with some OOP-ness thrown in, for use as a *super simple* starter project.

# Requirements

* Scala

On MacOSX, I suggest getting [Homebrew](http://brew.sh/). Once you get it, run:

    brew install scala
* sbt (Scala Build Tool) [Optional]

    brew install sbt

# Compiling

Without sbt:

    scalac StringHolder.scala HelloWorld.scala

With sbt:

    sbt compile

# Executing

Without sbt:

    scala helloWorld.HelloWorld

With sbt:

    sbt run

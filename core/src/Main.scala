package core

object Main extends App {
  val banner =
 """|Welcome to Fury!
    |================
    |
    |This is an example project which consists of a "core" module and a test module.
    |You might want to change the names of the current schema, project and module
    |by executing the following commands:
    |
    |fury schema  update -n <NEW_SHEMA_NAME>
    |fury project update -n <NEW_PROJECT_NAME>
    |fury project select -p <NEW_PROJECT_NAME>
    |fury module  update -n <NEW_MODULE_NAME>
    |
    |More information is available at https://fury.build.
    |Support is provided at https://gitter.im/propensive/general.
    |""".stripMargin
  println(banner)
}

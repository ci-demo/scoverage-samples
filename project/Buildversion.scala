import sbt._

object buildversion {

  private val build = System.getenv("BUILD_NUMBER")

  val revision = if (build == null) System.currentTimeMillis.toString else build

  val base = SettingKey[String]("base", "Base version to build")
}


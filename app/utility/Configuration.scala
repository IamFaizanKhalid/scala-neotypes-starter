package utility

import com.typesafe.config.ConfigFactory

object Configuration {
  private val config = ConfigFactory.load()

  val DB_URL: String = config.getString("db.url")
  val DB_USER: String = config.getString("db.user")
  val DB_PASSWORD: String = config.getString("db.password")

}

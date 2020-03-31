package models

import play.api.libs.json.{Json, JsonConfiguration}
import play.api.libs.json.JsonNaming.SnakeCase

case class Movie(title: String, released: Int, tagline: Option[String])

object Movie {
  implicit val fontCase = JsonConfiguration(SnakeCase)
  implicit val format = Json.format[Movie]
}

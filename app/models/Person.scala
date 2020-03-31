package models

import play.api.libs.json.{Json, JsonConfiguration}
import play.api.libs.json.JsonNaming.SnakeCase

case class Person(name: String, born: Option[Int])

object Person {
  implicit val fontCase = JsonConfiguration(SnakeCase)
  implicit val format = Json.format[Person]
}

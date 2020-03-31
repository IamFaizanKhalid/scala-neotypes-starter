package controllers

import javax.inject._
import play.api.mvc._
import play.api.libs.json.Json

@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents)
    extends BaseController {

  def index() = Action { implicit request =>
    Ok(Json.toJson("Everything is working fine."))
  }
}

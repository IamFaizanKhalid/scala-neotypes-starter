package controllers

import javax.inject._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.ExecutionContext.Implicits.global
import repositories.MovieRepository

@Singleton
class MovieController @Inject()(
  cc: ControllerComponents,
  movieRepository: MovieRepository
)(implicit assetsFinder: AssetsFinder)
    extends AbstractController(cc) {

  def getAllActors() = Action.async { implicit request =>
    movieRepository.getAllActors
      .map { data =>
        Ok(Json.toJson(data))
      }
  }

  def getAllMovies() = Action.async { implicit request =>
    movieRepository.getAllMovies
      .map { data =>
        Ok(Json.toJson(data))
      }
  }

}

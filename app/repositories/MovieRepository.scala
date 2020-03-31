package repositories

import javax.inject._
import models._
import neotypes.GraphDatabase
import org.neo4j.driver.v1._
import neotypes.implicits.mappers.results._
import neotypes.implicits.syntax.string._
import utility.Configuration

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

@Singleton
class MovieRepository @Inject()() {
  val driver = GraphDatabase
    .driver[Future](
      Configuration.DB_URL,
      AuthTokens.basic(Configuration.DB_USER, Configuration.DB_PASSWORD)
    )

  def getAllActors: Future[Seq[Person]] = driver.readSession { session =>
    s"""MATCH (p: Person) RETURN p""".query[Person].list(session)
  }

  def getAllMovies: Future[Seq[Movie]] = driver.readSession { session =>
    s"""MATCH (movie: Movie) RETURN movie""".query[Movie].list(session)
  }

}

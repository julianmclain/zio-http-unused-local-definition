import zio.http.Middleware
import zio.http.Routes
import zio.http.Server
import zio.Console
import zio.Duration
import zio.ZIO
import zio.ZIOAppDefault


object App extends ZIOAppDefault {
  
  override def run = (for {
    duration <- Console.readLine("Enter a timeout duration in seconds").map(s => Duration.fromSeconds(s.toLong))
    exitCode <- Server.serve(Routes.empty @@ Middleware.timeout(duration))
  } yield exitCode).provide(Server.default)
}
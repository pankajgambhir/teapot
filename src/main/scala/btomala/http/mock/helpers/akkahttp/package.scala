package btomala.http.mock.helpers

import akka.http.scaladsl.model.headers.{`User-Agent`, Host}

package object akkahttp {
  def headers(host: String = "localhost", port: Int = 80) = scala.collection.immutable.Seq(
    Host(host, port),
    `User-Agent`("akka-http/2.3.11")
  )

}

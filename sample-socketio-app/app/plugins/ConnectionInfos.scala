/*
   Copyright 2013 Originate Inc.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package plugins

import org.joda.time.DateTime
import play.api.db.slick.Config.driver.profile.simple._

case class ConnectionInfo(
    connectionId: String,
    clientId: String,
    userId: String,
    connectionActorUrl: String,
    lastRequestTimestamp: Long) {
  val lastRequestTime: DateTime = new DateTime(lastRequestTimestamp)
}

class ConnectionInfos(tag: Tag) extends Table[ConnectionInfo](tag, "connection_infos") {
  def connectionId = column[String]("connection_id", O.PrimaryKey)

  def clientId = column[String]("client_id")

  def userId = column[String]("user_id")

  def connectionActorUrl = column[String]("connection_actor_url")

  def lastRequestTimestamp = column[Long]("last_request_timestamp")

  def * = (connectionId, clientId, userId, connectionActorUrl, lastRequestTimestamp) <>
      (ConnectionInfo.tupled, ConnectionInfo.unapply)
}

object ConnectionInfos extends TableQuery(new ConnectionInfos(_))
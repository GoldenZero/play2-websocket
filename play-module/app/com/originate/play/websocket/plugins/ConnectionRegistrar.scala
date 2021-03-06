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
package com.originate.play.websocket.plugins

import com.originate.play.websocket.ClientConnection
import play.api.Play._
import play.api.Plugin
import scala.concurrent.Future

trait ConnectionRegistrar {
  def register(connection: ClientConnection): Future[Unit]

  def deregister(connection: ClientConnection): Future[Unit]

  def find(connectionId: String): Future[Option[ClientConnection]]
}

trait ConnectionRegistrarPlugin extends Plugin with ConnectionRegistrar

trait ConnectionRegistrarComponent {
  def connectionRegistrar: ConnectionRegistrar
}

trait ConnectionRegistrarComponentImpl extends ConnectionRegistrarComponent {
  lazy val connectionRegistrar: ConnectionRegistrar = current.plugin(classOf[ConnectionRegistrarPlugin]).get
}

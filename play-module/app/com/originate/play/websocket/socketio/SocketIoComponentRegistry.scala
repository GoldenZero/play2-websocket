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
package com.originate.play.websocket.socketio

import com.originate.play.websocket.plugins.{ConnectionRegistrarComponent, WebSocketHooksComponent, ClientInformationProviderComponent}
import com.originate.play.websocket.socketio.plugins.{SocketIoHooksComponent, SocketIoHooksComponentImpl}
import com.originate.play.websocket.{WebSocketMessageSenderComponent, WebSocketModuleActorsComponent, WebSocketModuleConfigComponent, WebSocketsControllerComponentImpl}

trait SocketIoComponentRegistry
    extends SocketIoConfigComponent
    with SocketIoControllerComponent
    with SocketIoHooksComponent
    with SocketIoPacketSenderComponent

trait SocketIoComponentRegistryImpl
    extends SocketIoComponentRegistry
    with ClientInformationProviderComponent
    with SocketIoConfigComponentImpl
    with SocketIoControllerComponentImpl
    with WebSocketsControllerComponentImpl
    with ConnectionRegistrarComponent
    with WebSocketModuleConfigComponent
    with WebSocketModuleActorsComponent
    with WebSocketHooksComponent
    with SocketIoHooksComponentImpl
    with SocketIoPacketSenderComponentImpl
    with WebSocketMessageSenderComponent

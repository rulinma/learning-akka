package com.rulinma.Hello;
import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

class HelloActor(name: String) extends Actor {
  def receive = {
    case "hello" => println("Hello from %s".format(name))
    case _ => println("%s, hi?".format(name))
  }
}

object Hello extends App {
//  def main(args: Array[String]): Unit = {
//    println("Hello World")
//  }

  val system = ActorSystem("HelloSystem")
  // 如果HelloActor不带构造参数，这可以这么使用
  // val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")

  // HelloActor带构造参数的
  val helloActor = system.actorOf(Props(new HelloActor("rulin")), name = "helloactor")
  helloActor ! "hello"
  helloActor ! "anything else"

}

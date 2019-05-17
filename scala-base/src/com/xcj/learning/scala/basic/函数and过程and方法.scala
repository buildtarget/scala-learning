package com.xcj.learning.scala.basic

/**
  * @program: scala-learning
  * @Date: 2019/5/17 21:24
  * @Author: ftd
  * @Description:
  */
object 函数and过程and方法 {
  def main(args: Array[String]): Unit = {
    // 函数
    val func:(Int, Int) => Int  //函数类型
      = (x:Int, y:Int) => x + y //函数体

    println(s"我是函数算出来的: ${func(1, 2)}")

    // 过程
    def box(s: String)
    {
      println("我是过程打印出来的")
    }

    box("")

    // 方法，是类中的概念
    def method(): Unit =
    {
      println("我是方法打印出来的")
    }

    method()
  }
}

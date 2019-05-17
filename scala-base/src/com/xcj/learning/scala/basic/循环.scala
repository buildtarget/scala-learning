package com.xcj.learning.scala.basic

/**
  * @program: scala-learning
  * @Date: 2019/5/17 21:03
  * @Author: ftd
  * @Description:
  */
object 循环 {
  def main(args: Array[String]): Unit = {

    /*************循环*************/
    println("/*************循环*************/")
    for (e <- Array(1, 2, 3))
      println(e)

    println("-----------")
    for (e <- 0 to 3) // 相当于 [0,3]
      println(e) // 0 - 3

    println("-----------")
    for (e <- 0 until 3) // 相当于 [0,3)
      println(e) // 0 - 2

    println("-----------")
    for (e <- 0 to 5 if e % 2 == 0)
      println(e)

    println("-----------")
    for (i <- 0 to 10; j <- 0 to 5; if i == 2 * j)
      println(s"$i $j")

    println("-----------")
    val res = for (e <- 0 to 10 if e % 2 == 0) yield e
    println(res)

  }
}

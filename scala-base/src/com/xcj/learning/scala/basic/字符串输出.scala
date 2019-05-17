package com.xcj.learning.scala.basic

/**
  * @program: scala-learning
  * @Date: 2019/5/17 21:02
  * @Author: ftd
  * @Description:
  */
object 字符串输出 {
  def main(args: Array[String]): Unit = {
    /******字符串动态传值与格式化******/
    println("/******字符串动态传值与格式化******/")
    val age = 12
    val a = 1
    val b = 1
    val price = 10.0
    println(s"age is $age") // 传变量
    println(s"a + b = ${a + b}") // 传表达式
    println(raw"\t\t\n\r") // raw
    println(s"$$$price\\") // 转义字符

    for (i <- 1 to 3; j <- 1 to 3) print(f"${10 * i + j}%3d") // 格式化输出

  }
}

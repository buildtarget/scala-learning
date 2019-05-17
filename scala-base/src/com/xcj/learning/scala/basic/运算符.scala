package com.xcj.learning.scala.basic

/**
  * @program: scala-learning
  * @Date: 2019/5/17 21:20
  * @Author: ftd
  * @Description:
  */
object 运算符 {
  def main(args: Array[String]): Unit = {
    println(1 + 2)
    println(1.+(2)) // 运算符都是方法

    println(args map(println)) // 空格表示调用方法
  }
}

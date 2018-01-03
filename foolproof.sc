#!/usr/bin/env scala
val random = scala.util.Random

def factorial(n: Int): Int = {
  if (n == 0) 
    1
  else
    n * factorial(n-1)
}

println("Try\tFactoidal")

def factoidal(n: Int): Int = {
  val r: Int = 1 + random.nextInt(n - 1)
  if (r == 1)
    1
  else
    r * factoidal(r)
}

def trioidal(n: Int): Int = {
  val r: Int = 1 + random.nextInt(n - 1)
  if (r == 1)
    1
  else
    r + trioidal(r)
}

val tries = args(0).toInt
val n = args(1).toInt
//for (i <- 1 to tries) println(s"$i,${factoidal(n)}")
for (i <- 1 to tries) println(s"$i\t${trioidal(n)}")


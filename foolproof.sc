#!/usr/bin/env amm

@ import ammonite.ops._

def factorial(n: Int): Int = {
  if (n == 0) 
    1
  else
    n * factorial(n-1)
}

//println(factorial(8))

println("try,factoidal")
val random = scala.util.Random

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

@main
def main(tries: Int, n: Int) = {
  //for (i <- 1 to tries) println(s"$i,${factoidal(n)}")
  for (i <- 1 to tries) println(s"$i,${trioidal(n)}")
}


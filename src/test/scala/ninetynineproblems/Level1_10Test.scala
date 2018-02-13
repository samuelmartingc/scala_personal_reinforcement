package ninetynineproblems

import java.util.NoSuchElementException

import org.scalatest._
import ninetynineproblems.Level1_10._

class Level1_10Test extends FlatSpec with Matchers {
  "The lastListElement method" should "return last element in a list" in {
    val lastElement = 9
    val list = 0 :: 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: 7 :: 8 :: lastElement :: Nil
    val list2 = 0 :: 1 :: lastElement :: Nil
    lastListElement(list) shouldEqual lastElement
    lastListElement(list2) shouldEqual lastElement
    noException should be thrownBy lastListElement(list)
  }

  "The lastListElement method" should "throw an exception with empty list" in {
    the [NoSuchElementException] thrownBy {
      lastListElement(Nil)
    } should have message "Bad input"
  }

  "The penultimate method" should "return last but one element in a list" in {
    val lastElement = 9
    val lastButOneElement = 8
    val list = 0 :: 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: 7 :: lastButOneElement :: lastElement :: Nil
    val list2 = 0 :: lastButOneElement :: lastElement :: Nil
    penultimate(list) shouldEqual lastButOneElement
    penultimate(list2) shouldEqual lastButOneElement
    noException should be thrownBy penultimate(list)
  }

  "The penultimate method" should "throw an exception with empty list" in {
    the [NoSuchElementException] thrownBy {
      penultimate(Nil)
    } should have message "Bad input"
  }

  "The penultimate method" should "throw an exception with list with only one element" in {
    the [NoSuchElementException] thrownBy {
      penultimate(0 :: Nil)
    } should have message "Bad input, list with only one element"
  }
}

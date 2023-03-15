package u02

import BTrees.Tree.*
import junit.framework.TestCase.assertTrue
import org.junit.Assert.{assertEquals, assertFalse}
import org.junit.*
import u02.Negative.{genericNeg, neg, neg2}

class NegTest :

  @Test
  def testGenericNeg() =
    val empty: String => Boolean = _ == "" // predicate on strings
    val notEmpty = genericNeg(empty) // which type of notEmpty?
    assertTrue(notEmpty("foo")) // true
    assertFalse(notEmpty("")) // false
    assertTrue(notEmpty("foo") && !notEmpty("")) // true.. a comprehensive test
    val zero: Int => Boolean = _ == 0
    val notZero = genericNeg(zero)
    assertTrue(notZero(1))
    assertFalse(notZero(0))



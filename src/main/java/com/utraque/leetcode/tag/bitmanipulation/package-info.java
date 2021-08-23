package com.utraque.leetcode.tag.bitmanipulation;

/**
 * @see https://leetcode.com/tag/bit-manipulation/
 * @see https://www.techiedelight.com/bit-hacks-part-1-basic/
 *
// * n & 1 => 1, only when n is 1 at k.  Used in TEST
// * n | 1 => 1, always 1.  Used in SET
// * n ^ 1 => 1, only when n is 0, Used in INVERT, TEST if n is 0
// * n ^ 0 is n at k
 *
 *
 * to TEST if a and b are the same, use XOR.  eg. if a and b have the same sign
 * to TEST if n at position k is 1, use n & 1 at k.  eg. if n is odd, n & (1 << (k-1))
 * to SET n at position k to 1, use n | 1 at k.  eg. n | ~(1 << (k-1))
 * to SET n at position k to 0, use n & 0 at k. eg. n & ~(1 << (k-1))
 * to INVERT n at position k, use  n ^ (1 << (k - 1))
 * to INVERT all bits, use ~n
 *
 *
 * Specials:
 *
 * to add 1 to x, use -~x
 * to swap x and y, use x=x^y; y=x^y; x=x^y
 *
 * to unset the rightmost 1, use n & (n-1)
 * to TEST if n is a power of 2, eg. 1,2,4,8,16,..., use n & (n-1), and see if the value is 0
 * to FIND where the rightmost 1 is, use n ^ (n & (n - 1)), and do p times of n >> 1 until n is 0, to get p
 * to FIND the number of 1's, keep n & (n-1) until n is 0
 *
 *
 *
 *
 *
 * for (int i = 30; i <=0; i--) {
 *     if (x & (1<<i) !=0) System.out.print(1);
 *     else System.out.print(0);
 * }
 *
 */
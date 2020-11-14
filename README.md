# My checksum algorithm
Java beginner course task: writing a checksum algorithm

This is an exercise that I did during my university course in Java in 2019. I'm not an expert in checksum algorithms, this was one of many tasks and the goal was to practice functions, loops and  arrays. So this is my interpretation of the task. I choose to have this on GitHub because I want to have some documentation of my learning.

<h3>Background</h3> Checksum is a method that is used to verify that a bankaccount number is correct. The checksum is calculated according to this formula:<br>
d0 + f(d1) + d2 + f(d3) + d4 + ... = N 
<br>
d0 is the first number, d1 the second and so on, and N is the integer that is the checksum. If N modulo 10 is zero, then the account number is correct. 
My objective was to write a program that given a ten digit number, adds an eleventh number so that the checksum is allowed. We had to have a function that adds the eleventh number, that function calls two other functions, one that calculates the checksum and another that veryfies that the checksum is allowed. The function checksum have to call a function that takes an integer, multiplies it with 2 and returns the digit sum.

<h3>My solution</h3>

<b>main:</b> In the main function my program asks the user for a 10 digit number. I wanted the input to be exactly 10 digits, so the program will keep asking for input as long as the input is not 10 digits. Then the function extendAccount is called.

 <b>extendAccount:</b> I wanted to use the datastructures that we had learned in this Java basics course, and we had only learned about arrays. I knew that there are many more and dynamic datastructures, but I build my knowledge by throughly step by step understanding all the foundations. So I wanted to use arrays and forloops.
 The first foorloop makes the string bankNumber into an array, but this array have place for 11 integers. The second foorloop will put an integer in index 10, the eleventh number. In every iteration the functions allowed and checkSum is called. If the integer in index 10 will give an allowed 11-digit number, then the forloop breaks and the number is printed out. There is a case when the banknumber cannot be valid because the numbers that are entered does not give an allowed checksum. Then the program tells you so and program terminates.

<b>checkSum:</b> This function will recieve the array with 11 integers then make the calculation described in the background.  It will iterate througt the numbers, if an even number then it will just sum the number, else call function f. The sum, N, will be the return value.

<b>f:</b> The function f takes the uneven integer as argument, I then wrote an algorithm that multiplies  by 2 and then returns the sum of digits.  To sum the digits I used a whileloop with condition that it runs as long as number is greater than zero. <br>
I will here try to explain the summing algorithm with the example with uneven number 7 as argument. Multiplied by 2 gives number = 14. A variable will store 14 modulo 10 = 4. Then there is the division operation, and because it's not handling floats or doubles, just integers, then 14 divided by 10 is 1. So the loop will finally adding 1 + 4 together.
 I'm not so good at explaining in words, but this will make sense when ckecking out the code in function f!

<b>allowed:</b> This is a boolean function that checks condition N%10==0 . There is not much more to tell here.

# javabufferencrypto
# using bufferedreader
Readme for Character Statistics and Encryption Code
Overview
This Java program takes user input for their full name and favorite motto or Bible verse, and then performs character statistics and encryption on the input text.
The character statistics include counting the occurrences of each letter, digit, and space in the provided text. Additionally, 
the program calculates the total number of words and the number of characters excluding spaces. The text is then encrypted using a simple substitution cipher.

Usage
Compile the Java file: javac Main.java
Run the program: java Main
Input
Full Name: Enter your full name when prompted.
Favorite Motto or Bible Verse: Enter your favorite motto or Bible verse when prompted.
Output
Character Statistics:
The program will display the input text character by character and count the occurrences of each letter (case-insensitive), digit, and space.
The counts will be displayed next to each character.

Encrypted Code:
After displaying the character statistics, the program will encrypt the provided text using a simple substitution cipher.
Each character in the input text will be shifted by 10 positions in the Unicode table to produce the encrypted output.

Total Number of Words:
The program will calculate and display the total number of words in the provided text.

Characters Count:
The program will display the total number of characters in the input text, including spaces.

Characters Count Without Spaces:
The program will display the total number of characters in the input text, excluding spaces.

Submitted by:
The program will display the name provided by the user at the end of the output.

Encryption Algorithm
The encryption algorithm used in this program is a simple substitution cipher. 
It shifts each character in the input text by 10 positions in the Unicode table to generate the encrypted output.

Note
The program is case-insensitive when counting the occurrences of letters.
The program does not consider punctuation marks or special characters in the character statistics.
The encryption algorithm used in this program is basic and not suitable for secure encryption purposes.

Example
Enter Your Fullname: John Doe
Enter your favorite motto or bible verse: Love thy neighbor as thyself
***************************************
CHARACTER STATISTICS:
L - 1
o - 2
v - 1
e - 3
  - 5
t - 4
h - 4
y - 3
n - 3
a - 3
i - 1
g - 1
b - 1
r - 2
s - 1
   - 4
  - 4
t - 5
h - 4
y - 3
s - 1
e - 3
l - 1
f - 1

Encrypted Code: Xyte¨~pi|sw*km¨~}~diu*x|^~l|*z©¨~

Total Number of Words: 5
Characters count: 48
Characters count without spaces: 40
------------------------------------------------
Submitted by: John Doe
Disclaimer
This program is intended for educational and demonstration purposes only. The encryption algorithm used in this program is not suitable for secure encryption, 
and it is always recommended to use well-established and secure encryption methods for real-world applications.

# alphabet-cipher

Lewis Carroll published a cipher known as
[The Alphabet Cipher](http://en.wikipedia.org/wiki/The_Alphabet_Cipher)

This Alphabet Cipher involves alphabet substitution using a keyword.

First you must make a substitution chart like this, where each row of
the alphabet is rotated by one as each letter goes down the chart.

```
   ABCDEFGHIJKLMNOPQRSTUVWXYZ
   0                        26
   97                       122
 A abcdefghijklmnopqrstuvwxyz  97 / 0 
 B bcdefghijklmnopqrstuvwxyza         
 C cdefghijklmnopqrstuvwxyzab
 D defghijklmnopqrstuvwxyzabc
 E efghijklmnopqrstuvwxyzabcd e - c = g --> 
 F fghijklmnopqrstuvwxyzabcde
 G ghijklmnopqrstuvwxyzabcdef
 H hijklmnopqrstuvwxyzabcdefg
 I ijklmnopqrstuvwxyzabcdefgh
 J jklmnopqrstuvwxyzabcdefghi
 K klmnopqrstuvwxyzabcdefghij
 L lmnopqrstuvwxyzabcdefghijk
 M mnopqrstuvwxyzabcdefghijkl 109 - 115 --> M:109-97= 12 S:115-97=18  E:101-97=4 \ offset=12 a->15 26-11
 N nopqrstuvwxyzabcdefghijklm
 O opqrstuvwxyzabcdefghijklmn
 P pqrstuvwxyzabcdefghijklmno
 Q qrstuvwxyzabcdefghijklmnop
 R rstuvwxyzabcdefghijklmnopq
 S stuvwxyzabcdefghijklmnopqr
 T tuvwxyzabcdefghijklmnopqrs
 U uvwxyzabcdefghijklmnopqrst
 V vwxyzabcdefghijklmnopqrstu
 W wxyzabcdefghijklmnopqrstuv
 X xyzabcdefghijklmnopqrstuvw
 Y yzabcdefghijklmnopqrstuvwx
 Z zabcdefghijklmnopqrstuvwxy 122 / 26
```

Both parties need to decide on a secret keyword. This keyword is not written down anywhere, but memorized.

To encode the message, first write down the message.

```
meetmebythetree
```

Then, write the keyword, (which in this case is _scones_), repeated as many times as necessary.

```
sconessconessco
meetmebythetree
```

Now you can look up the column _S_ in the table and follow it down until it meets the _M_ row. The value at the
intersection is the letter _e_. All the letters would be thus encoded.

```
sconessconessco -> kolom waarde
meetmebythetree -> rij waarde letter
egsgqwtahuiljgs
```

The encoded message is now `egsgqwtahuiljgs`

To decode, the person would use the secret keyword and do the opposite.

## Excercise

Make a system that can code and decode a message with an alphabet-cypher.

## License

Copyright © 2014 Carin Meier

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

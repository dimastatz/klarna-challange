<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=yes">

<title>Instructions:</title>

</head>
<body>

<h1>Instructions:</h1>

<p>The following exercise contains two user stories for you to implement (and a third one that you shouldn't worry about for now). Each user story relies on the previous one.
Your goal is to have a working program in the language of your choice that implements these use cases.</p>

<p>You can assume the input is valid. You don't need to handle unexpected characters or invalid spacing in the input file.</p>

<h2>Guidelines:</h2>

<p>We value clean code and good object oriented design.</p>

<p>By clean code we mean:</p>

<ul>
<li>Concise and descriptive variable and method names.</li>
<li>Good use of the programming language.</li>
<li>Easy to read.</li>
<li>a README (run/compile instructions)</li>
</ul>


<p>By good design we mean:</p>

<ul>
<li>Object oriented design principles. ( e.g. <a href="http://en.wikipedia.org/wiki/SOLID">SOLID</a>)</li>
<li>Good separation of concerns.</li>
<li>A simple, practical solution.</li>
</ul>


<p>Mostly we are interested in code that makes <strong>you</strong> proud.</p>

<p>If you could add some tests as well, that would really be icing on the cake.</p>

<h2>User Story 1 - Parse invoice numbers</h2>

<p>We have recently decided to digitize our old invoice archives. Since finding a
volunteer for such an arduous task was impossible, an employee was selected at
random and instructed to type in all invoice numbers into a text file.</p>

<p>Little did we know that the employee we picked is an aspiring ASCII artist.
Instead of handing us a file containing a set of numbers, we ended up with
7-segment display representations of the invoice numbers.</p>

<p>This is where you come in. Write a program that given an input text file of 7-segment invoice numbers,
outputs a text file with the parsed invoice numbers.</p>

<p><strong>Input:</strong></p>

<ul>
<li><p>A text file containing several hundreds of invoice numbers in the following
form:</p>

<pre><code>      _  _     _  _  _  _  _  (line 1)
    | _| _||_||_ |_   ||_||_| (line 2)
    ||_  _|  | _||_|  ||_| _| (line 3)
                              (line 4)
      _  _  _  _  _  _     _  (line 5)
  |_||_|| ||_||_   |  |  ||_  (line 6)
    | _||_||_||_|  |  |  | _| (line 7)
                              (line 8)
</code></pre>

<p>  <strong>Invoice number format:</strong></p>

<ul>
<li>Each invoice number is constructed of 9 digits [0..9]</li>
<li>Invoice number is written using ‘_’ and ‘|’ characters.</li>
<li>Invoice number input takes 4 lines.</li>
<li>The first 3 lines contain 27 characters.</li>
<li>The fourth line is blank.</li>
</ul>


<p>  <strong>Note:</strong> You can use <code>input_user_story_1.txt</code> to feed your program.</p></li>
</ul>


<p><strong>Output:</strong></p>

<ul>
<li><p>A text file with the parsed invoice numbers. One number per row.</p>

<p>  Example:</p>

<pre><code>  123456789
  490867715
</code></pre>

<p>  <strong>Note:</strong> You can use <code>output_user_story_1.txt</code> to test that the output file generated by your program is correct.</p></li>
</ul>


<h2>User Story 2 - Illegal column</h2>

<p>Typing in invoices proved rather tedious for our hapless employee, so it is no
wonder he had the occasional typo. We need to track these errors, and you're
just the man for the job.
Extend the functionality implemented in the previous user story to handle illegal digits. Replace the illegal digits with a <code>?</code> and add a second column indicator <code>ILLEGAL</code>.</p>

<p><strong>Input:</strong></p>

<ul>
<li><p>Same as above, but in this case there might be invoices with illegal digits.</p>

<p>  Example:</p>

<pre><code>      _  _     _  _  _  _  _  (line 1)
    | _| _||_||_ |_   ||_||_| (line 2)
    ||_  _|  | _||_|  ||_| _| (line 3)
                              (line 4)
      _  _  _  _  _  _     _  (line 5)
  |_||_|| ||_||    |  |  ||_  (line 6)
    | _||_||_||_|  |     | _| (line 7)
                              (line 8)
</code></pre>

<p>  <strong>Note:</strong> You can use <code>input_user_story_2.txt</code> to feed your program.</p></li>
</ul>


<p><strong>Output:</strong></p>

<ul>
<li><p>A text file with the parsed invoice numbers. One invoice per row.</p>

<p>  Example:</p>

<pre><code>  123456789
  4908?7?15 ILLEGAL
</code></pre>

<p>  <strong>Note:</strong> You can use <code>output_user_story_2.txt</code> to test that the output file generated by your program is correct.</p></li>
</ul>


<h2>User Story 3 - Top Secret</h2>


<p><strong>Input:</strong></p>

<ul>
<li><p>Example:</p>

<pre><code>   _  _  _     _  _  _  _  _  (line 1)
  |_  _||_|  || ||_ |_  _||_| (line 2)
   _||_  _|  ||_| _| _| _||_| (line 3)
                              (line 4)
</code></pre></li>
</ul>


<p><strong>Output:</strong></p>

<ul>
<li><p>Example:</p>

<pre><code>  529105538 ERROR
</code></pre></li>
</ul>

</body>
</html>
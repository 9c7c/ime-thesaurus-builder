<h1>Wubi86 <small>word table tranfser tool</small></h1>

<h7>version: 0.2a <small>Jun-30-2016 updated</h7>

<p>Refactoring the code</p>
<br>
<br>
<h5>Update</h5>
  <ul>
    <li>1. add class main for the entry of the program</li>
    <li>2. refact the class SingleCharacter. all character's wubi86 code will be the first single-word-code</li>
    <li>3. add class ThesaurusFormat to manage the different IME thesaurus.</li>
    <li>4. unify the wubi word code with 1st, 2nd, 3rd and the last code, whatever the lenght of the target words.
    	And don't care whether has the comment in the word.</li>
  </ul>

---------------------------
<h7>version: 0.1a</h7>

<p>provide the word list, translate it into wubi code, and output the wordTable file</p>
<br>
<br>
<h5>Function</h5>
<ul>
  <li>1. If the word length less or equal 4 charactors, will pick each charactor's 1st code of single wubi-charactor-code and combine them into 4 letters wubi word code; if their length larger than 4 charactors, will pich the 1st, 2nd, 3rd and the last charactors for its wubi word code.</li>
  <li>2. When the charactor belongs to the wubi-level-one-code, will using their 1st code of single wubi-charactor-code, instand of the level one code. The level 1 code charactor and 1st wubi code list is as below:
  <ul>
    <li>一 - [g]</li>
    <li>地 - [f]</li>
    <li>在 - [d]</li>
    <li>要 - [s]</li>
    <li>工 - [a]</li>
    <li>上 - [h]</li>
    <li>是 - [j]</li>
    <li>中 - [k]</li>
    <li>国 - [l]</li>
    <li>同 - [m]</li>
    <li>和 - [t]</li>
    <li>的 - [r]</li>
    <li>有 - [d]</li>
    <li>人 - [w]</li>
    <li>我 - [t]</li>
    <li>主 - [y]</li>
    <li>产 - [u]</li>
    <li>不 - [g]</li>
    <li>为 - [y]</li>
    <li>这 - [y]</li>
    <li>民 - [n]</li>
    <li>了 - [b]</li>
    <li>发 - [n]</li>
    <li>以 - [n]</li>
    <li>经 - [x]</li>
  </ul>
  </li>
</ul>
<br>
<h5>Notice</h5>
<p>
  The word which contant comma, like "既来之,则安之"; will consider into wrong word, do not be transfered.<br>
</p>

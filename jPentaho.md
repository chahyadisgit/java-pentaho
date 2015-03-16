## Requirements ##
<ul>
<blockquote><li>jdk 1.6</li>
<li>maven</li>
</ul></blockquote>

## Libraries ##

> <li>pentaho-kettle 4.4.3-SNAPSHOT</li>
> > <ol>
<blockquote><li>kettle-core</li>
<li>kettle-db</li>
<li>kettle-engine</li>
<li>kettle-ui-swt</li>
<li>kettle-core</li>
</blockquote><blockquote></ol>
</blockquote>
> <li>pentaho-library</li>
> > `libformula 5.0.5`

> <li>org.codehaus.janino</li>
> > `janino 2.5.16`

> <li>rhino</li>
> > `js 1.7R2`

> <li>javax.mail</li>
> > `mail 1.4.1`

> <li>log4j<li>
<blockquote><code>log4j 1.2.8</code>
</blockquote><blockquote><li>commons-vfs</li>
<blockquote><code>commons-vfs 1.0</code></blockquote></blockquote>

<hr />
<h3>Note:</h3>
Jika gagal download library pentaho kettle dari maven, silahkan untuk meregister sendiri sesuai dengan struktur dependency-nya.<br>
<br>
atau bisa menggunakan syntax maven berikut:<br>
<pre><code>mvn install:install-file -Dfile=&lt;path_file&gt;/xxxxx.jar -DgroupId=[groupId] -DartifactId=[artifactId] -Dversion=[version] -Dpackaging=jar<br>
</code></pre>
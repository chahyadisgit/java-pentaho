# java-pentaho
Automatically exported from code.google.com/p/java-pentaho

##Requirements
<ul>
<li>jdk 1.6</li>
<li>maven 3</li>
</ul>
##Libraries
<ul>
<li>pentaho-kettle 4.4.3-SNAPSHOT</li>
<li>kettle-core</li>
<li>kettle-db</li>
<li>kettle-engine</li>
<li>kettle-ui-swt</li>
<li>kettle-core</li>
<li>pentaho-library</li>
<li>libformula 5.0.5</li>
<li>org.codehaus.janino</li>
<li>janino 2.5.16</li>
<li>rhino</li>
<li>js 1.7R2</li>
<li>javax.mail</li>
<li>mail 1.4.1</li>
<li>log4j</li>
<li>log4j 1.2.8</li>
<li>commons-vfs</li>
<li>commons-vfs 1.0</li>
</ul>

##Note:
Jika gagal download library pentaho kettle dari maven, silahkan untuk meregister sendiri sesuai dengan struktur dependency-nya.

atau bisa menggunakan syntax maven berikut:

        mvn install:install-file -Dfile=<path_file>/xxxxx.jar -DgroupId=[groupId] -DartifactId=[artifactId] -Dversion=[version] -Dpackaging=jar

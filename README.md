# Asterisk-IM

The Asterisk-IM project integrates the Asterisk PBX and Openfire XMPP (Jabber) server to create a unified communication platform for telephony and instant messaging.

Asterisk-IM is easily deployed as a plugin for Openfire and is fully supported in the Spark IM client. 

Read more about Asterisk-IM's architecture or find out more about client compatability.


## How to build on a clean CentOS7 machine

```
sudo yum -y install java-1.8.0-openjdk-devel java-1.8.0-openjdk-headless java-1.8.0-openjdk git maven unzip
wget https://www.igniterealtime.org/downloadServlet?filename=openfire/openfire-4.0.4-1.i386.rpm -O openfire-4.0.4-1.i386.rpm
rpm2cpio openfire-4.0.4-1.i386.rpm |  cpio -iv --to-stdout ./opt/openfire/lib/openfire.jar > openfire.jar
mvn install:install-file -DgroupId=org.igniterealtime.openfire -DartifactId=openfire -Dversion=4.0.4 -Dpackaging=jar -DgeneratePom=true -Dfile=openfire.jar
# you'll have to build jtapi from official Oracle sources in Eclipse, and then copy to your home directory here
mvn install:install-file -DgroupId=javax.telephony -DartifactId=jtapi -Dversion=1.3.1 -Dpackaging=jar -DgeneratePom=true -Dfile=jtapi-1.3.1.jar
wget http://www.java2s.com/Open-Source/Java_Free_CodeDownload/m/maven-openfire-plugin-master.zip
unzip maven-openfire-plugin-master.zip
cd maven-openfire-plugin-master
mvn clean install
mvn install:install-file -Dfile=target/maven-openfire-plugin-1.0.2-SNAPSHOT.jar -DpomFile=pom.xml
cd ..
git clone https://github.com/igniterealtime/asterisk-im.git
cd asterisk-im/
mvn clean install

The plugin is now in ./server/target/asterisk-im.jar
```

...
140  yum -y install java-1.8.0-openjdk-devel java-1.8.0-openjdk-headless java-1.8.0-openjdk git maven unzip
  141  wget https://www.igniterealtime.org/downloadServlet?filename=openfire/openfire-4.0.4-1.i386.rpm -O openfire-4.0.4-1.i386.rpm
  142  wget -i https://www.igniterealtime.org/downloadServlet?filename=openfire/openfire-4.0.4-1.i386.rpm -O openfire-4.0.4-1.i386.rpm
  143  curl -k  https://www.igniterealtime.org/downloadServlet?filename=openfire/openfire-4.0.4-1.i386.rpm -O openfire-4.0.4-1.i386.rpm
  144  wget https://github.com/igniterealtime/Openfire/releases/download/v4.0.4/openfire-4.0.4-1.i386.rpm
  145  rm openfire-4.0.4-1.i386.rp*
  146  wget https://github.com/igniterealtime/Openfire/releases/download/v4.0.4/openfire-4.0.4-1.i386.rpm
  147  rpm2cpio openfire-4.0.4-1.i386.rpm |  cpio -iv --to-stdout ./opt/openfire/lib/openfire.jar > openfire.jar
  148  mvn install:install-file -DgroupId=org.igniterealtime.openfire -DartifactId=openfire -Dversion=4.0.4 -Dpackaging=jar -DgeneratePom=true -Dfile=openfire.jar
  149  mvn install:install-file -DgroupId=javax.telephony -DartifactId=jtapi -Dversion=1.3.1 -Dpackaging=jar -DgeneratePom=true -Dfile=jtapi-1.3.1.jar
  150  wget http://www.java2s.com/Open-Source/Java_Free_CodeDownload/m/maven-openfire-plugin-master.zip
  151  unzip maven-openfire-plugin-master.zip
  152  cd maven-openfire-plugin-master
  153  mvn clean install
  154  mvn install:install-file -Dfile=target/maven-openfire-plugin-1.0.2-SNAPSHOT.jar -DpomFile=pom.xml
  155  cd ..
  156  git clone https://github.com/igniterealtime/asterisk-im.git
  157  cd asterisk-im/
  158  mvn clean install
  159  rpm --help
  160  yum install /root/openfire-4.0.4-1.i386.rpm
  161  service openfire
  162  service openfire status
  163  service openfire start
  164  journalctl -xe
  165  yum install libstdc++.i686
  166  service openfire start
  167  journalctl -xe
  168  /etc/init.d/openfire start
  169  /etc/init.d/openfirestatus
  170  /etc/init.d/openfire status
  171  bash -x /etc/init.d/openfire status
  172  /opt/openfire/jre/bin/java -server  -DopenfireHome=/opt/openfire -Dopenfire.lib.dir=/opt/openfire/lib -classpath "/opt/openfire/lib/startup.jar" -jar "/opt/openfire/lib/startup.jar"
  173  yum -y install libldb.i686
  174  /opt/openfire/jre/bin/java -server  -DopenfireHome=/opt/openfire -Dopenfire.lib.dir=/opt/openfire/lib -classpath "/opt/openfire/lib/startup.jar" -jar "/opt/openfire/lib/startup.jar"
175  /etc/init.d/openfire start
...

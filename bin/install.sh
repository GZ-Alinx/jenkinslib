#!/bin/bash


nodejs_version=14.15.1
maven_version=3.6.3
ant_version=null
gradle_version=6.7.1


wget -V
if [ $? -eq 0 ]; then
    echo "wget existence"
else
    echo "wget not existence"
    exit 1
fi

yum install ansible -y

function npmInstall() {
  wget https://nodejs.org/dist/v{nodejs_version}/node-v${nodejs_version}-linux-x64.tar.xz
  if [ $? -eq 0 ]; then
      echo "nodejs download Success"
      tar -xf node-v${nodejs_version}-linux-x64.tar.gz -C /usr/local/  && ln -sv /usr/local/node-v${nodejs_version}-linux-x64 /usr/local/nodejs
      /usr/local/nodejs/bin/npm -v
      if [ $? -eq 0 ]; then
          echo "npm install Success"
      else
          echo "npm install Faild"
          exit 1
      fi
  else
      echo "nodejs package download error"
      exit 1
  fi
}

function mavenInstall() {
  wget https://mirror.bit.edu.cn/apache/maven/maven-3/${maven_version}/binaries/apache-maven-${maven_version}-bin.tar.gz
  if [ $? -eq 0 ]; then
      echo "nodejs download Success"
      tar -xf apache-maven-{maven_version}-bin.tar.gz -C /usr/local/ && ln -sv /usr/local/apache-maven-{maven_version}/ /usr/local/maven
      /usr/local/maven/bin/mvn -v
      if [ $? -eq 0 ]; then
          echo "maven install Success"
      else
          echo "maven install Faild"
          exit 1
      fi
  else
      echo "nodejs package download error"
      exit 1
  fi
}

function gradleInstall() {
  wget https://nodejs.org/dist/v${nodejs_version}/node-v${nodejs_version}-linux-x64.tar.xz
  if [ $? -eq 0 ]; then
      echo "nodejs download Success"
      tar -xf ./package/gradle-${nodejs_version}-bin.zip -C /usr/local/  && ln -sv /usr/local/gradle-${nodejs_version} /usr/local/gradle
      /usr/local/gradle/bin/gradle -v
      if [ $? -eq 0 ]; then
          echo "gradle install Success"
      else
          echo "gradle install Faild"
          exit 1
      fi
  else
      echo "gradle package download error"
      exit 1
  fi
}


function run() {
    npmInstall
    mavenInstall
    #gradleInstall
}
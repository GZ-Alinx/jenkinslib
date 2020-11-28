package org.devops

/*
所有的组件都装在/usr/local/ 目录下
/usr/local/gradle/
/usr/local/maven/
/usr/local/ant/
/usr/local/nodejs/

实例
tar -xf node-v10.14.1-linux-x64.tar.gz -C /usr/local/  && ln -sv node-v10.14.1-linux-x64 nodejs
*/

// 可用
def Gradle(shell){
    println("use gradle build")
    GRADLE = "/usr/local/gradle/bin/"
    sh """${GRADLE}/gradle ${shell}"""
    // gradle clear bootJar --stacktace --info --debug 注意参数填写
}

// 可用
def Maven(shell){
    println("use maven build")
    mvn="/usr/local/maven/bin/"
    sh """${mvn}/mvn ${shell}"""
    //  mvn clean install 注意参数填写
}

// 未测试过
def Ant(shell){
    println("use ant build")
    sh """
        ANT_HOME=/usr/local/ant/
        PATH=$PATH:$HOME/bin:$ANT_HOME/bin
        export PATH
        ant ${shell}
        """
    // 注意参数填写
}

// 可用
def NODEJS(shell){
    println("use nodejs build")
    NPM = "/usr/local/nodejs/bin/"
    sh """${NPM}/npm ${shell}"""
    // npm install && npm build  注意参数填写
}



// 构建选择，传递构建指令
def BUILD(Btype,shell) {
    if (Btype == "gradle"){
        Gradle(shell)
        return "${Btype} Success"
    }else if(Btype == "Maven"){
        Maven(shell)
        return "${Btype} Success"
    }else if(Btype == "Ant"){
        Ant(shell)
        return "${Btype} Success"
    }else if(Btype == "npm"){
        NODEJS(shell)
        return "${Btype} Success"
    }
}
package org.devops

/*
所有的组件都装在/usr/local/ 目录下
*/

// gradle build
def Gradle(shell){
    sh """
        GRADLE_HOME=/usr/local/gradle/
        PATH=$PATH:$HOME/bin:$GRADLE_HOME/bin
        export PATH
        gradle ${shell}
        """
    // gradle clear bootJar --stacktace --info --debug 注意参数填写
}


def Maven(shell){
    sh """
        MAVEN_HOME=/usr/local/maven/
        PATH=$PATH:$HOME/bin:$MAVEN_HOME/bin
        export PATH
        mvn ${shell}
        """
    //  mvn clean install 注意参数填写
}

def Ant(shell){
    sh """
        ANT_HOME=/usr/local/ant/
        PATH=$PATH:$HOME/bin:$ANT_HOME/bin
        export PATH
        ant ${shell}
        """
    // 注意参数填写
}


def NPM(shell){
    sh """
        NODE_HOME=/usr/local/nodejs/
        PATH=$PATH:$HOME/bin:$NODE_HOME/bin
        export PATH
        npm ${shell}
        """
    // npm install && npm build  注意参数填写
}


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
        NPM(shell)
        return "${Btype} Success"
    }
}
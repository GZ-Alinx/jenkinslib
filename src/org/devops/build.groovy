package org.devops


// 构建方法 构建类型
def build(){
    println("build ok")
}



//
//
//def Build(BuildType, BuildShell){
//    def buildTools = ["mvn":"M2","ant":"ANT","gradle":"GRADLE","npm":"NPM"]
////    BuildHome = tool buildTools[BuildType]
//    println("当前构建的类型为: ${BuildType}")
//    println("非常好，已经调用到共享库方法了")
//    if ("${BuildType}" == "npm"){
//
//    }else if ("${BuildType}" == "maven"){
//        println("maven")
//        sh """
//        export NODE_HOME=${BuildHome}
//        export PATH=\$NODE_HOME/bin:/$PATH
//        ${BuildHome}/bin/${BuildType} ${BuildShell}"""
//    }else if ("${BuildType}" == "gradle"){
//        println("gradle")
//        sh """
//        export NODE_HOME=${BuildHome}
//        export PATH=\$NODE_HOME/bin:/$PATH
//        ${BuildHome}/bin/${BuildType} ${BuildShell}"""
//    }else if ("${BuildType}" == "ant"){
//        println("ant")
//
//        sh """
//        export NODE_HOME=${BuildHome}
//        export PATH=\$NODE_HOME/bin:/$PATH
//        ${BuildHome}/bin/${BuildType} ${BuildShell}"""
//    }else {
//        sh "${BuildHome}/bin/${BuildType} ${BuildShell}"
//    }

    // 适用于参数化构建

}



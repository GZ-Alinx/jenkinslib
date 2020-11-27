package org.devops


// 构建方法 构建类型
def build(BuildType, shell){
    ret = println(BuildTyep,shell)
    return ret
}


// 构建类型

// 定义一个buildTools的map
// def buildTools = ["mvn":"M2","ant":"ANT","gradle":"GRADLE","npm":"NPM"]

//def Build(buildType,buildShell){
//
//    // 定义一个buildTools的map
//    def buildTools = ["mvn":"M2","ant":"ANT","gradle":"GRADLE","npm":"NPM"]
//
//    println("当前选择的构建类型是${buildType}")
//    // 获取buildHome
//    buildHome = tool buildTools[buildType]
//
//    // 判断是否为NPM，因为NPM需要加载一次环境变量
//    if ("${buildType}"=="npm"){
//        sh """
//          export NPM_HOME=${buildHome}
//          export PATH=\$PATH:\$NPM_HOME/bin
//          ${buildHome}/bin/${buildType} ${buildShell}
//      """
//    }else{
//        // 执行打包
//        sh "${buildHome}/bin/${buildType} ${buildShell}"
//    }
//}


package org.devops


// 构建方法 构建类型
def Build(BuildType,BuildShell){
    def buildTools = ["mvn":"M2","ant":"ANT","gradle":"GRADLE","npm":"NPM"]
    BuildHome = tool buildTools[BuildType]
    println("当前构建的类型为: ${BuildType}")
    // 适用于参数化构建
    sh "${BuildHome}/bin/${BuildType} ${BuildShell}"
}
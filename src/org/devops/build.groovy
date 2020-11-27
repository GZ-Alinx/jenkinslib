package org.devops


// 构建方法 构建类型
def build(BuildTyep, shell1,shell2){

    println("当前选择的构建类型是${buildType}")

    // 判断是否为NPM，因为NPM需要加载一次环境变量
    if ("${BuildTyep}" != "npm"){
        sh """
          export BUILD_HOME=${buildHome}
          export PATH=\$PATH:\$BUILD_HOME/bin
          ${buildHome}/bin/${buildType} ${shell1}
        """
    }else{
        // 执行打包
        sh "${buildHome}/bin/npm ${shell1}"
        sh "${buildHome}/bin/npm ${shell2}"
    }

}
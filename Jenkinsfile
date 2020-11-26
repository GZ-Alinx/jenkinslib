#!/groovy

// 库引用
@Library('jenkinslib'@master) _

// 方法引用
def build = new org.devops.build()


// 流水线
pipeline {
    // 执行节点
    agent any

    // 代码获取阶段
    stages {
        stage("代码获取"){
            // 步骤
            steps{
                script{
                    println("code get")
                }
            }
        }
    }

    // 打包阶段
    stages {
        stage("构建打包"){
            // 步骤
            steps{
                script{
                    println("build package")
                }
            }
        }
    }

    // 发布阶段
    stages {
        stage("代码获取"){
            // 步骤
            steps{
                script{
                    println("deploy server")
                }
            }
        }
    }
}

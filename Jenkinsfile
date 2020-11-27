#!/groovy

// 库引用
@Library('jenkinslib') // jenkins系统设置中添加配置后引用


// 方法引用
def build = new org.devops.build()
def deploy = new org.devops.deploy()

// 获取jenkins内部参数变量
String buildType = env.buildType
String buildShell = env.buidlShell
String deployHosts = env.deployHosts




// 流水线
pipeline {
    // 执行节点
    agent any

    // 代码获取阶段
    stages {
        stage("代码获取") {
            // 步骤
            steps {
                script {
                    println("code get")
                }
            }
        }
        // 打包阶段
        stage("构建打包") {
            // 步骤
            steps {
                script {
                    println("build package")
                }
            }
        }
        // 发布阶段
        stage("deploy") {
            // 步骤
            steps {
                script {
                    build.build()
                    deploy.AnsibleDeploy("${deployHosts}", "-m ping")
                    println("deploy server")
                }
            }
        }
    }
}
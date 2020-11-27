#!/groovy

// 库引用
@Library('jenkinslib') // jenkins系统设置中添加配置后引用


// 方法引用
def build = new org.devops.build()
def deploy = new org.devops.deploy()

// 获取jenkins内部参数变量
String buildType = env.BuildType
String buildShell = env.BuildShell
String deployHosts = env.deployHosts
String SrcUrl = env.src
String DEST = env.dest

// 参数化构建配置这两个选线参数
String MODULE = env.module
String ARGS = env.args



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
                    println("args ----------------------------------")
                    println(buildShell)
                    println(deployHosts)
                    println(buildType)
                    println("args ----------------------------------")
//                    build.build("${buildType}","${buildShell}")
//                  deploy.AnsibleDeploy("${deployHosts}", "-m ping")

                    deploy.AnsibleDeploy(deployHosts,MODULE,ARGS)
                    println("deploy server")
                }
            }
        }
        stage("scpDeploy") {
            steps {
                script{
                    deploy.ScpDeploy(SrcUrl,DEST)
                    println("scp Success")
                }
            }
        }
    }
}
#!/groovy

// 库引用
@Library('jenkinslib') // jenkins系统设置中添加配置后引用


// 方法引用
def build = new org.devops.build()
def deploy = new org.devops.deploy()

// 获取jenkins内部参数变量
String buildType = env.BuildType
String buildShell = env.BuildShell
String deployServices = env.deployServices
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
                    checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'f9c9f149-0c46-4cf2-9586-37f39af51bcb', url: 'http://192.168.56.101:8888/root/cicd-services.git']]])
                }
            }
        }
        // 打包阶段
        stage("构建打包") {
            // 步骤
            steps {
                script {
                    println("Start build package----------------------------------")
                    build.BUILD(buildType,buildShell)

                }
            }
        }
        // scp拷贝
        stage("文件拷贝") {
            steps {
                script{
                    deploy.ScpDeploy(SrcUrl,DEST)
                    println("scp Success")
                }
            }
        }
        // Ansible模块
        stage("部署发布") {
            steps {
                script {
                    deploy.AnsibleDeploy(deployServices,MODULE,ARGS)
                    println("deploy server")
                }
            }
        }
        // 健康检查
        stage("健康检查") {
            steps {
                script {
                    println("健康检查")
                }
            }
        }
    }
}
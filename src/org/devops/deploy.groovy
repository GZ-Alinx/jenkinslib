package org.devops

// 部署方法

def AnsibleDeploy(func,hosts){
    sh "ansible  ${func} ${hosts}"
}
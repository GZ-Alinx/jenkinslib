package org.devops

// 部署方法

def AnsibleDeploy(func,hosts){
    sh "ansible  ${func} ${hosts}"
}

def ScpDeploy(src,dest){
    sh "sudo scp -r ${url} ${dest}"
}
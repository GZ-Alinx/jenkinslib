package org.devops

// 部署方法

def AnsibleDeploy(hosts,func){
    sh "ansible  ${func} ${hosts}"
}
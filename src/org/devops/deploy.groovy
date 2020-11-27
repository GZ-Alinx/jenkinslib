package org.devops


// 路径查询
def FindFlie(){
    println("Find File")
    return
}


// 部署方法

// Ansible执行
def AnsibleDeploy(deployServices,module,args){
    sh "ansible ${deployServices} -m ${module} -a '${args}'"
    return "Success"
}

// scp拷贝
def ScpDeploy(SrcUrl,dest){
    sh "sudo scp -r ${SrcUrl} ${dest}"
    return "Success"
}
package org.devops


// 路径查询
def FindFlie(){
    println("Find File")
    return
}


// 部署方法

// Ansible执行
def AnsibleDeploy(module,hosts,args){
    sh "ansible ${hosts} -m ${module} -a '${args}'"
    return
}

// scp拷贝
def ScpDeploy(SrcUrl,dest){
    sh "sudo scp -r ${SrcUrl} ${dest}"
    return
}
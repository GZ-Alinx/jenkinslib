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
    println("Ansible Execution Success")
    return "Success"
}

// scp拷贝
def ScpDeploy(SrcUrl,dest){
    sh """
    if [ ! -d "/"];then sudo scp -r ${SrcUrl} ${dest};else ssh ${user}@${host}:${dest}
    """
    println("scp Execution Success")
    return "Success"
}

// kubernetes 发布
def KubernetesDeploy(){
    println("K8s deploy")
}
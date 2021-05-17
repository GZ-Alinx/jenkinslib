package org.devops
// Pipeline Utility Steps Plugin   基于此插件进行构建
import hudson.model.*;


// 文件中读取json到字符串
def ToFile_read_json(filePath) {
    def propMap = readJSON file : filePath
    proMap.each {
        it.key + "=" + it.value
    }
}

// 字符串json中读取到字符串
def ToText_read_json(json_String) {
    def propMap = readJSON text : json_String
    propMap.each {
        it.key + "=" + it.value
    }
}
return this
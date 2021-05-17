package org.devops



def mail(subject, bodys, status, project,users,files) {
    // 邮件结合 jenkins 邮件插件( Email Extension )完成使用
    emailext(
            body:"""
                模板
            """,
            subject: subject,
            mimeType: 'text/html',
            to: users,
            attachmentsPattern: files
    )
}


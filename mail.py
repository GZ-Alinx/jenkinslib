from email.mime.text import MIMEText
from email.header import Header
import smtplib
from email.utils import parseaddr, formataddr


def __format_addr(k):
    name, addr = parseaddr(k)
    return formataddr((Header(name, 'utf-8').encode(), addr))


def send_mail():
    # 发件人你信息
    wy_server = 'smtp.163.com'
    sender_163 = 'itadminlx@163.com'
    pwd = 'xxx'
    sender_163_mail = 'itadminlx@163.com'
    # 收件人
    receivers = ['itadminlx@163.com', '1135189009@qq.com']

    # 邮件的正文
    mail_content = '你好，这是使用python登录163邮箱发邮件的测试'
    # 邮件标题
    mail_title = 'Jenkins构建告警邮件通知'

    try:
        # ssl登录
        smtp = smtplib.SMTP_SSL(wy_server)
        # set_debuglevel()是用来调试的。参数值为1表示开启调试模式，参数值为0关闭调试模式
        smtp.set_debuglevel(0)
        smtp.ehlo(wy_server)
        smtp.login(sender_163, pwd)

        msg = MIMEText(mail_content, "plain", 'utf-8')
        msg["Subject"] = Header(mail_title, 'utf-8').encode()
        msg["From"] = __format_addr(sender_163_mail)
        msg["To"] = __format_addr(receivers)
        smtp.sendmail(sender_163_mail, receivers, msg.as_string())
        smtp.quit()
        return "邮件发送成功"
    except smtplib.SMTP_SSLException as e:
        return "邮件发送失败"


if __name__ == "__main__":
    print(send_mail())

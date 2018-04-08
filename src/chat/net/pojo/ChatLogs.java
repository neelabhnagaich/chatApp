
package chat.net.pojo;


public class ChatLogs {

    @Override
    public String toString() {
        return  "userName=" + userName + ", message=" + message + ", msgTime=" + msgTime ;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(String msgTime) {
        this.msgTime = msgTime;
    }
    
    private String userName;
    private String message;
    private String msgTime;
    
}

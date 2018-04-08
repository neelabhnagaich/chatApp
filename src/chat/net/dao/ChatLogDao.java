
package chat.net.dao;

import chat.net.dbutil.DbUtil;
import chat.net.pojo.ChatLogs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ChatLogDao {
    static Connection conn;
    static PreparedStatement ps; 
    public static boolean addChatLog(ChatLogs cl) throws SQLException
    {
        conn = DbUtil.getConnection();
        ps = conn.prepareStatement("insert into chatlogs values(?,?,?)");
        
        ChatLogs clogs = new ChatLogs();
        String userName = clogs.getUserName();
        String msg  = clogs.getMessage();
        String msgTime = clogs.getMsgTime();
        
        ps.setString(1,userName);
        ps.setString(2,msg);
        ps.setString(3,msgTime);
        
        int ans = ps.executeUpdate();

        return ans!=0;
    }
}

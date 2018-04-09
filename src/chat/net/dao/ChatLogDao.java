
package chat.net.dao;

import chat.net.dbutil.DbUtil;
import chat.net.pojo.ChatLogs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ChatLogDao {
    static Connection conn;
    static PreparedStatement ps; 
    public static boolean addChatLog(ChatLogs clogs) throws SQLException
    {
        conn = DbUtil.getConnection();
        ps = conn.prepareStatement("insert into chatlogs values(?,?,?)");
        
        
        String userName = clogs.getUserName();
        String msg  = clogs.getMessage();
        String msgTime = clogs.getMsgTime();
        
        System.out.println(clogs);
        ps.setString(1,userName);
        ps.setString(2,msg);
        ps.setString(3,msgTime);
        
        int ans = ps.executeUpdate();

        System.out.println(ans);
        return ans!=0;
    }
}


package modelo;


public class Database {
    private String url;
    private String uss;
    private String pwd;
    private String driver;
    
    public Database(){
        this.url="jdbc:mysql://localhost:3306/Personnel_management?useServerPrepStmts=true";
        this.uss="root";
        this.pwd="";
        this.driver="com.mysql.cj.jdbc.Driver";
    }

    public String getUrl() {
        return url;
    }

    public String getUss() {
        return uss;
    }

    public String getPwd() {
        return pwd;
    }

    public String getDriver() {
        return driver;
    }
    
}


package dao;

import com.sun.jdi.connect.spi.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.*;
import java.sql.*;
import java.sql.DriverManager;



public class DAOemployee implements Operaciones{

    Database db = new Database();
    employee emp = new employee();
    
    @Override
    public boolean insertar(Object obj) {
        emp = (employee) obj;
        java.sql.Connection con;
        PreparedStatement pst;
        String sql="insert into employee values(?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUss(),
                    db.getPwd()
            ); 
            
            pst=con.prepareStatement(sql);
            pst.setInt(1,emp.getNumberID());
            pst.setInt(2,emp.getIdType());
            pst.setString(3,emp.getName1());
            pst.setString(4,emp.getName2());
            pst.setString(5,emp.getSurname1());
            pst.setString(6,emp.getSurname2());
            pst.setInt(7,emp.getIdMaritalStatus());
            pst.setInt(8,emp.getIdGender());
            pst.setString(9,emp.getAddress());
            pst.setString(10,emp.getPhone());
            pst.setString(11,emp.getBirthDate());
            
            int filas = pst.executeUpdate();
            if(filas>0){
                con.close();
                return true;
            }
            else{
                con.close();
                return false;
            }
        }catch(SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    " Ocurrio el siguiente error: "+e.getMessage());
            return false;
        }
    }

    @Override
    public boolean eliminar(Object obj) {
        emp = (employee) obj;
        java.sql.Connection con;
        PreparedStatement pst;
        String sql="delete from employee where numberID = ?";
        
        try {
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUss(),
                    db.getPwd()
            ); 
            pst=con.prepareStatement(sql);
            pst.setInt(1,emp.getNumberID());
            
            int filas = pst.executeUpdate();
            if(filas>0){
                con.close();
                return true;
            }
            else{
                con.close();
                return false;
            }
        }catch(SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    " Ocurrio el siguiente error: "+e.getMessage());
            return false;
        }
    }

    @Override
    public boolean modificar(Object obj) {
        emp = (employee) obj;
        java.sql.Connection con;
        PreparedStatement pst;
        String sql="update employee set idType=?,name1=?,name2=?,surname1=?,surname2=?,idMaritalStatus=?,idGender=?,address=?,phone=?,birthDate=? where numberID=? ";
        
        try {
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUss(),
                    db.getPwd()
            ); 
            pst=con.prepareStatement(sql);
            
            pst.setInt(1,emp.getIdType());
            pst.setString(2,emp.getName1());
            pst.setString(3,emp.getName2());
            pst.setString(4,emp.getSurname1());
            pst.setString(5,emp.getSurname2());
            pst.setInt(6,emp.getIdMaritalStatus());
            pst.setInt(7,emp.getIdGender());
            pst.setString(8,emp.getAddress());
            pst.setString(9,emp.getPhone());
            pst.setString(10,emp.getBirthDate());
            pst.setInt(11,emp.getNumberID());
            
            int filas = pst.executeUpdate();
            if(filas>0){
                con.close();
                return true;
            }
            else{
                con.close();
                return false;
            }
        }catch(SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    " Ocurrio el siguiente error: "+e.getMessage());
            return false;
        }
    }

    @Override
    public ArrayList<Object[]> consultar() {
       ArrayList<Object[]> data = new ArrayList<>();
       java.sql.Connection con;
       PreparedStatement pst;
       ResultSet rs;
       String sql = "Select * from employee";
       
       try{
           Class.forName(db.getDriver());
           con=DriverManager.getConnection(
             db.getUrl(),
            db.getUss(),
            db.getPwd()
           );
           pst= con.prepareStatement(sql);
           rs=pst.executeQuery();
           while(rs.next()){
               Object[] fila = new Object[11];
               for(int i=0;i<11;i++){
                   fila[i]=rs.getObject(i+1);
               }
               data.add(fila);  
           }
           con.close();
       }catch(SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,
                    " Ocurrio el siguiente error: "+e.getMessage());
            
       }finally{
           return data;
       }
    }
    
}
